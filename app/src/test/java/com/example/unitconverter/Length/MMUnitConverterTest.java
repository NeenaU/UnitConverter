package com.example.unitconverter.Length;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.example.unitconverter.UnitConverter;

public class MMUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testLengthMmToKm() {
        double result = unitConverter.convertLength("Millimetre", "Kilometre", 4000.0);
        assertEquals("Conversion from mm to km did not work", 0.004, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthMmToM() {
        double result = unitConverter.convertLength("Millimetre", "Metre", 4000.0);
        assertEquals("Conversion from mm to m did not work", 4.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthMmToCm() {
        double result = unitConverter.convertLength("Millimetre", "Centimetre", 4000.0);
        assertEquals("Conversion from mm to cm did not work", 400.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthMmToMm() {
        double result = unitConverter.convertLength("Millimetre", "Millimetre", 4.0);
        assertEquals("Conversion from mm to mm did not work", 4.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthMmToMile() {
        double result = unitConverter.convertLength("Millimetre", "Mile", 4000.0);
        assertEquals("Conversion from mm to mile did not work", 0.002485485, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthMmToYard() {
        double result = unitConverter.convertLength("Millimetre", "Yard", 4000.0);
        assertEquals("Conversion from mm to yard did not work", 4.37636761488, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthMmToFeet() {
        double result = unitConverter.convertLength("Millimetre", "Feet", 4000.0);
        assertEquals("Conversion from mm to foot did not work", 13.1147540984, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthMmToInch() {
        double result = unitConverter.convertLength("Millimetre", "Inch", 4000.0);
        assertEquals("Conversion from mm to inch did not work", 157.480314961, result, 0.001);
        //The message here is displayed if the test fails
    }
}
