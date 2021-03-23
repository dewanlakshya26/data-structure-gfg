package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChocolateDistributionProblem {

    public int findMinDiff(ArrayList<Integer> a, int n, int m) {

        Collections.sort(a);
        int minimum = Integer.MAX_VALUE;
        for (int i = 0, j = m - 1; i < n - m; i++, j++) {
            int diff = Math.abs(a.get(i) - a.get((j)));
            if (minimum > diff) {
                minimum = diff;
            }
        }
        return minimum;
    }
}
