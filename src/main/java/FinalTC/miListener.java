package FinalTC;

import java.util.LinkedList;

import FinalTC.TablaSimbolos.*;
import FinalTC.programaParser.AsignacionContext;
import FinalTC.programaParser.Asignacion_simpleContext;
import FinalTC.programaParser.BloqueContext;
import FinalTC.programaParser.DeclaracionContext;
import FinalTC.programaParser.Definicion_funcionContext;
import FinalTC.programaParser.FactorContext;
import FinalTC.programaParser.Llamada_funcionContext;
import FinalTC.programaParser.Parametros_funcionContext;
import FinalTC.programaParser.ProgramaContext;


public class miListener extends programaBaseListener {

    private TablaSimbolos simbolTable;
    private LinkedList<ID> functionParams;
   
    public miListener() {
        simbolTable = TablaSimbolos.getInstance();
        functionParams = new LinkedList<ID>();
    }

    @Override
    public void enterPrograma(ProgramaContext ctx) {
        System.out.println("\n[Inicio del análisis de las IDs usadas y declaradas]\n");
    }

    
    @Override
    public void enterBloque(BloqueContext ctx) {
        System.out.print("[Inicio de Bloque]\n");
        this.simbolTable.addContext();
    }

    
    @Override
    public void exitDeclaracion(DeclaracionContext ctx) {
        
        String tipo = ctx.tipo_de_datos().getText();
        String nombre = ctx.ID().getText();
        ID searchID = new ID(tipo, nombre);

        if(this.simbolTable.searchId(searchID) != null  ){
            ErrorListener.printError(ctx.getStop().getLine(), "Doble declaración de: [" + tipo + " " + nombre + "]");
        } 
        
        

        Asignacion_simpleContext verificarChilds = ctx.asignacion_simple();


        if(verificarChilds.getChildCount() == 0){
            ID id = new ID(nombre, tipo, true);
            simbolTable.addId(id);
        }


        while(verificarChilds.getChildCount() != 0){
             
            if(verificarChilds.getChild(0).getText().equals("=")){
                ID id = new ID(nombre, tipo, true);
                simbolTable.addId(id);
            }
            if(verificarChilds.getChild(0).getText().equals(",")){
                ID id = new ID(nombre, tipo, false);
                simbolTable.addId(id);
            }
            verificarChilds = verificarChilds.asignacion_simple();
        }
        
    }

    @Override
    public void exitAsignacion(AsignacionContext ctx) {
    
        ID searchID = new ID(ctx.ID().getText(), "");

        if( this.simbolTable.searchId(searchID) == null ){
            ErrorListener.printError(ctx.getStop().getLine(), "Uso de ID no declarado: [" + searchID.getNombre() + "]");
            return;
        }

        searchID.setInicializada(true);
    }


    @Override
    public void exitParametros_funcion(Parametros_funcionContext ctx) {
        if(ctx.getChildCount() != 0){
            if(ctx.ID() != null){
                ID id = new ID(ctx.ID().getText(), ctx.tipo_de_datos().getText(), true);
                this.functionParams.add(id);
            }
        }
    }


    @Override
    public void exitDefinicion_funcion(Definicion_funcionContext ctx) {
         
        ID searchID = new ID(ctx.ID().getText(), ctx.tipo_de_funcion().getText());

        if(this.simbolTable.searchId(searchID) != null){
            
            ErrorListener.printError(ctx.getStop().getLine(), "Doble declaración de función: [" + searchID.getTipo() + " " + searchID.getNombre() + "]");
            return;
        }

        Funcion funcion = new Funcion(searchID.getTipo(), searchID.getNombre(), functionParams);
        this.simbolTable.addId(funcion);
        this.functionParams.clear();
    }


    @Override
    public void exitLlamada_funcion(Llamada_funcionContext ctx) {
       ID searchID = new ID(ctx.ID().getText(), "");
       ID searched = this.simbolTable.searchId(searchID);
       if(searched == null){
        ErrorListener.printError(ctx.getStop().getLine(), "Uso de Función no declarada: [" + searchID.getNombre() + "]");
        return;
       }else{
          searched.setUsado(true);
       }
    }

    @Override
    public void exitFactor(FactorContext ctx) {
        
        if(ctx.ID() != null){
            ID searchID = new ID(ctx.ID().getText(), "");
            ID searched = this.simbolTable.searchId(searchID);

            if(searched  == null){
                ErrorListener.printError(ctx.getStop().getLine(), "Uso de ID no declarado: [" + searchID.getNombre() + "]");
            }else{
               if(!searched.isInicializada()){
                ErrorListener.printError(ctx.getStop().getLine(), "Uso de ID no inicializado: [" + searchID.getNombre() + "]");
               }else{
                 searched.setUsado(true);
               }
            }
        }
        return;
    }

    @Override
    public void exitPrograma(ProgramaContext ctx) {
        System.out.println(this.simbolTable.toString());
    }

}
