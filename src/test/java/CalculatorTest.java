import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        Assertions.assertEquals(3, calculator.add(-1, 4));
    }

    @Test
    void dif() {
        Assertions.assertEquals(-3, calculator.dif(5, 8));
    }

    @Test
    void div() {
        Assertions.assertEquals(6, calculator.div(18, 3));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.div(7, 0));
    }

    @Test
    void times() {
        Assertions.assertEquals(8, calculator.times(2, 4));
    }

    @Test
    void solver() {
        Assertions.assertEquals(2, calculator.solver(2, -4));
    }
}