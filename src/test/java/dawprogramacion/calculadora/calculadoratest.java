package dawprogramacion.calculadora;

import static org.junit.Assert.*;
import org.junit.Test;

public class calculadoratest {
    @Test
    public void dosSumarDosEsCuatro() {
        int expected = 4;
        int numero1 = 2, numero2 = 2;
        calculadora calc = new calculadora();

        assertEquals(expected, calc.sumar(numero1, numero2));
    }

    @Test
    public void cincoSumarSieteEsDoce() {
        int expected = 12;
        int numero1 = 5, numero2 = 7;
        calculadora calc = new calculadora();

        assertEquals(expected, calc.sumar(numero1, numero2));
    }

    @Test
    public void tesSumarSieteEsDiez() {
        int expected = 10;
        int numero1 = 3, numero2 = 7;
        calculadora calc = new calculadora();

        assertTrue("Tres mas siete debería ser 10", expected == calc.sumar(numero1, numero2));
    }

    @Test
    public void tesSumarSieteNoEsCien() {
        int expected = 100;
        int numero1 = 3, numero2 = 7;
        calculadora calc = new calculadora();

        assertFalse("Tres mas siete no debería ser 100", expected == calc.sumar(numero1, numero2));
    }

    @Test
    public void tresMultiplicarTresEsNueve() {
        int expected = 9;
        int numero1 = 3, numero2 = 3;
        calculadora calc = new calculadora();

        assertTrue("Tres por tres  debería ser 9", expected == calc.multiplicar(numero1, numero2));
    }
    @Test
    public void nueveDividirTresEsTres(){
        int expected = 3;
        int numero1= 9, numero2 = 3;
        calculadora calc = new calculadora();

        assertTrue("Nueve entre tres debería ser 3", expected == calc.dividir(numero1, numero2));
    }
    @Test
    public void nueveDividirTresEsCuatro(){
        int expected = 4;
        int numero1= 9, numero2 = 3;
        calculadora calc = new calculadora();

        assertFalse("Nueve entre tres debería ser 3", expected == calc.dividir(numero1, numero2));
    }

}
