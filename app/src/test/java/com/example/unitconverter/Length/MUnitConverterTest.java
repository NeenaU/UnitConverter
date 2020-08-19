package com.example.unitconverter.Length;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.example.unitconverter.UnitConverter;

public class MUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testLengthMToKm() {
        double result = unitConverter.convertLength("Metre", "Kilometre", 4.0);
        assertEquals("Conversion from m to km did not work", 0.004, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthMToM() {
        double result = unitConverter.convertLength("Metre", "Metre", 4.0);
        assertEquals("Conversion from m to m did not work", 4.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthMToCm() {
        double result = unitConverter.convertLength("Metre", "Centimetre", 4.0);
        assertEquals("Conversion from m to cm did not work", 400.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthMToMm() {
        double result = unitConverter.convertLength("Metre", "Millimetre", 4.0);
        assertEquals("Conversion from m to mm did not work", 4000.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthMToMile() {
        double result = unitConverter.convertLength("Metre", "Mile", 4.0);
        assertEquals("Conversion from m to mile did not work", 0.00248548, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthMToYard() {
        double result = unitConverter.convertLength("Metre", "Yard", 4.0);
        assertEquals("Conversion from m to yard did not work", 4.37445, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthMToFeet() {
        double result = unitConverter.convertLength("Metre", "Feet", 4.0);
        assertEquals("Conversion from m to foot did not work", 13.1234, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthMToInch() {
        double result = unitConverter.convertLength("Metre", "Inch", 4.0);
        assertEquals("Conversion from m to inch did not work", 157.48, result, 0.001);
        //The message here is displayed if the test fails
    }
}
