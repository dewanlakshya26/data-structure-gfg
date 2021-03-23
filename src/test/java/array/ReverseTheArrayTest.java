package array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReverseTheArrayTest {

    @Test
    public void rotateArrayTest() {
        int[] inputArray = {0, 1, 2, 3, 4, 5, 6};
        int[] expectedArray = {6, 5, 4, 3, 2, 1, 0};
        int[] outputArray = new ReverseTheArray().reverseArray(inputArray);
        assertArrayEquals(expectedArray, outputArray);
    }

    @Test
    public void rotateArrayByRightTest() {
        int[] inputArray = {0, 1, -1, 3, 4, 5, 8};
        int[] expectedArray = {8, 5, 4, 3, -1, 1, 0};
        int[] outputArray = new ReverseTheArray().reverseArray(inputArray);
        assertArrayEquals(expectedArray, outputArray);
    }


}