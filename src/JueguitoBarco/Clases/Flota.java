package JueguitoBarco.Clases;

import java.util.ArrayList;
import java.util.List;

public class Flota {
    private List<Barco> barquitos;

    public Flota(){
        this.barquitos = new ArrayList<>(0);
    }

    public void añadirBarco(Barco b){
        this.barquitos.add(b);
    }
    public int getNumeroBarcos(){
        return this.barquitos.size();
    }
    public int getNumeroBarcosActivos(){
        int contador = 0;
        for (Barco barco : this.barquitos){
            if (!barco.estaHundido()){
                contador++;
            }
        }
        return contador;
    }
    public int getNumeroBarcosHundidos(){
        int contador = 0;
        for (Barco barco : this.barquitos){
            if (barco.estaHundido()){
                contador++;
            }
        }
        return contador;
    }
    public boolean todosBarcosHundidos(){
        int contador = 0;
        for (Barco barco : this.barquitos){
            if (barco.estaHundido()){
                contador++;
            }
        }
        return contador == this.barquitos.size();
    }
    public Barco getBarco(int f, int c){
        Barco b = null;
        for (Barco barco : this.barquitos){
            if (barco.hayBarco(f,c)){
                b = barco;
            }
        }
        return b;
    }
    public int recibirDisparo(int f, int c){
        throw new UnsupportedOperationException("La clase no esta programada");
    }
}
