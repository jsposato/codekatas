package test.com.sposato.Calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

import com.sposato.Calculator.Calculator;


/**
 * Calculator Tester.
 *
 * @author John Sposato
 * @version 1.0
 * @since <pre>Jun 23, 2015</pre>
 */
public class CalculatorTest {

    public Calculator calc = new Calculator();

    @Before
    public void before() throws Exception {

    }

    @After
    public void after() throws Exception {

    }

    @Rule
    public ExpectedException thrown= ExpectedException.none();

    /**
     * Method: add(Integer x, Integer y)
     */
    @Test
    public void testAdd() throws Exception {
        Integer result = calc.add(4, 4);

        assertTrue(result == 8);
    }

    /**
     * Method: multiply(Integer x, Integer y)
     */
    @Test
    public void testMultiply() throws Exception {
        Integer result = calc.multiply(4, 4);

        assertTrue(result == 16);
    }

    /**
     * Method: subtract(Integer x, Integer y)
     */
    @Test
    public void testSubtract() throws Exception {
        Integer result = calc.subtract(4, 4);

        assertTrue(result == 0);
    }

    /**
     * Method: divide(Integer x, Integer y)
     */
    @Test
    public void testDivide() throws Exception {
        Integer result = calc.divide(4, 4);

        assertTrue(result == 1);
    }

    /**
     * Method divide(Integer x, Integer y)
     * @throws ArithmeticException
     */
    @Test
    public void testDivideByZero() throws Exception {
        Integer result = calc.divide(4, 0);
        assertTrue(result == -1);

    }
} 
