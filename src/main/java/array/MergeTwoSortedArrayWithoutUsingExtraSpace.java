package array;

import java.util.Arrays;

public class MergeTwoSortedArrayWithoutUsingExtraSpace {

    public void merge(int[] input, int[] input2, int firstLength, int secondLength) {
        for (int i = 0, j = 0; i < firstLength; ) {

            if (input[i] > input2[j]) {
                swap(input, input2, i, j);
                i++;
            }
            Arrays.sort(input2);

        }
        System.out.println(Arrays.toString(input) + Arrays.toString(input2));
    }

    private void swap(int[] input, int[] input2, int i, int i1) {
        int temp = input[i];
        input[i] = input2[i1];
        input2[i1] = temp;

    }

    public static void main(String[] args) {
        new MergeTwoSortedArrayWithoutUsingExtraSpace().merge(new int[]{1, 3, 5, 7}, new int[]{0, 2, 6, 8, 9}, 4, 5);
    }
}
