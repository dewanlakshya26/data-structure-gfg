package array;

public class MoveAllNegativeElementsToOneSideOfArray {

    public int[] move(int[] input, int n) {
        //my solution
        int start = 0;
        //   int ahead = 1;
//        while (n > ahead) {
//            if (input[start] < 0) {
//                start++;
//            } else if (input[ahead] < 0) {
//                int temp = input[start];
//                input[start] = input[ahead];
//                input[ahead] = temp;
//                start++;
//
//            }
//            ahead++;
//        }
//        return input;
//    }
        //my solution - 2 pointer approach
        int end = n - 1;
        while (end >= start) {
            if (input[start] < 0) {
                start++;
            } else {
                if (input[end] < 0) {
                    int temp = input[start];
                    input[start] = input[end];
                    input[end] = temp;
                }
                end--;
            }
        }
        return input;
    }

//    solution on geeks for geeks
//int j = 0, temp;
//        for (int i = 0; i < n; i++) {
//        if (arr[i] < 0) {
//            if (i != j) {
//                temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//            j++;
//        }
//    }
}
