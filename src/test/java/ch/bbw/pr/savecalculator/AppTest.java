package ch.bbw.pr.savecalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
    public void TestSummeGroesstePositiveundKleinstePositiveMethodenIstOk()
    {
        int value1 = Integer.MAX_VALUE;
        int value2 = 1;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.summe(value1, value2) == -2147483648 );
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
    @Test
    public void testSummeZweiNegativeZahlenIsOk() {
        int value1 = -166;
        int value2 = -334;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.summe(value1, value2) == -500);
    }

    @Test
    public void testSummeZweiPositiveZahlenIsOk() {
        int value1 = 200;
        int value2 = 34;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.summe(value1, value2) == 234);
    }

    @Test
    public void testSummePositiveZahlUndNegativeZahlIsOk() {
        int value1 = 89;
        int value2 = -122;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.summe(value1, value2) == -33);
    }
    @Test(expected = ArithmeticException.class)
    public void testSummeGroesstePositiveZahlUndKleintePositiveZahlThrowsExpectedExceptionIsOK() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 1;
        SaveCalculator testee = new SaveCalculator();
        testee.summe(value1, value2);
    }
    @Test
    public void testSummeGroessteNegativeZahlUndKleinstePositiveZahlIsOk() {
        int value1 = Integer.MIN_VALUE;
        int value2 = 1;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.summe(value1, value2) == -2147483647);
    }
    @Test
    public void TestSummeEinePositiveundEineNegativeMethodenIstOk()
    {
        int value1 = 5;
        int value2 = -10;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.summe(value1, value2) == -5);
    }
    @Test
    public void TestSummeEinePositiveundNullMethodenIstOk()
    {
        int value1 = 6;
        int value2 = 0;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.summe(value1, value2) == 6);
    }
    @Test
    public void TestSummeEineNegativeundNullMethodenIstOk()
    {
        int value1 = -17;
        int value2 = 0;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.summe(value1, value2) == -17);
    }


    @Test
    public void TestSummeGroesstePositiveundKleinsteNegativeMethodenIstOk()
    {
        int value1 = Integer.MAX_VALUE;
        int value2 = Integer.MIN_VALUE;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.summe(value1, value2) == -1);
    }

    @Test
    public void testSubtraktionZweiPositiveZahlenIsOk() {
        int value1 = 10;
        int value2 = 20;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.subtract(value1, value2) == -10);
    }
    @Test
    public void testSubtraktionZweiNegativeZahlenIsOk() {
        int value1 = -55;
        int value2 = -66;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.subtract(value1, value2) == 11);
    }
    @Test
    public void testSubtraktionPositiveUndNegativeZahlIsOk() {
        int value1 = 3815;
        int value2 = -402;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.subtract(value1, value2) == 4217);
    }
    @Test
    public void testSubtraktionGroessteNegativeZahlUndKleinsteNegativeZahlIsOk() {
        int value1 = Integer.MIN_VALUE;
        int value2 = -1;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.subtract(value1, value2) == -2147483647);
    }
    @Test(expected = ArithmeticException.class)
    public void testSubtraktionGroesstePositiveZahlUndKleinsteNegativeZahlThrowsExpectedExceptionIsOK() {
        int value1 = Integer.MAX_VALUE;
        int value2 = -1;
        SaveCalculator testee = new SaveCalculator();
        testee.subtract(value1, value2);
    }
    @Test
    public void TestSubtraktionEinePositiveundNullMethodenIstOk()
    {
        int value1 = 6;
        int value2 = 0;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.subtract(value1, value2) == 6);
    }
    @Test
    public void TestSubtraktionEineNegativeundNullMethodenIstOk()
    {
        int value1 = -6;
        int value2 = 0;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.subtract(value1, value2) == -6);
    }

    @Test
    public void testSubtraktionGroesstePositiveZahlUndKleinstePositiveZahlIsOK() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 1;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.subtract(value1, value2) == 2147483646);
        testee.subtract(value1, value2);
    }

    @Test
    public void testDivisionZweiPositiveZahlenIsOK() {
        int value1 = 17;
        int value2 = 1821;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.divide(value1, value2) == 0);
    }
    @Test
    public void testDivisionZweiNegativeZahlenIsOK() {
        int value1 = -64;
        int value2 = -8;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.divide(value1, value2) == 8);
    }
    @Test
    public void testDivisionPositiveZahlUndNegativeZahlIsOk() {
        int value1 = 120;
        int value2 = -11;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.divide(value1, value2) == -10);
    }
    @Test(expected = ArithmeticException.class)
    public void testDivisionPositiveZahlUndNullThrowsExpectedExceptionIsOK() {
        int value1 = 13;
        int value2 = 0;
        SaveCalculator testee = new SaveCalculator();
        testee.divide(value1, value2);
    }
    @Test(expected = ArithmeticException.class)
    public void testDivisionNegativeZahlUndNullThrowsExpectedExceptionIsOK() {
        int value1 = -13;
        int value2 = 0;
        SaveCalculator testee = new SaveCalculator();
        testee.divide(value1, value2);
    }

    @Test
        public void testDivisionGroesstePositiveZahlUndKleinstePositiveThrowsExpectedExceptionIsOK() {
            int value1 = Integer.MAX_VALUE;
            int value2 = 1;
            SaveCalculator testee = new SaveCalculator();
            assertTrue(testee.divide(value1, value2) == 2147483647);
    }
    @Test
    public void testDivisionGroessteNegativeUndKleinstePositiveIsOk() {
        int value1 = Integer.MIN_VALUE;
        int value2 = 1;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.divide(value1, value2) == -2147483648);
    }

    @Test
    public void testDivisionGroesstePositiveZahlUndKleinsteNegativeIsOK() {
        int value1 = Integer.MAX_VALUE;
        int value2 = -1;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.divide(value1, value2) == -2147483647);
    }
    @Test
    public void testDivisionGroessteNegativeZahlUndKleinstePositiveIsOK() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 1;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.divide(value1, value2) == 2147483647);
    }
    @Test
    public void testDivisionGroessteNegativeZahlUndKleinsteNegativeIsOK() {
        int value1 = Integer.MAX_VALUE;
        int value2 = -1;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.divide(value1, value2) == -2147483647);

    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionEinNegativeNullIszOk() {
        SaveCalculator testee = new SaveCalculator();
        testee.divide(-11, 0);
    }

    @Test (expected = ArithmeticException.class)
    public void testDivisionPositiveZahlUndNullThrowsUnexpectedExceptionIsNOK() throws NullPointerException {
        int value1 = 12;
        Integer value2 = 0;
        SaveCalculator testee = new SaveCalculator();
        testee.divide(value1, value2);
    }
    @Test
    public void testMultiplikationZweiPositiveZahlenMitProtectedMethodeIsOk() {
        int value1 = 12;
        int value2 = 12;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.multiply(value1, value2) == 144);
    }
    @Test
    public void testMultiplikationPostiveZahlUndNegativeZahlIsOk() {
        int value1 = 25;
        int value2 = -4;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.multiply(value1, value2) == -100);
    }
    @Test
    public void testMultiplikationZweiNegativeZahlIsOk() {
        int value1 = -33;
        int value2 = -12;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.multiply(value1, value2) == 396);
    }
    @Test
    public void testMultiplikationPositiveZahlUndNullIsOk() {
        int value1 = 2;
        int value2 = 0;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.multiply(value1, value2) == 0);
    }
    @Test
    public void testMultiplikationNegativeZahlUndNullIsOk() {
        int value1 = -2;
        int value2 = 0;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.multiply(value1, value2) == 0);
    }
    @Test
    public void testMultiplikationGroesstePositiveZahlUndkleinsteNegativeZahlIsOk() {
        int value1 = Integer.MAX_VALUE;
        int value2 = -1;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.multiply(value1, value2) == -Integer.MAX_VALUE);
    }
    @Test
    public void testMultiplikationGroesstePositiveZahlUndkleinstePositiveZahlIsOk() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 1;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.multiply(value1, value2) == 2147483647);
    }
    @Test
    public void testMultiplikationGroessteNegativeZahlUndKleinstePositiveIsOK() {
        int value1 = Integer.MIN_VALUE;
        int value2 = 1;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.multiply(value1, value2) == -2147483648);
    }
    @Test (expected = ArithmeticException.class)
    public void testMultiplikationGroessteNegativeZahlUndKleinsteNegativeIsOK() {
        int value1 = Integer.MIN_VALUE;
        int value2 = -1;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.multiply(value1, value2) == -2147483648);
    }

    /*
    @Test
     Dieser Test kann nicht ausgeführt werden werden, da die Methode square private ist.
    Dieser Access Modifier  ist nur innerhalb der gleichen Klasse zugänglich.
    Bei JDK1.3 oder höher kann man mit reflections den Zugriffssteuermechanismus untergraben
    public void testQuadrierungZweiPositiveZahlenMitPrivateMethodeIsOK() {
        int value1 = 3;
        int value2 = 2;
        assertTrue(testee.square(value1, value2) == 9);
    }
    */
}
//tests to implement
//eine positive + eine positive
//eine negative + eine negative
//eine positive + eine negative
//eine negative + 0
//eine positive + 0
//grösste positive + kleinste positive
//grösste positive + kleinste negative
//grösste negative + kleinste positive
//grösste negative + kleinste negative

