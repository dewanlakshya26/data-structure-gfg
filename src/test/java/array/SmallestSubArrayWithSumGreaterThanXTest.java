package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SmallestSubArrayWithSumGreaterThanXTest {
    @Test
    public void rota() {
        long[] input = {1, 4, 45, 6, 0, 19};

        long output = new SmallestSubArrayWithSumGreaterThanX().sb(input,input.length,51);
        assertEquals(3, output);
    }

    @Test
    public void rotateArrayByRightTest() {
        long output = new FindFactorial().giveFactorial(6);
        assertEquals(120, output);
    }
}