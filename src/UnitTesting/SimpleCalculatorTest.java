package UnitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    // Should add more than one scenario to our unit test suite

    @Test
    void twoPlusTwoShouldEqualFour() {
        var calculator = new SimpleCalculator();
        assertEquals(4, calculator.add(2, 2));          // Use an assert statement that the result is equal to 4
        assertTrue(calculator.add(2, 2) == 4);
        // assertNotEquals();
        // assertTrue();
        // assertFalse();
        // assertNull();
        // assertNotNull();
    }                                                   // Tells us exactly what went wrong

    @Test
    void threePlusSevenShouldEqualTen() {
        var calculator = new SimpleCalculator();
        assertEquals(10, calculator.add(3, 7));

    }
}