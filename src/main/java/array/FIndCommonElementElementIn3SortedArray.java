package array;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FIndCommonElementElementIn3SortedArray {
    List<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        ArrayList a = new ArrayList();
        int start1  = 0;
        int start2  = 0;
        int start3  = 0;
        //int commonElement = 0;
        // code here
        while (start1<n1 &&start2<n2&&start3<n3){
            if (A[start1]==B[start2]&& A[start1]== C[start3]){
                a.add(A[start1]);
            }
            if (A[start1]<B[start2]){
                if (A[start1]<C[start3]){
                    start1++;
                }
                else start3++;
            }
            else if (C[start3]<B[start2]){
                if (C[start3]<A[start1]){
                    start3++;
                }
                else start1++;
            }
            else start2++;
        }

        Set<Integer> set = new LinkedHashSet(a);
        a.clear();
        a.addAll(set);
        return a;
    }
}
