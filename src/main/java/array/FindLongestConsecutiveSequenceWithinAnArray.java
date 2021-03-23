package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLongestConsecutiveSequenceWithinAnArray {

    int findLongestConseqSubseq(int arr[], int N)
    {
     int maximusLength = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i]> maximusLength){
                maximusLength = arr[i];
            }
        }
        int[] tempArray = new int[maximusLength+1];
        for (int i = 0; i < N; i++) {
            tempArray[arr[i]] = 1;
        }

        int templongestSequence = 0;
        int finalLongestsequence = 0;
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] == 1){
                templongestSequence++;

            }
            else {
                if (templongestSequence>finalLongestsequence){
                    finalLongestsequence = templongestSequence;
                }
                templongestSequence = 0;
            }
        }
        return Math.max(finalLongestsequence, templongestSequence);

    }
}
