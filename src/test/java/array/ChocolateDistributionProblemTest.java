package array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ChocolateDistributionProblemTest {
    @Test
    public void rota() {
        ArrayList<Integer> gfg = new ArrayList<Integer>(
                Arrays.asList(3, 4, 1, 9, 56, 7, 9, 12));

        int output = (int) new ChocolateDistributionProblem().findMinDiff(gfg, 8,5);
        assertEquals(6, output);
    }

    @Test
    public void rotateArrayByRightTest() {
        ArrayList<Integer> gfg = new ArrayList<Integer>(
                Arrays.asList(7, 3, 2, 4, 9, 12, 56));

        int output = (int) new ChocolateDistributionProblem().findMinDiff(gfg, 7,3);
        assertEquals(2, output);
    }
}