package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindelementInSortedThenRotatedArrayTest{

    @Test
    public void shouldFindElemetnInSortedNRotatedArray(){
        int[] inputArray = {5,6,7,8,9,10,11,12,13,0,1,2,3,4};
        int outputElement = new FindelementInSortedThenRotatedArray().findElement(inputArray, 3);
        assertEquals(12, outputElement);
    }

}