package array;

import java.util.ArrayList;
import java.util.List;

public class FindNoOfPairsOfElelmentInArrayWhoseSimIsEqualToK {
    int getPairsCount(int[] arr, int n, int k) {
        int count = 0;
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (l.contains(k - arr[i])){
                count++;
            }
             l.add(arr[i]);
        }
        return count;
    }
}
