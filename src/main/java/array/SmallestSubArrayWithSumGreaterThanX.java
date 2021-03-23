package array;

public class SmallestSubArrayWithSumGreaterThanX {
    long sb(long a[], long n, long x) {
        int start = 0;
        int end = 0;
        int currentSum = 0;
        long minValue = n + 1;
        while (end < n) {

            while (currentSum <= x && end < n) {
                currentSum += a[end++];
            }
            while (currentSum > x && start < n) {
                if (end - start < minValue) {
                    minValue = end - start;
                }
                currentSum -= a[start++];
            }

        }
        return minValue;
    }
}
