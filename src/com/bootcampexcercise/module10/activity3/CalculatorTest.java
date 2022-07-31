package com.bootcampexcercise.module10.activity3;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    private Calculator calculator;

    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }

    protected void tearDown() throws Exception {
        calculator = null;
        super.tearDown();
    }

    public void testGetSum() {

        double x = 5;
        double y = 10;
        //	Checks the sum of two positive values
        assertEquals(15, (calculator.add(x, y)));
        assertEquals(15, (calculator.add(y, x)));

        x = -5;
        y = 10;
        //	Checks the sum of a postive value and a negative value
        assertEquals(5, (calculator.add(x, y)));
        assertEquals(5, (calculator.add(y, x)));

        x = -5;
        y = -10;
        //	Checks the sum of two negative values
        assertEquals(-15, (calculator.add(x, y)));
        assertEquals(-15, (calculator.add(y, x)));

        x = 5;
        y = 10;
        double z = 15;
        //	Checks the sum of three positive values
        assertEquals(30, (calculator.add(x, y, z)));
        assertEquals(30, (calculator.add(y, x, z)));
        assertEquals(30, (calculator.add(z, x, y)));
        assertEquals(30, (calculator.add(y, z, x)));

        x = -5;
        y = 10;
        z = 15;
        //	Checks the sum of a negative value and two positive values
        assertEquals(20, (calculator.add(x, y, z)));
        assertEquals(20, (calculator.add(z, x, y)));

        x = 5;
        y = -10;
        z = -15;
        //	Checks the sum of a positive value and two negative values
        assertEquals(-20, (calculator.add(x, y, z)));
        assertEquals(-20, (calculator.add(z, x, y)));

        x = -5;
        y = -10;
        z = -15;
        //	Checks the sum of three negative values
        assertEquals(-30, (calculator.add(x, y, z)));
        assertEquals(-30, (calculator.add(z, x, y)));
    }

    public void testGetDifference() {

        double x = 10;
        double y = 5;
        //	Checks the sum of two positive values
        assertEquals(5, (calculator.subtract(x, y)));
        assertEquals(15, (calculator.subtract(y, x)));

        x = -5;
        y = 10;
        //	Checks the sum of a postive value and a negative value
        assertEquals(-15, (calculator.subtract(x, y)));
        assertEquals(15, (calculator.subtract(y, x)));

        x = -5;
        y = -10;
        //	Checks the sum of two negative values
        assertEquals(5, (calculator.subtract(x, y)));
        assertEquals(-5, (calculator.subtract(y, x)));
    }

    public void testGetMultiply() {

        double x = 5;
        double y = 10;
        //	Checks the sum of two positive values
        assertEquals(50, (calculator.multiply(x, y)));
        assertEquals(50, (calculator.multiply(y, x)));

        x = -5;
        y = 10;
        //	Checks the sum of a postive value and a negative value
        assertEquals(-50, (calculator.multiply(x, y)));
        assertEquals(-50, (calculator.multiply(y, x)));

        x = -5;
        y = -10;
        //	Checks the sum of two negative values
        assertEquals(-50, (calculator.multiply(x, y)));
        assertEquals(-50, (calculator.multiply(y, x)));
    }

    public void testGetDivide() {

        double x = 5;
        double y = 10;
        //	Checks the sum of two positive values
        assertEquals(0.5, (calculator.divide(x, y)));
        assertEquals(2.0, (calculator.divide(y, x)));

        x = -5;
        y = 10;
        //	Checks the sum of a postive value and a negative value
        assertEquals(-0.5, (calculator.divide(x, y)));
        assertEquals(-2, (calculator.divide(y, x)));

        x = -5;
        y = -10;
        //	Checks the sum of two negative values
        assertEquals(0.5, (calculator.divide(x, y)));
        assertEquals(2, (calculator.divide(y, x)));
    }

}
