package ec.epn.edu.git.calculator;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c;
    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass()");
    }

    @Before
    public void setUp(){
        System.out.println("SetUP");
        c    = new Calculator();
    }

    @Test
    public void given_two_integers_when_add_then_ok(){
        System.out.println("Test 1");
        assertEquals(6, c.addition(3,3));
    }

    @Test
    public void given_two_integers_when_substraction_then_ok(){
        System.out.println("Test 2");
        assertEquals(6, c.substraction(8,2));
    }

    @Test
    public void given_two_integers_when_div_then_ok(){
        System.out.println("Test 3");
        assertEquals(6, c.div(24,4));
    }

    @Test
    public void given_two_integers_when_mult_then_ok(){
        System.out.println("Test 1");
        assertEquals(6, c.mult(2,3));
    }

}