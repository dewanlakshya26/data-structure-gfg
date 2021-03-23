package array;

public class FindFactorial {
    long giveFactorial(int input){
        int start = 1;
        int sum = 1;
        while (start<=input){
            sum = start*sum;
            start++;
        }
        return sum;
    }
}
