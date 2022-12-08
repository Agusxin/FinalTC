package FinalTC.TablaSimbolos;

public class Variable extends ID {

    public Variable() {}

    public Variable(String nombre, String tipo, Boolean inicializado) {
        super.setNombre(nombre);
        super.setTipo(tipo);
        super.setInicializada(inicializado);
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
