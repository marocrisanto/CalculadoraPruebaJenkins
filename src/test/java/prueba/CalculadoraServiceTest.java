package prueba;
import calculadora.Calculadora;
import calculadora.CalculadoraService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculadoraServiceTest {

    private CalculadoraService calculadoraService;
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    void setUp() {
        calculadoraService = new CalculadoraService();
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void mostrarSuma() {
        Calculadora calculadora = new Calculadora(5, 3);
        calculadoraService.mostrarSuma(calculadora);
        assertTrue(outputStream.toString().contains("La suma de los números es: 8"));
    }

    @Test
    void mostrarResta() {
        Calculadora calculadora = new Calculadora(5, 3);
        calculadoraService.mostrarResta(calculadora);
        assertTrue(outputStream.toString().contains("La suma de los números es: 2"));
    }

    @Test
    void mostrarMultiplicacion() {
        Calculadora calculadora = new Calculadora(5, 3);
        calculadoraService.mostrarMultiplicacion(calculadora);
        assertTrue(outputStream.toString().contains("La multiplicacion de los números es: 15"));
    }

    @Test
    void mostrarDivision() {
        Calculadora calculadora = new Calculadora(6, 3);
        calculadoraService.mostrarDivision(calculadora);
        assertTrue(outputStream.toString().contains("La división de los números es: 2"));
    }
}
