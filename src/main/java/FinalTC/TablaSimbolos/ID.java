package FinalTC.TablaSimbolos;

public class ID {


    private String nombre_token;
    private String tipo_Dato;
    private Boolean usada;
    private Boolean inicializada;

    public ID() {}

    public ID(String nombre, String tipo) {
        this.nombre_token = nombre;
        this.tipo_Dato = tipo;
        this.usada = false;
        this.inicializada = false;
    }

    
    public ID(String nombre, String tipo, Boolean inicializado) {
        this.nombre_token = nombre;
        this.tipo_Dato= tipo;
        this.inicializada = inicializado;
    }

    /* 
    public ID(String nombre, String tipo, Boolean usada){
        this.nombre_token = nombre;
        this.tipo_Dato = tipo;
        this.usada =  usada;
        this.inicializada = false;
    }
    */
    
    public Boolean isInicializada() {
        return inicializada;
    }

    public void setInicializada(Boolean inicializada) {
        this.inicializada = inicializada;
    }

    public String getNombre() {
        return this.nombre_token;
    }

    public void setNombre(String nombre) {
        this.nombre_token = nombre;
    }

    public String getTipo() {
        return this.tipo_Dato;
    }

    public void setTipo(String tipo) {
        this.tipo_Dato = tipo;
    }

    public Boolean isUsado() {
        return this.usada;
    }

    public void setUsado(Boolean usado) {
        this.usada = usado;
    }


    @Override
    public String toString() {
        String tipo = this.getTipo();
        String nombre = this.getNombre();
        Boolean inicializada = this.isInicializada();
        Boolean usada = this.isUsado();
        return "[" + tipo + " " + nombre + "]" + " Variable inicializada: " + inicializada + " -Es usada: " + usada;    
    }
}
