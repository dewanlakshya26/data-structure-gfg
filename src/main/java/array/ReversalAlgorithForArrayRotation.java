package array;

public class ReversalAlgorithForArrayRotation {
    public int[] rotateArrayByLeft(int[] arr, int rotationFactor){
        if (rotationFactor == 0) return arr;
        int arr_length = arr.length;
        reverseArray(arr, 0, rotationFactor -1);
        reverseArray(arr, rotationFactor, arr_length -1);
        reverseArray(arr, 0, arr_length -1);
        return arr;

    }

    public int[] rotateArrayByRight(int[] arr, int rotationFactor){
        if (rotationFactor == 0) return arr;
        int arr_length = arr.length;
        reverseArray(arr, arr_length - rotationFactor, arr_length -1);
        reverseArray(arr, 0, arr_length - rotationFactor -1);
        reverseArray(arr, 0, arr_length -1);
        return arr;

    }

    private void reverseArray(int[] arr, int start, int end) {
        int temp;
        while (end > start){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


}
