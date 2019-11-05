package calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc;
    @Before
    public void before(){
         calc = new Calculator();
    }
    @Test
    public void addTest(){

        assertEquals(44, calc.add(22,22));
    }
    @Test
    public void subtractTest(){

        assertEquals(28, calc.substract(50,22));
    }
    @Test
    public void mutiplyTest(){
        assertEquals(484, calc.multiply(22,22));
    }
    @Test
    public void divideTest(){
        assertEquals(1, calc.divide(22,22));
    }

}
