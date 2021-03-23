package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindNoOfPairsOfElelmentInArrayWhoseSimIsEqualToKTest {
    @Test
    public void rotateArrayTest(){
        int[] inputArray = {1, 5, 7, 1};

        int output = new FindNoOfPairsOfElelmentInArrayWhoseSimIsEqualToK().getPairsCount(inputArray, inputArray.length,6);
        assertEquals(2, output);
    }

    @Test
    public void rotateArrayByRightTest(){
        int[] inputArray = {1, 1, 1, 1};

        int output = new FindNoOfPairsOfElelmentInArrayWhoseSimIsEqualToK().getPairsCount(inputArray, inputArray.length,2);
        assertEquals(6, output);
    }

}