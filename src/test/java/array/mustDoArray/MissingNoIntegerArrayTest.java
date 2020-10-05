package array.mustDoArray;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class MissingNoIntegerArrayTest {

    @Test
    public void fun (){
        MissingNoIntegerArray missingNoIntegerArray = new MissingNoIntegerArray();
        int[] arra = new int[]{-3, -8, 2, 3, 4, 5,6, 8};
        missingNoIntegerArray.findMissingCountInArray(arra);
        assertEquals(3,3);
    }

}