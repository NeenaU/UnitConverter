package com.example.unitconverter.Length;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.example.unitconverter.UnitConverter;

public class CMUnitConverterTest {

    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testLengthCmToKm() {
        double result = unitConverter.convertLength("Centimetre", "Kilometre", 4.0);
        assertEquals("Conversion from cm to km did not work", 0.00004, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthCmToM() {
        double result = unitConverter.convertLength("Centimetre", "Metre", 4.0);
        assertEquals("Conversion from cm to m did not work", 0.04, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthCmToCm() {
        double result = unitConverter.convertLength("Centimetre", "Centimetre", 4.0);
        assertEquals("Conversion from cm to cm did not work", 4.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthCmToMm() {
        double result = unitConverter.convertLength("Centimetre", "Millimetre", 4.5);
        assertEquals("Conversion from cm to mm did not work", 45.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthCmToMile() {
        double result = unitConverter.convertLength("Centimetre", "Mile", 4.0);
        assertEquals("Conversion from cm to mile did not work", 0.0000248549, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthCmToYard() {
        double result = unitConverter.convertLength("Centimetre", "Yard", 4.0);
        assertEquals("Conversion from cm to yard did not work", 0.0437445, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthCmToFeet() {
        double result = unitConverter.convertLength("Centimetre", "Feet", 4.0);
        assertEquals("Conversion from cm to foot did not work", 0.131234, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthCmToInch() {
        double result = unitConverter.convertLength("Centimetre", "Inch", 4.0);
        assertEquals("Conversion from cm to inch did not work", 1.5748, result, 0.001);
        //The message here is displayed if the test fails
    }
}
