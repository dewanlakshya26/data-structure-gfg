package array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeOverlapingIntervalAndReturnAnArrayOfNonOverlappingIntervalTest {
    @Test
    public void rotateArrayTest(){
        int[][] inputArray = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        int[][] outputArray = new int[][]{{1,6},{8,10},{15,18}};

        int[][] output = new MergeOverlapingIntervalAndReturnAnArrayOfNonOverlappingInterval().merge(inputArray);
        assertArrayEquals(outputArray, output);
    }

    @Test
    public void rotateArrayByRightTest(){
        int[][] inputArray = new int[][]{{1,4},{4,5}};
        int[][] outputArray = new int[][]{{1,5}};

        int[][] output = new MergeOverlapingIntervalAndReturnAnArrayOfNonOverlappingInterval().merge(inputArray);
        assertArrayEquals(outputArray, output);
    }

    @Test
    public void rotateArrayByRightTest1(){
        int[][] inputArray = new int[][]{{1,4},{0,4}};
        int[][] outputArray = new int[][]{{0,4}};

        int[][] output = new MergeOverlapingIntervalAndReturnAnArrayOfNonOverlappingInterval().merge(inputArray);
        assertArrayEquals(outputArray, output);
    }
}