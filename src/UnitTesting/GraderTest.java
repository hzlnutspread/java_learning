package UnitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    // If there are multiple scenarios (if statements) create separate tests for them all
    // Never combine scenarios

    // Add more edge cases so we can be sure the code is not returning a false positive

    @Test
    void fiftyNineShouldReturnF() {
        var grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(59));
    }
    // Running test with coverage shows us which lines of code were executed when the test was run

    @Test
    void sixtyNineShouldReturnD() {
        var grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(69));
    }

    @Test
    void seventyNineShouldReturnC() {
        var grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(79));
    }

    @Test
    void eightyNineShouldReturnC() {
        var grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(89));
    }

    @Test
    void ninetyNineShouldReturnC() {
        var grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(99));
    }

    @Test
    void negativeNineShouldReturnIllegalArgumentException() {
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    grader.determineLetterGrade(-1);        //When this piece of code is executed, it throws the exception
                });
    }

}