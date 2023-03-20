import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc = new Calculator();
    
    @Test
    public void testTruePositive(){
	    assertEquals("Finding square root of a number for True Positive", 5.0, calc.squareRoot(25), 0.001);
	    assertEquals("Finding factorial of a number for True Positive", 120, calc.factorial(5));
	    assertEquals("Finding natural logarithm of a number for True Positive", 2.30258509299, calc.naturalLog(10), 0.001);
	    assertEquals("Finding given power of a number for True Positive", 25.0, calc.power(5, 2), 0.001);
    }
}
