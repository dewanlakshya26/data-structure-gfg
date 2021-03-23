package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeWayPartiotioningOfArrayAroundAGivenValueTest {
    @Test
    public void rota() {
        int[] input = {1, 2, 3, 3, 4};
        int [] expectedArray = {1, 2, 4, 3, 3};
        int [] output = new ThreeWayPartiotioningOfArrayAroundAGivenValue().threeWayPartition(input,1,2);
        assertArrayEquals(expectedArray, output);
    }

    @Test
    public void rotateArrayByRightTest() {
        int[] input = {87 ,78, 16, 94};
        int [] expectedArray = {16,78,87,94};
        int [] output = new ThreeWayPartiotioningOfArrayAroundAGivenValue().threeWayPartition(input,36 ,72);
        assertArrayEquals(expectedArray, output);
    }

}