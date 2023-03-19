import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class helloworldTest {
    helloworld obj = new helloworld();
    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 120, obj.factorial(5));
        assertEquals("Finding factorial of a number for True Positive", 24, obj.factorial(4));
    }
}