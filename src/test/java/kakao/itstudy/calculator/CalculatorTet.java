package kakao.itstudy.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTet {
    private Calculator calculator = new Calculator();

    @Test
    public void testSum(){
        assertEquals(5, calculator.sum(2, 3));
    }
}
