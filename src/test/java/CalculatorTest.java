import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void add() {
 kryatenkova
        assertEquals(5, calculator.add(2, 3));
=======
        assertEquals(2, calculator.add(1, 1));
main
    }

    @Test
    void dif() {
 kryatenkova
        assertEquals(1, calculator.dif(3, 2));
=======
        assertEquals(0, calculator.dif(1, 1));
 main
    }

    @Test
    void div() {
 kryatenkova
        assertEquals(6, calculator.times(2, 3));
=======
        assertEquals(5, calculator.div(1, 5));
 main
    }

    @Test
    void times() {
 kryatenkova
        assertEquals(2, calculator.div(6, 3));
=======
        assertEquals(2, calculator.times(2, 1));
 main
    }

    @Test
    void solver() {
 kryatenkova
        assertEquals(-2, calculator.solver(4,8));
=======
        assertEquals(2, calculator.solver(2, 4));
      main
    }
}