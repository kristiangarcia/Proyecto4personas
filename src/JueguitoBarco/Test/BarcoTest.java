package JueguitoBarco.Test;

import JueguitoBarco.Clases.Barco;
import org.junit.Test;

import static org.junit.Assert.*;

public class BarcoTest {
    @Test
    public void test1(){
        Barco barco = new Barco(1, 2, true, 4);

        assertEquals(1, barco.getFila());
        assertEquals(2, barco.getColumna());
        assertEquals(4, barco.getTamaño());
        assertTrue(barco.esVertical());
        assertFalse(barco.estaHundido());

        assertFalse(barco.hayBarco(0, 1));

        assertTrue(barco.hayBarco(3,1));

        assertEquals(1, barco.recibirDisparo(4,5));

        assertEquals(0, barco.recibirDisparo(4,5));
    }

    @Test
    public void test2(){
        Barco barco = new Barco(1, 2, true, 4);

        assertEquals(1, barco.recibirDisparo(1,2));
        assertEquals(1, barco.recibirDisparo(2,2));
        assertEquals(1, barco.recibirDisparo(3,2));
        assertEquals(2, barco.recibirDisparo(4,2));

        assertTrue(barco.estaHundido());
    }

    @Test
    public void test3(){
        Barco barco = new Barco(2, 1, false, 4);

        assertEquals(2, barco.getFila());
        assertEquals(1, barco.getColumna());
        assertEquals(4, barco.getTamaño());
        assertFalse(barco.esVertical());
        assertFalse(barco.estaHundido());

        assertFalse(barco.hayBarco(0, 1));
        assertTrue(barco.hayBarco(2,3));

        assertEquals(1, barco.recibirDisparo(2, 1));
        assertEquals(-1, barco.recibirDisparo(4, 5));
    }

    @Test
    public void test4(){
        Barco barco = new Barco(2, 1, false, 4);

        assertEquals(1, barco.recibirDisparo(2,1));
        assertEquals(1, barco.recibirDisparo(2,2));
        assertEquals(1, barco.recibirDisparo(2,3));
        assertEquals(2, barco.recibirDisparo(2,4));

        assertTrue(barco.estaHundido());
    }


}