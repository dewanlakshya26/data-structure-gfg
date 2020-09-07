package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindSumOfArrayInSortedAndThenRotatedArrayTest {

    @Test
    public void find(){
        int[] inputArray = {3,4,5,6,7,0,1,2};
        int outputCount = new FindSumOfArrayInSortedAndThenRotatedArray().findSortedAndRotatedArray(inputArray, 7, 8);
        assertEquals(4, outputCount);
    }

    @Test
    public void find2(){
        int[] inputArray = {3,4,5,6,7,0,1,2};
        int outputCount = new FindSumOfArrayInSortedAndThenRotatedArray().findSortedAndRotatedArray(inputArray, 9, 8);
        assertEquals(3, outputCount);
    }

}