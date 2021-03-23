package array;

public class ReverseTheArray {

   public int[] reverseArray(int[] input){
       int start = 0;
       int end = input.length -1;
       while (end > start){
           int temp = input[start];
           input[start] = input[end];
           input[end] = temp;
           start++;
           end--;
       }
       return input;
   }
}
