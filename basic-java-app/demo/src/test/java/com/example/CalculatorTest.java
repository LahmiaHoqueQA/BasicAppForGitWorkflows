package test.java.com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        double result = calculator.add(5, 3);
        
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        double result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        double result = calculator.multiply(5, 3);
        assertEquals(15, result);
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(6, 3);
        assertEquals(2, result);
    }

    @Test
    public void testDivisionByZero() {
        Calculator calculator = new Calculator();
        try {
            calculator.divide(5, 0);
        } catch (ArithmeticException e) {
            assertEquals("Division by zero", e.getMessage());
        }
    }
}
