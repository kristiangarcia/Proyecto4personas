package JueguitoBarco.Test;

import JueguitoBarco.Clases.Barco;
import JueguitoBarco.Clases.Flota;
import JueguitoBarco.Clases.Tablero;
import org.junit.Test;

import static org.junit.Assert.*;

public class TableroTest {
    @Test
    public void ConstructorPrincipalTest(){
        Tablero tablero = new Tablero(9, 8);
        //Comprobaciones de tamaño del tablero
        assertEquals(9, tablero.getTotalFilas());
        assertEquals(8, tablero.getTotalColumnas());

        //Añadimos un barco a la flota
        Flota flota = new Flota();
        Barco barco = new Barco(1, 2, true, 3);
        flota.añadirBarco(barco);
        assertEquals('.', flota.getBarco(2, 1).getEstado(2, 1));
        assertEquals('B', flota.getBarco(2, 2).getEstado(2, 2));

        //Disparamos
        flota.recibirDisparo(2, 2);
        assertEquals('*', flota.getBarco(2, 2).getEstado(2, 2));

        for(int i = 2;i<barco.getTamaño();i++){
            flota.recibirDisparo(i, 2);
        }

        assertEquals('X', flota.getBarco(2, 2).getEstado(2, 2));

        //Método dibujar
        System.out.println("Tablero true: ");
        tablero.dibujar(true);
        System.out.println("Tablero false: ");
        tablero.dibujar(false);
    }

    @Test
    public void DibujarTest(){
        Tablero tablero = new Tablero(9, 8);
        Flota flota = new Flota();
        Barco barco = new Barco(1, 2, true, 3);
        Barco barco2 = new Barco(5, 5, false, 4);

        tablero.dibujar(true);

    }
}