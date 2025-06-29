import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        calculator calc = new calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        calculator calc = new calculator();
        assertEquals(1, calc.subtract(3, 2));
    }
}
