package com.example.unitconverter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TempUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testTempCToF() {
        double result = unitConverter.convertTemp("Celsius", "Fahrenheit", 40.0);
        assertEquals("Conversion from c to f did not work", 104.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTempCToC() {
        double result = unitConverter.convertTemp("Celsius", "Celsius", 40.0);
        assertEquals("Conversion from c to c did not work", 40.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTempFToC() {
        double result = unitConverter.convertTemp("Fahrenheit", "Celsius", 70.0);
        assertEquals("Conversion from f to c did not work", 21.1111, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTempFToF() {
        double result = unitConverter.convertTemp("Fahrenheit", "Fahrenheit", 40.0);
        assertEquals("Conversion from f to f did not work", 40.0, result, 0.001);
        //The message here is displayed if the test fails
    }
}
