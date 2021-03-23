package array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindUnionBetweenArrayTest {

    @Test
    public void rotateArrayTest() {
        int[] inputArray = {1, 2, 3, 4, 5};
        int[] inputArray2 = {1, 2, 3};
        int output = new FindUnionBetweenArray().findUnion(inputArray, inputArray2);
        assertEquals(5, output);
    }

    @Test
    public void rotateArrayByRightTest() {
        int[] inputArray = {85, 25, 1, 32, 54, 6};
        int[] inputArray2 = {85, 2};
        int output = new FindUnionBetweenArray().findUnion(inputArray, inputArray2);
        assertEquals(7, output);
    }


}