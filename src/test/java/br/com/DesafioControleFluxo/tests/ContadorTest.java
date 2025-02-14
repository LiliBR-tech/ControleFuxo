package br.com.DesafioControleFluxo.tests;

import br.com.DesafioControleFluxo.application.Contador;
import br.com.DesafioControleFluxo.exception.ParametrosInvalidosException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContadorTest {

    @Test
    public void testContar() throws ParametrosInvalidosException {
        // Teste com parâmetros válidos
        assertDoesNotThrow(() -> Contador.contar(12, 30));
    }

    @Test
    public void testParametrosInvalidos() {
        // Teste quando o primeiro parâmetro é maior que o segundo
        Exception exception = assertThrows(ParametrosInvalidosException.class, () -> {
            Contador.contar(30, 12);
        });
        assertEquals("O segundo parâmetro deve ser maior que o primeiro", exception.getMessage());
    }
}