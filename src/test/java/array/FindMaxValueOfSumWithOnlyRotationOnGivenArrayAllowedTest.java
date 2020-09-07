package array;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FindMaxValueOfSumWithOnlyRotationOnGivenArrayAllowedTest {

    @Test
    @DisplayName("find max sum when only rotation is allowed on given array")
    public void find(){
        int inputArr[] = new int[]{10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int outputSum = new FindMaxValueOfSumWithOnlyRotationOnGivenArrayAllowed().findSum(inputArr, inputArr.length);
        assertEquals(330, outputSum);
    }

    @Test
    @DisplayName("find array with max sum when only rotation is allowed on given array")
    public void findArray(){
        int inputArr[] = new int[]{10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] outputSum = new FindMaxValueOfSumWithOnlyRotationOnGivenArrayAllowed().findArrayArrangementForMaximumSum(inputArr, inputArr.length);
        System.out.println(Arrays.toString(outputSum));
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10}, outputSum);
    }

}