package pl.edu.agh.qualitycalculator;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by kartasin on 1/13/18. 
 */

public class CalculationsVerbalizerTest {
    CalculationsVerbalizer calculationsVerbalizerUnderTest;

    @Before
    public void setUp() {calculationsVerbalizerUnderTest = new CalculationsVerbalizer(); }

    @Test
    public void testVerbalizer() throws Exception {
        assertEquals("1.0 plus 1.0 gives value 2.0", calculationsVerbalizerUnderTest.verbalize(Operation.SUM, 1,1,0,2));

        assertEquals("1.0 minus 5.0 gives value -4.0", calculationsVerbalizerUnderTest.verbalize(Operation.SUBTRACT, 1,5,0,-4));

        assertEquals("7.0 multiplied by 5.0 gives value 35.0", calculationsVerbalizerUnderTest.verbalize(Operation.MULTIPLY, 7,5,0,35));

        assertEquals("15.0 divided by 5.0 gives value 3.0", calculationsVerbalizerUnderTest.verbalize(Operation.DIVIDE, 15,5,0,3));

        assertEquals("1.0 , 5.0 and 3.0 averaged gives value 3.0", calculationsVerbalizerUnderTest.verbalize(Operation.AVERAGE, 1,5,3,3));

    }


}
