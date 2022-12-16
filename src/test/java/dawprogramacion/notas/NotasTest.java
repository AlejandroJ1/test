package dawprogramacion.notas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NotasTest {
    @Test
    public void notaNegativaNoPuedeSer(){
        String expected = "La nota no puede ser menos de 0 o mayor de 10";
        double nota = -5.4;
        Notas notas = new Notas();

        assertEquals(expected, notas.notaATexto(nota), "Nota negativa no puede ser evaluada");
    }
    
}
