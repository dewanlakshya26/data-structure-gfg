package array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindDupligateWithoutUsingExtraSpaceTest {


    @Test
    public void rota() {
        int[] input = {3, 1, 3, 4, 2};

        long output = new FindDupligateWithoutUsingExtraSpace().getNumWithFlag(input);
        assertEquals(3, output);
    }

    @Test
    public void rotateArrayByRightTest() {
        long output = new FindFactorial().giveFactorial(6);
        assertEquals(120, output);
    }
}

