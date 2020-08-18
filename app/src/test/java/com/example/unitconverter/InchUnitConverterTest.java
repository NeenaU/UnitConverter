package com.example.unitconverter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class InchUnitConverterTest {

    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testLengthInchToKm() {
        double result = unitConverter.convertLength("Inch", "Kilometre", 4.0);
        assertEquals("Conversion from inch to km did not work", 0.0001016, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthInchToM() {
        double result = unitConverter.convertLength("Inch", "Metre", 4.0);
        assertEquals("Conversion from inch to m did not work", 0.1016, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthInchToCm() {
        double result = unitConverter.convertLength("Inch", "Centimetre", 4.0);
        assertEquals("Conversion from inch to cm did not work", 10.16, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthInchToMm() {
        double result = unitConverter.convertLength("Inch", "Millimetre", 4.0);
        assertEquals("Conversion from inch to mm did not work", 101.6, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthInchToMile() {
        double result = unitConverter.convertLength("Inch", "Mile", 4.0);
        assertEquals("Conversion from inch to mile did not work", 0.00006313131, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthInchToYard() {
        double result = unitConverter.convertLength("Inch", "Yard", 4.0);
        assertEquals("Conversion from inch to yard did not work", 0.111111, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthInchToFeet() {
        double result = unitConverter.convertLength("Inch", "Feet", 4.0);
        assertEquals("Conversion from inch to foot did not work", 0.333333, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthInchToInch() {
        double result = unitConverter.convertLength("Inch", "Inch", 4.0);
        assertEquals("Conversion from inch to inch did not work", 4.0, result, 0.001);
        //The message here is displayed if the test fails
    }
}
