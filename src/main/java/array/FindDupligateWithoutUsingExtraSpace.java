package array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindDupligateWithoutUsingExtraSpace {

    //using ap formula//if only one dupligate exist
    public int getNo(int []  nums){
        int unique = nums.length -1;
        int totalSum = (unique* (unique + 1))/2;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum - totalSum;

    }

    //when you want to feel like setting flag , mark array element as negative
    //imp
    public int getNumWithFlag(int [] nums){
        int i = 0;
        for (; i < nums.length-1; i++) {

            if (nums[Math.abs(nums[i])]<0){
                break;
            }
            nums[nums[i]] = - nums[nums[i]];
        }
        return nums[i];
    }
}



