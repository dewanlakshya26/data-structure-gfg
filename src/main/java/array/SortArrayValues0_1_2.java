package array;

public class SortArrayValues0_1_2 {

    public int[] sort(int[] input, int n){
        int left = 0;
        int mid  = 0;
        int right  = n-1;
        while (mid<=right){
            switch (input[mid]){
                case 0:
                    swap(left,mid,input);
                    left++;
                    break;
                case 2:
                    swap(right,mid,input);
                    right--;
            }
            mid++;
        }
        return input;
    }

    private void swap(int i, int i1, int[] input) {
        int temp = input[i];
        input[i] = input[i1];
        input[i1] = temp;
    }
}
