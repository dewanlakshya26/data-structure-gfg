package array;

public class FindSumOfArrayInSortedAndThenRotatedArray {

    //this code give give count of matching elements equals to sum
    //this find pivot is now taking OlogN time.


    //in general when dealing qith array, if you are reducing index and want to go the last index after zeroth index
    // make sure to add noOfElement while subr=tractiong then do on a modulas on noOfElement
    int findSortedAndRotatedArray(int[] arr, int sum, int noOfElements) {
        int i;
        //first find pivot element, the element where the array is rotated
        i = findPivot(arr, 0, noOfElements - 1);//this find pivot is now taking OlogN time.
        System.out.println(i);
        int count = 0;
        int smalletElementIndex = i + 1;
        int largestElementIndex = i;

        while (largestElementIndex != smalletElementIndex) {
            if (arr[largestElementIndex] + arr[smalletElementIndex] == sum) {
                count++;
                //below condition is for checking if the index doesnt cross each other
                //it could be written as smalletElementIndex == (largestElementIndex -1 + noOfElements)%noOfElements

                if (largestElementIndex == (smalletElementIndex + 1) % noOfElements) {
                    return count;
                }
                largestElementIndex = (largestElementIndex - 1 + noOfElements) % noOfElements;//imppppp
                smalletElementIndex = (smalletElementIndex + 1) % noOfElements;
            } else if (arr[largestElementIndex] + arr[smalletElementIndex] < sum) {
                smalletElementIndex = (smalletElementIndex + 1) % noOfElements;
            } else
                largestElementIndex = (largestElementIndex - 1 + noOfElements) % noOfElements;//imppppp
        }
        return count;

    }

    //this approach will take on time
    //    private int findPivot(int[] arr, int noOfElements) {
//        int i;
//        for (i = 0; i < noOfElements - 1; i++) {
//            if (arr[i] > arr[i + 1])
//                break;
//        }
//        return i;
//    }
    private int findPivot(int[] arr, int low, int high) {
        if (low > high) {
            return -1;
        }
        if (high == low) {
            return low;
        }

        int mid = (low + high) / 2;
        if (mid > low && arr[mid] < arr[mid - 1]) {
            return mid - 1;
        }
        if (mid < high && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        if (arr[low] > arr[mid]) {
            return findPivot(arr, low, mid - 1);
        }

        return findPivot(arr, mid + 1, high);


    }
}
