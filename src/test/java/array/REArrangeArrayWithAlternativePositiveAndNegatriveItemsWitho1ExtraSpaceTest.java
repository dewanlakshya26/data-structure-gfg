package array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class REArrangeArrayWithAlternativePositiveAndNegatriveItemsWitho1ExtraSpaceTest {
    @Test
    public void rotateArrayTest(){
        int[] inputArray = {1, 2, 3, -4, -1, 4};
        int[] expectedArray = {-4, 1, -1, 2, 3, 4};


        int[] output = new REArrangeArrayWithAlternativePositiveAndNegatriveItemsWitho1ExtraSpace().rearrange(inputArray,inputArray.length);
        System.out.println(Arrays.toString(output));
        assertArrayEquals(expectedArray, output);
    }

    @Test
    public void rotateArrayByRightTest(){
        int[] inputArray = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        int[] expectedArray = {-5, 5, -2, 2, -8, 4, 7, 1, 8, 0};

        int[] output = new REArrangeArrayWithAlternativePositiveAndNegatriveItemsWitho1ExtraSpace().rearrange(inputArray,inputArray.length);
        System.out.println(Arrays.toString(output));

        assertArrayEquals(expectedArray, output);
    }
}