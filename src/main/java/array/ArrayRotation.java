package array;

import java.util.Arrays;

public class ArrayRotation {
    //this is o1 space complexity and o(n) time complexity
    public int[] rotateArrayByLeft(int[] arr, int rotationFactor) {

        int arr_length = arr.length;
        rotationFactor = rotationFactor % arr_length;
        int gcd = new Gcd().calculategcd(arr_length, rotationFactor);
        int i, j, k, temp;
        for (i = 0; i < gcd; i++) {
            System.out.println("outer array rolling");
            temp = arr[i];
            j = i;
            while (true) {
                k = j + rotationFactor;
                if (k >= arr_length) { //to circulate back k to start from from begining
                    System.out.println("array recirculated");
                    k = k - arr_length;
                }
                if (k == i) {
                    System.out.println("array equals to i");
                    break;
                }
                arr[j] = arr[k];
                j = k;
                System.out.println("hee" + Arrays.toString(arr));

            }
            System.out.println("hii" + Arrays.toString(arr));

            arr[j] = temp;
        }
        return arr;

    }

    public int[] rotateArrayByRight(int[] arr, int rotationFactor) {

        int arr_length = arr.length;
        rotationFactor = rotationFactor % arr_length;
        int gcd = new Gcd().calculategcd(arr_length, rotationFactor);
        int i, j, k, temp;
        for (i = 0; i < gcd; i++) {
            temp = arr[i];
            j = i;
            while (true) {
                k = j - rotationFactor;
                if (k <= arr_length) { //to circulate back k to start from from begining
                    System.out.println("array recirculated");
                    k = k + arr_length;
                }
                if (k == i) {
                    System.out.println("array equals to i");
                    break;
                }
                arr[j] = arr[k];
                j = k;
                System.out.println("hee" + Arrays.toString(arr));

            }
            System.out.println(" hii" + Arrays.toString(arr));

            arr[j] = temp;
        }
        return arr;

    }

    public void printArray(int[] arr) {
        System.out.println(Arrays.asList(arr));
    }
}
