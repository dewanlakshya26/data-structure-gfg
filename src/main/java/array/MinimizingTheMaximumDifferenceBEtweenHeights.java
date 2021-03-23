package array;

public class MinimizingTheMaximumDifferenceBEtweenHeights {
    public int findDiff(int[] input, int length, int buffer) {
        int minimum = input[0];
        int maximum = input[0];
        for (int i = 0; i < length; i++) {
            if (input[i] < minimum) {
                minimum = input[i];
            } else if (input[i] > maximum) {
                maximum = input[i];
            }
        }
        return Math.abs(maximum - minimum - 2 * buffer);
    }
}
