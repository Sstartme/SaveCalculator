package ch.bbw.pr.savecalculator;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 * @author Sinthella Anpalagan
 * @version 0.0.1
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void TestSummeZweiPositiveMethodenIstOk() {
        int value1 = 12;
        int value2 = 34;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.summe(value1, value2) == 46);
    }

    @Test
    public void TestSummeZweiNegativeMethodenIstOk() {
        int value1 = -12;
        int value2 = -34;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.summe(value1, value2) == -46);
    }
}