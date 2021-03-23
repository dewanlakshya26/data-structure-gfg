package array.mustDoArray;

import array.ReverseTheArray;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMAximumAndMinimumWithinArrayTest {

    @Test
    public void rotateArrayTest() {
        int[] inputArray = {0, 1, 2,6,6,6,6, 3, 4, 5, 6};

        Size s = new FindMaximumAndMinimumWithinAnArray().find(inputArray);
       assertEquals(s.minimum,0);
       assertEquals(s.maximum,6);
    }

    @Test
    public void rotateArrayByRightTest() {
        int[] inputArray = {0, 1, -1, 3, 4, 5, 8};
        Size s = new FindMaximumAndMinimumWithinAnArray().find(inputArray);

        assertEquals(s.minimum,-1);
        assertEquals(s.maximum,8);
    }

}