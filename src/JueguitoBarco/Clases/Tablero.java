package JueguitoBarco.Clases;

public class Tablero {
    //Variables de instancia
    private int totalFilas;
    private int totalColumnas;
    private Flota flota;

    //Constructor
    public Tablero(int f, int c){ //Constructor principal (0)
        this.totalFilas = f;
        this.totalColumnas = c;
        this.flota = new Flota();
        //Si el tablero no tiene tamaño mínimo 7x7 lanza error
        if(this.totalFilas<7 || this.totalColumnas<7){
            throw new IllegalArgumentException("Tamaño del tablero insuficiente (Minimo 7x7)");
        }
    }

    public Tablero(int n){ //Constructor secundario ligado al principal (1) ligado al *0
        this(n, n);
    }

    public Tablero(){ //Constructor secundario (2) ligado al *1
        this(7);
    }

    //Métodos
    public void dibujar(boolean mostrarBarcos){
        char[][] tabla = new char[this.getTotalFilas()][this.getTotalColumnas()];
        String dibujo = "";
        for(int i = 0;i<this.getTotalFilas();i++){
            for(int j= 0;j<this.getTotalColumnas();j++){
                if(!mostrarBarcos && this.getEstado(i, j)=='B'){
                    dibujo+='.';
                }else{
                    dibujo+=this.getEstado(i, j);
                }
            }
        }
        System.out.println(dibujo);
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
        return this.getFlota().getBarco(f, c).getEstado(f, c)== -1? '.' :
                this.getFlota().getBarco(f, c).getEstado(f, c)== 0? 'B' :
                this.getFlota().getBarco(f, c).getEstado(f, c)== 1? '*': 'X';
    }
}
