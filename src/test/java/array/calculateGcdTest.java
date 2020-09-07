package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class calculateGcdTest {

    Gcd gfg = new Gcd();

    @Test
    public void calculategcd() {
        int gcd = gfg.calculategcd(3, 7);
        assertEquals(1, gcd);
    }


}