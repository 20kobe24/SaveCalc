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
    //  */
    @Test
    public void TestSumem4ZweiNegativeOK() {
        int value1 = -150;
        int value2 = -200;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.summe(value1, value2) == -350);
    }

    @Test
    public void TestSumme4ZweiPositivenOK() {
        int value1 = 150;
        int value2 = 150;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.summe(value1, value2) == 300);
    }
    // @Test
    // public void shouldAnswerWithTrue()
    // {
    //     assertTrue( true );
    // }
    
}
