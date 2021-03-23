package array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MoveAllNegativeElementsToOneSideOfArrayTest {

    @Test
    public void rotateArrayTest() {
        int[] inputArray = {1,5,4,-1,-3,-1,-1,2};
        int[] expectedArray = {-1, -1, -3, -1};
        int[] outputArray = new MoveAllNegativeElementsToOneSideOfArray().move(inputArray, inputArray.length );
        System.out.println(Arrays.toString(outputArray));
        assertArrayEquals(expectedArray, Arrays.copyOfRange(outputArray,0,4));
    }

    @Test
    public void rotateArrayByRightTest() {
        int[] inputArray = {0, 1, -1, 3, 0, 5, -1};
        int[] expectedArray = {-1,-1};
        int[] outputArray = new MoveAllNegativeElementsToOneSideOfArray().move(inputArray, inputArray.length);
        System.out.println(Arrays.toString(outputArray));
        assertArrayEquals(expectedArray, Arrays.copyOfRange(outputArray,0,2));
    }

}