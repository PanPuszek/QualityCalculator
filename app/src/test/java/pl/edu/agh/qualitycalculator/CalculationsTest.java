package pl.edu.agh.qualitycalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertTrue;

public class CalculationsTest {
    Calculations calculationsUnderTest;

    @Before
    public void setUp() {
        calculationsUnderTest = new Calculations();
    }

    @Test
    public void testSum() throws Exception {
        assertEquals((float)3.99, calculationsUnderTest.calculate(Operation.SUM, (float)1.33, (float)2.66, (float)0), 0.01);
    }

    @Test
    public void testSubtract() throws Exception {
        assertEquals(-16, calculationsUnderTest.calculate(Operation.SUBTRACT, 2,18, 0), 0.01);
    }

    @Test
    public void testMultiply() throws Exception {
        assertEquals(8, calculationsUnderTest.calculate(Operation.MULTIPLY, 2,4,4), 0.01);
    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(3,calculationsUnderTest.calculate(Operation.DIVIDE, 27,9,9), 0.01);
    }

    @Test
    public void testAverage() throws Exception {
        assertEquals(3,calculationsUnderTest.calculate(Operation.AVERAGE, 2,3,4), 0.01);
    }

    @After
    public void tearDown() {
    }
}
