package array;

public class FindelementInSortedThenRotatedArray {
    //this approach is binary search
    //Time Complexity: O(log n).
    //Binary Search requires log n comparisons to find the element. So time complexity is O(log n).
    //Space Complexity: O(1).
    //As no extra space is required.
    int findElement(int arr[], int key) {
        int arr_length = arr.length;
        return find(arr, 0, arr_length - 1, key);
    }

    private int find(int[] arr, int low, int high, int key) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == key){
            return mid;
        }

        if (arr[low] < arr[mid]) {
            if (key >= arr[low] && key <= arr[mid]) {
               return find(arr, low, mid, key);
            }
            return find(arr, mid+1, high, key);
        }
        if (key >= arr[mid] && key <=arr[high]){
            return find(arr, mid+1, high, key);
        }
        return find(arr, low, mid-1, key);

    }
}
