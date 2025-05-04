import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
CalculatorTest calculator = new CalculatorTest();
    @Test
    void add() {
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    void dif() {
        assertEquals(0, calculator.dif(1, 1));
    }

    @Test
    void div() {
        assertEquals(5, calculator.div(5, 1));
    }

    @Test
    void times() {
        assertEquals(2, calculator.times(2, 1));
    }

    @Test
    void solver() {
        assertEquals(2, calculator.solver(2, 4));
    }
}
