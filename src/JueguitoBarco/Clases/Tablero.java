package JueguitoBarco.Clases;

public class Tablero {
    //Variables de instancia
    private int totalFilas;
    private int totalColumnas;
    private Flota flota;

    //Constructor
    public Tablero(int f, int c){ //Constructor principal
        throw new UnsupportedOperationException("Class not programing");
    }

    public Tablero(int n){ //Constructor secundario ligado al principal (1)
        throw new UnsupportedOperationException("Class not programing");
    }

    public Tablero(){ //Constructor secundario (2)
        throw new UnsupportedOperationException("Class not programing");
    }

    //Métodos
    public void dibujar(boolean mostrarBarcos){
        throw new UnsupportedOperationException("Not programing void");
    }

    //Getters
    public int getTotalFilas(){
        return this.totalFilas;
    }

    public int getTotalColumnas(){
        return this.totalColumnas;
    }

    public Flota getFlota(){
        return this.flota;
    }

    public char getEstado(int f, int c){
        throw new UnsupportedOperationException("Getter not programing");
    }
}
