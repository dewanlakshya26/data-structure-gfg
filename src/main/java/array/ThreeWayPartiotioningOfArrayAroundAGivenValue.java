package array;

import java.util.Arrays;

public class ThreeWayPartiotioningOfArrayAroundAGivenValue {
    public int[] threeWayPartition(int[] array, int a, int b) {
        int start = 0;
        int end = array.length - 1;
        int index = 0;

        while (end > start && index < array.length - 1) {
            if (array[index] < a) {
                swap(array, index, start);
                start++;
            } else if (array[index] > b) {
                swap(array, index, end);
                end--;
            }
            System.out.println(Arrays.toString(array) + "start " + start + "end " + end);
            index++;
        }
        return array;
    }
    87 ,78, 16, 94

    private void swap(int[] array, int index, int star) {
        int temp = array[index];
        array[index] = array[star];
        array[star] = temp;
    }
}
