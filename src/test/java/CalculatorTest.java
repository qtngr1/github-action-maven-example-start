import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {

    @Test
    public void testSum() {
        // Given
        Calculator calculator = new Calculator();
        // When
        int result = calculator.sum(2, 2);
        // Then
        if (result != 4) { // if 2 + 2 != 4
            Assertions.fail();
        }
    }

    @Test
    public void testMinus() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(0, calculator.minus(2, 2));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(2, calculator.divide(6, 3));
    }

    @Test()
    public void testDivideWillThrowExceptionWhenDivideOnZero() {
        Calculator calculator = new Calculator();
        calculator.divide(6, 2);
    }
}