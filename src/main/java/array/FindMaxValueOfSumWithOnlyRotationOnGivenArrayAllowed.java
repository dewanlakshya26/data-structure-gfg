package array;

public class FindMaxValueOfSumWithOnlyRotationOnGivenArrayAllowed {
    //imp -- https://www.geeksforgeeks.org/maximum-sum-iarri-among-rotations-given-array/
    //visit this link to check how method 3, how they calculate the maximus summ using pivot in simple one line
    // for(i = 0; i < n; i++)
    //    {
    //        sum= sum + ((i + diff) % n) * arr[i];
    //    }


//    Time Complexity : O(n)
//Auxiliary Space : O(1)
    //this approach doesnt required the array to be sorted
    int noOfRotate = 0;

    int findSum(int arr[], int length) {
        int arraySum = 0, maximumValue = 0, currentValue = 0;
        for (int i = 0; i < arr.length; i++) {
            arraySum = arraySum + arr[i];
            currentValue = currentValue + i * arr[i];
        }

        maximumValue = currentValue;

        //make sure this loop start from 1 as we have find sum for zeroth element
        for (int j = 1; j < length; j++) {
            currentValue = currentValue + arraySum - length * arr[length - j];
            if (currentValue > maximumValue) {
                maximumValue = currentValue;
                noOfRotate = j; // this is for second function, not needed if ask for sum
                System.out.println(maximumValue);
            }
        }
        return maximumValue;

    }


    int[] findArrayArrangementForMaximumSum(int arr[], int length) {
        findSum(arr, length);
        System.out.println(noOfRotate);
        return new ReversalAlgorithForArrayRotation().rotateArrayByLeft(arr, noOfRotate);

    }
}
