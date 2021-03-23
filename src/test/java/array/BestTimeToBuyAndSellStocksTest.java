package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeToBuyAndSellStocksTest {
    @Test
    public void rotateArrayTest(){
        int[] inputArray = {7,1,5,3,6,4 };

        int output = new BestTimeToBuyAndSellStocks().maxProfit(inputArray);
        assertEquals(5, output);
    }

    @Test
    public void rotateArrayByRightTest(){
        int[] inputArray = {7,6,4,3,1 };

        int output = new BestTimeToBuyAndSellStocks().maxProfit(inputArray);
        assertEquals(0, output);
    }
}