package JueguitoBarco.Clases;

public class Barco {
    // VARIABLES DE INSTACIA
    private int fila;
    private int columna;
    private boolean vertical;
    private boolean[] daño;

    // CONSTRUCTOR
    public Barco(int fila, int columna, boolean orientacion, int tamaño){
        this.fila = fila;
        this.columna = columna;
        this.vertical = orientacion;

        this.daño = new boolean[tamaño];
        for (int i = 0; i < tamaño; i++){
            this.daño[i] = false;
        }
    }

    // MÉTODOS
    public int getFila(){
        return this.fila;
    }

    public int getColumna(){
        return this.columna;
    }

    public int getTamaño(){
        return this.daño.length;
    }

    public boolean esVertical(){
        return this.vertical;
    }

    public boolean estaHundido(){
        boolean recorrerBarcos = false;
        for (Boolean barcos : this.daño){
            recorrerBarcos = barcos;
        }
        return recorrerBarcos;
    }

    public boolean hayBarco(int fila, int columna){
        if (this.vertical) {
            return (columna == this.columna && fila >= this.fila && fila < this.fila + daño.length);
        } else {
            return (fila == this.fila && columna >= this.columna && columna < this.columna + daño.length);
        }
    }

    public int recibirDisparo(int fila, int columna){
        int valor = 0;
        int num = 0;
        if (!this.hayBarco(fila, columna)){
            valor = -1;
        } else if (this.hayBarco(fila, columna)) {
            for (int i = 0; i < this.daño.length; i++){
                this.daño[i] = true;
                valor = 1;
                num++;
            }
            if (num == this.daño.length){
                valor = 2;
            }
        }
        return 2;
    }

    public int getEstado(int fila, int columna){
        int valor = 0;
        int num = 0;
        if (!this.hayBarco(fila, columna)){
            valor = -1;
        } else if (this.hayBarco(fila, columna)) {
            for (Boolean pos : this.daño){
                if (!pos){
                    valor = 0;
                }
                else {
                    valor = 1;
                    num++;
                }
            }
            if(num == this.daño.length){
                valor = 2;
            }
        }
        return valor;
    }
}
