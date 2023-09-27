package prueba;

import calculadora.Calculadora;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSumar() {
        calculadora.setNumero1(5);
        calculadora.setNumero2(3);
        assertEquals(8, calculadora.sumar());
    }

    @Test
    public void testRestar() {
        calculadora.setNumero1(5);
        calculadora.setNumero2(3);
        assertEquals(2, calculadora.restar());
    }

    @Test
    public void testMultiplicar() {
        calculadora.setNumero1(5);
        calculadora.setNumero2(3);
        assertEquals(15, calculadora.multiplicar());
    }

    @Test
    public void testMultiplicarPorCero() {
        calculadora.setNumero1(5);
        calculadora.setNumero2(0);
        assertEquals(0, calculadora.multiplicar());
    }

    @Test
    public void testDividir() {
        calculadora.setNumero1(6);
        calculadora.setNumero2(3);
        assertEquals(2, calculadora.dividir());
    }

    @Test
    public void testDividirPorCero() {
        calculadora.setNumero1(6);
        calculadora.setNumero2(0);
        assertEquals(0, calculadora.dividir());
    }
}
