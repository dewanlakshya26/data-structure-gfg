package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortArrayValues0_1_2Test {


    @Test
    public void rotateArrayTest(){
        int[] inputArray = {0, 2, 1, 2 ,0};
        int[] expectedArray = {0, 0, 1, 2 ,2};
        int[] outputArray = new SortArrayValues0_1_2().sort(inputArray, inputArray.length);
        assertArrayEquals(expectedArray, outputArray);
    }

    @Test
    public void rotateArrayByRightTest(){
        int[] inputArray = {1,2,3,4,5,6,7,8};
        int[] expectedArray = {7,8,1,2,3,4,5,6};
        int[] outputArray = new SortArrayValues0_1_2().sort(inputArray, inputArray.length);
        assertArrayEquals(expectedArray, outputArray);
    }

}