package FinalTC.TablaSimbolos;

import java.util.LinkedList;

public class Funcion extends ID {

    LinkedList<ID> parametros;


    public Funcion(String tipo, String nombre, LinkedList<ID> parametros) {
        super.setTipo(tipo);
        super.setNombre(nombre);
        this.parametros = parametros;
    }

    @Override
    public String toString() {
        String tipo = this.getTipo();
        String nombre = this.getNombre();
        Boolean inicializada = this.isInicializada();
        Boolean usada = this.isUsado();
        LinkedList<ID> parametros = this.parametros;
        return "[" + tipo + " " + nombre + "]" + " Función inicializada: " + inicializada + " -Es usada: " + usada + " Tipos de sus parametros: " + parametros;
    }

}

/* 
  String funcion = this.getTipo() + " " + this.getNombre() + "(";
        Iterator<ID> it = this.parametros.iterator();

        int i = 0;
        while(it.hasNext()) {
            ID next = it.next();

            if (i != 0) funcion += ", " + next.getTipo() + " " + next.getNombre();
            else funcion += next.getTipo() + " " + next.getNombre();

            i++;
        }

        funcion += ")";

        if(this.isInicializado()) {
            funcion += " [funcion inicializada]";
        }
        else {
            funcion += " [funcion no inicializada]";
        }

        return funcion;
    }
    */