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
        assertEquals("1.0 plus 1.0 gives value 2.0", calculationsVerbalizerUnderTest.verbalize(Operation.SUM, 1,1,2));
    }

}
