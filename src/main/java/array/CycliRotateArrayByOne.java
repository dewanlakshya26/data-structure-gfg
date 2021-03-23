package array;

public class CycliRotateArrayByOne {
    public int[] rotate(int[] input, int length) {
        int temp = input[length - 1];
        for (int i = length -1; i >0; i--) {
            input[i ] = input[i -1];
        }
        input[0] = temp;
        return input;
    }
}
