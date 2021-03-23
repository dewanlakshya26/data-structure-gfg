package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimizingTheMaximumDifferenceBEtweenHeightsTest {

    @Test
    public void rotateArrayTest(){
        int[] inputArray = {1, 5, 8, 10};

        int output = new MinimizingTheMaximumDifferenceBEtweenHeights().findDiff(inputArray, inputArray.length,2);
        assertEquals(5, output);
    }

    @Test
    public void rotateArrayByRightTest(){
        int[] inputArray = {3, 9, 12, 16, 20};

        int output = new MinimizingTheMaximumDifferenceBEtweenHeights().findDiff(inputArray, inputArray.length,3);
        assertEquals(11, output);
    }
    @Test
    public void rotateArrayByRightTest1(){
        int[] inputArray = {1,10,14,15};

        int output = new MinimizingTheMaximumDifferenceBEtweenHeights().findDiff(inputArray, inputArray.length,6);
        assertEquals(2, output);
    }
}