package abb.exercises.exercise12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        assertEquals(3, calculator.add(1, 2));
        assertEquals(0, calculator.add(-1, 1));
        assertEquals(-2, calculator.add(-1, -1));
        assertEquals(4.0, calculator.add(1, 3), 0.01);
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, calculator.subtract(10, 5));
        assertEquals(0, calculator.subtract(-1, -1));
        assertEquals(0, calculator.subtract(1, 1));
        assertEquals(1.0, calculator.subtract(1, 0), 0.01);
    }

    @Test
    public void testMultiplication() {
        assertEquals(21, calculator.multiply(3, 7));
        assertEquals(-1, calculator.multiply(-1, 1));
        assertEquals(1, calculator.multiply(-1, -1));
        assertEquals(3.0, calculator.multiply(1, 3), 0.01);
    }

    @Test
    public void testDivision() {
        assertEquals(5, calculator.divide(10, 2), 0.01);
        assertEquals(-1, calculator.divide(-1, 1), 0.01);
        assertEquals(1, calculator.divide(-1, -1), 0.01);
        assertEquals(1.0, calculator.divide(1, 1), 0.01);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });

        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    public void testAdditionTypes() {
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void testSubtractionTypes() {
        assertEquals(3, calculator.subtract(5, 2));
    }

    @Test
    public void testMultiplicationTypes() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void testDivisionTypes() {
        assertEquals(2.5, calculator.divide(5, 2), 0.01);
    }

    @Test
    public void testDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(5, 0);
        });

        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    public void testNotNull() {
        assertNotNull(calculator.add(1, 2));
        assertNotNull(calculator.subtract(1, 2));
        assertNotNull(calculator.multiply(1, 2));
        assertNotNull(calculator.divide(1, 2));
    }

    @Test
    public void testSameObject() {
        Calculator calc1 = calculator;
        Calculator calc2 = calculator;
        assertSame(calc1, calc2);
    }

    @Test
    public void testNotSameObject() {
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator();
        assertNotSame(calc1, calc2);
    }
}