package dawprogramacion.notas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NotasTest {
    Notas notas;

    @BeforeEach
    void notasTest(){
        notas = new Notas();
    }
    @AfterEach
    void borrarObjetoNotas(){
        notas = null;
    }
    @Test
    public void notaNegativaNoPuedeSer(){
        String expected = "La nota no puede ser menos de 0 o mayor de 10";
        double nota = -5.4;
        assertEquals(expected, notas.notaATexto(nota), "Nota negativa no puede ser evaluada");
    }
    
}
