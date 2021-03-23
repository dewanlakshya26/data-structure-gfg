package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindFactorialTest {

    @Test
    public void rota() {


        long output = new FindFactorial().giveFactorial(100);
        assertEquals(120, output);
    }

    @Test
    public void rotateArrayByRightTest() {
        long output = new FindFactorial().giveFactorial(6);
        assertEquals(120, output);
    }

}