package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindLongestConsecutiveSequenceWithinAnArrayTest {
    @Test
    public void rota() {
        int[] input = {2,6,1,9,4,5,3};

        long output = new FindLongestConsecutiveSequenceWithinAnArray().findLongestConseqSubseq(input,input.length);
        assertEquals(6, output);
    }

    @Test
    public void rotateArrayByRightTest() {
        int[] input = {1,2,3,4,5};
        long output = new FindLongestConsecutiveSequenceWithinAnArray().findLongestConseqSubseq(input,input.length);
        assertEquals(5, output);
    }
}