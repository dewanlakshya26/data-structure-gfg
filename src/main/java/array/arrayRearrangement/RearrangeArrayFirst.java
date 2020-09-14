package array.arrayRearrangement;

import java.util.Arrays;

public class RearrangeArrayFirst {
    //Time Complexity: O(n)   go for using one array


    public int[] rearrangeusingTwoArray(int[] inputArray, int length) {
        int[] secondArray = new int[length];
        Arrays.fill(secondArray, -1);
        for (int i = 0; i < length; i++) {
            if (inputArray[i] <= length && inputArray[i] >= 0) {
                secondArray[inputArray[i]] = inputArray[i];
            }
        }
        return secondArray;
    }


    public int[] rearrangeusingOneArray(int[] inputArray, int length) {
        for (int i = 0; i < length;) {
            if (inputArray[i] <= length && inputArray[i] >= 0 && inputArray[i] != i) {
                int temp = inputArray[inputArray[i]];
                inputArray[inputArray[i]] = inputArray[i];
                inputArray[i]=temp;
            }
            else {
                i++;
            }
        }
        return inputArray;
    }



}
