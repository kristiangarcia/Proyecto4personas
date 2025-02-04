package JueguitoBarco.Test;

import JueguitoBarco.Clases.Barco;
import JueguitoBarco.Clases.Flota;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlotaTest {
    @Test
    public void test1(){
        Flota f1 = new Flota();
        Barco b1 = new Barco(1,2,false,4);
        Barco b2 = new Barco(11,22,true,3);
        Barco b3 = new Barco(111,222,false,2);
        f1.añadirBarco(b1);
        f1.añadirBarco(b2);
        f1.añadirBarco(b3);

        assertEquals(3,f1.getNumeroBarcos());
        assertEquals(3, f1.getNumeroBarcosActivos());
        assertEquals(0,f1.getNumeroBarcosHundidos());
        assertFalse(f1.todosBarcosHundidos());
        assertEquals(b1,f1.getBarco(1,3));
        assertNull(null,f1.getBarco(9,3));

        f1.recibirDisparo(11,22);
        f1.recibirDisparo(12,22);
        f1.recibirDisparo(13,22);

        assertEquals(2,f1.getNumeroBarcosActivos());
        assertEquals(1,f1.getNumeroBarcosHundidos());
        assertFalse(f1.todosBarcosHundidos());

        f1.recibirDisparo(1,2);
        f1.recibirDisparo(1,3);
        f1.recibirDisparo(1,4);
        f1.recibirDisparo(1,5);

        f1.recibirDisparo(111,222);
        f1.recibirDisparo(111,223);
    }
}