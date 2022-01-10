package ch.bbw.pr.savecalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;

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

    @Before
    public void setup() {
        SaveCalculator testee = new SaveCalculator();
        testee = new SaveCalculator();
    }
    @After
    public void deleteSetup() {
        int value1 = 2;
        int value2 = 2;
        SaveCalculator testee = new SaveCalculator();
        testee.summe(value1, value2);
    }

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
    @Test(expected = ArithmeticException.class)
    public void testSummeGroesstePositiveZahlUndKleintePositiveZahlThrowsExpectedExceptionIsOK() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 1;
        SaveCalculator testee = new SaveCalculator();
        testee.summe(value1, value2);
    }
    @Test
    public void testProtectedPower() {
        SaveCalculator testee = new SaveCalculator();
        assertEquals(32, testee.pow(2, 5));
    }
    @Test(expected = NoSuchMethodException.class)
    public void testPrivateMul() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        SaveCalculator testee = new SaveCalculator();
        Method method = testee.getClass().getDeclaredMethod("multiplication", int.class, int.class);
        method.setAccessible(true);
        assertEquals(10, method.invoke(testee, 2, 5));
    }

}