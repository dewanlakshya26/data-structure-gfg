package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumNoOfJumpsRequiredToReachEndOfArrayTest {

    @Test
    public void rotateArrayTest(){
        int[] inputArray = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };

        int output = new MinimumNoOfJumpsRequiredToReachEndOfArray().minJumps(inputArray, inputArray.length);
        assertEquals(2, output);
    }

    @Test
    public void rotateArrayByRightTest(){
        int[] inputArray = {1 ,4 ,3 ,2, 6, 7};

        int output = new MinimumNoOfJumpsRequiredToReachEndOfArray().minJumps(inputArray, inputArray.length);
        assertEquals(2, output);
    }
}