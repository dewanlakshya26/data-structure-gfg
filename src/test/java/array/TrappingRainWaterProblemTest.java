package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrappingRainWaterProblemTest {

    @Test
    public void rota() {
        int[] input = {1, 8, 8, 2, 4, 5, 5, 1};

        long output = new TrappingRainWaterProblem().trappingWater(input, input.length);
        assertEquals(4, output);
    }

    @Test
    public void rotateArrayByRightTest() {
        int[] input = {7, 4, 0, 9};

        long output = new TrappingRainWaterProblem().trappingWater(input, input.length);
        assertEquals(10, output);
    }

}