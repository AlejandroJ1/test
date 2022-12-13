package dawprogramacion.calculadora;

import static org.junit.Assert.*;
import org.junit.Test;

public class calculadoratest {
    @Test
    public void dosSumarDosEsCuatro(){
        int expected = 4;
        int numero1 = 2, numero2 = 2;
        calculadora calc = new calculadora();
        
        assertEquals(expected,calc.sumar(numero1, numero2));
    }
    public void cincoSumarSieteEsDoce(){
        int expected = 12;
        int numero1 = 5, numero2 = 7;
        calculadora calc = new calculadora();
        
        assertEquals(expected,calc.sumar(numero1, numero2));
    }
    
}
