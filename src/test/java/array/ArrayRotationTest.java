package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayRotationTest {

    @Test
    public void rotateArrayTest(){
        int[] inputArray = {0,1,2,3,4,5,6};
        int[] expectedArray = {2,3,4,5,6,0,1};
        int[] outputArray = new ArrayRotation().rotateArrayByLeft(inputArray, 2);
        assertArrayEquals(expectedArray, outputArray);
    }

    @Test
    public void rotateArrayByRightTest(){
        int[] inputArray = {1,2,3,4,5,6,7,8};
        int[] expectedArray = {7,8,1,2,3,4,5,6};
        int[] outputArray = new ArrayRotation().rotateArrayByRight(inputArray, 2);
        assertArrayEquals(expectedArray, outputArray);
    }

    @Test
    public void rotateArrayByReversalAlgorithmToLeft(){
        int[] inputArray = {0,1,2,3,4,5,6};
        int[] expectedArray = {2,3,4,5,6,0,1};
        int[] outputArray = new ReversalAlgorithForArrayRotation().rotateArrayByLeft(inputArray, 2);
        assertArrayEquals(expectedArray, outputArray);
    }

    @Test
    public void rotateArrayByReversalAlgorithmToRight(){
        int[] inputArray = {0,1,2,3,4,5,6};
        int[] expectedArray = {5,6,0,1,2,3,4};
        int[] outputArray = new ReversalAlgorithForArrayRotation().rotateArrayByRight(inputArray, 2);
        assertArrayEquals(expectedArray, outputArray);
    }

}