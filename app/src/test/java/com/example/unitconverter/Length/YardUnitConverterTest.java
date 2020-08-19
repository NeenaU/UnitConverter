package com.example.unitconverter.Length;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.example.unitconverter.UnitConverter;

public class YardUnitConverterTest {

    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testLengthYardToKm() {
        double result = unitConverter.convertLength("Yard", "Kilometre", 4.0);
        assertEquals("Conversion from yard to km did not work", 0.0036576, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthYardToM() {
        double result = unitConverter.convertLength("Yard", "Metre", 4.0);
        assertEquals("Conversion from yard to m did not work", 3.6576, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthYardToCm() {
        double result = unitConverter.convertLength("Yard", "Centimetre", 4.0);
        assertEquals("Conversion from yard to cm did not work", 365.76, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthYardToMm() {
        double result = unitConverter.convertLength("Yard", "Millimetre", 4.0);
        assertEquals("Conversion from yard to mm did not work", 3657.6, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthYardToMile() {
        double result = unitConverter.convertLength("Yard", "Mile", 4.0);
        assertEquals("Conversion from yard to mile did not work", 0.00227273, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthYardToYard() {
        double result = unitConverter.convertLength("Yard", "Yard", 4.0);
        assertEquals("Conversion from yard to yard did not work", 4.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthYardToFeet() {
        double result = unitConverter.convertLength("Yard", "Feet", 4.0);
        assertEquals("Conversion from yard to foot did not work", 12.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthYardToInch() {
        double result = unitConverter.convertLength("Yard", "Inch", 4.0);
        assertEquals("Conversion from yard to inch did not work", 144.0, result, 0.001);
        //The message here is displayed if the test fails
    }
}
