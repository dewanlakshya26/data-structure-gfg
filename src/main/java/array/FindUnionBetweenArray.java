package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindUnionBetweenArray {

    public int findUnion(int[] input,int[] input2){
        Set<Integer> h = new HashSet<>();
        for (int i = 0; i < input.length; i++) {
            h.add(input[i]);
        }for (int i = 0; i < input2.length; i++) {
            h.add(input2[i]);
        }
        return h.size();

    }
}
