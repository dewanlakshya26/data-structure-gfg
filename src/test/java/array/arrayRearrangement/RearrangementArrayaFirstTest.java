package array.arrayRearrangement;

import org.junit.Assert;
import org.junit.Test;

public class RearrangementArrayaFirstTest {

    //Time Complexity: O(n) o(1) Space complexity  go for using one array
    @Test
   public void rearrangeArray(){
        int[] inputArray = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        RearrangeArrayFirst output = new RearrangeArrayFirst();
        Assert.assertArrayEquals(new int[]{-1, 1, 2, 3, 4, -1, 6, -1, -1, 9}, output.rearrangeusingOneArray(inputArray, inputArray.length));

    }
    @Test
   public void rearrangeArray2(){
        int[] inputArray = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
                11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
        RearrangeArrayFirst output = new RearrangeArrayFirst();
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19}, output.rearrangeusingTwoArray(inputArray, inputArray.length));

    }

    @Test
   public void rearrangeArray3(){
        int[] inputArray = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
                11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
        RearrangeArrayFirst output = new RearrangeArrayFirst();
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19}, output.rearrangeusingOneArray(inputArray, inputArray.length));

    }
}
