package array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
//time complexity  - O(N)
//space complexity - O(!)

public class CycliRotateArrayByOneTest {
    @Test
    public void rotateArrayTest() {
        int[] inputArray = {1, 2, 3, 4, 5};
        int[] expected = {5, 1, 2, 3, 4};
        int[] output = new CycliRotateArrayByOne().rotate(inputArray, inputArray.length);
        System.out.println(Arrays.toString(output));
        assertArrayEquals(expected, output);
    }

    @Test
    public void rotateArrayByRightTest() {
        int[] inputArray = {9, 8, 7, 6, 4, 2, 1, 3};
        int[] expected = {3, 9, 8, 7, 6, 4, 2, 1};
        int[] output = new CycliRotateArrayByOne().rotate(inputArray, inputArray.length);
        assertArrayEquals(expected, output);
    }
}