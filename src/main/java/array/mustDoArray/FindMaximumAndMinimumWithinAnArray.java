package array.mustDoArray;

public class FindMaximumAndMinimumWithinAnArray {

    public Size find(int[] input) {
        int maximum = input[0], minimum = input[0];
        int start = 1;
        int end = input.length - 1;
        while (end >= start) {
            if (input[start] > maximum) {
                maximum = input[start];
            } else if (input[start] < minimum) {
                minimum = input[start];
            }
            if (input[end] > maximum) {
                maximum = input[end];
            } else if (input[end] < minimum) {
                minimum = input[end];
            }
            start++;
            end--;
        }
        return new Size(maximum, minimum);
    }
}

class Size {
    public int maximum;
    public int minimum;

    public Size(int maximum, int minimum) {

        this.maximum = maximum;
        this.minimum = minimum;
    }
}
