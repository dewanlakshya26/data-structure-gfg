package array.mustDoArray;

import java.util.Arrays;

public class MissingNoIntegerArray {


    public static void main(String[] args) {

        int[] arra = new int[]{-3, -8, 2, 3, 4, 1, 2, 3, 1, 15};
        int[] register = new int[arra.length];

        for (int i : arra) {
            if (i > 0  && i < register.length) {
                register[i] = 1;
            }
        }
        System.out.println("length of array is " + arra.length);
        for (int i = 0; i < arra.length; i++) {
            if (register[i] == 0) {
                System.out.println("missing element is " + (i));
            }
        }
        System.out.println(Arrays.toString(register));
    }
}
