package ch.bbw.pr.savecalculator;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void testSummefürZweinegativeZahlenok(){
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
}
