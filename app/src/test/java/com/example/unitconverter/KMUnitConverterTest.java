package com.example.unitconverter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KMUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testLengthKmToKm() {
        double result = unitConverter.convertLength("Kilometre", "Kilometre", 4.0);
        assertEquals("Conversion from km to km did not work", 4.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthKmToM() {
        double result = unitConverter.convertLength("Kilometre", "Metre", 4.0);
        assertEquals("Conversion from km to m did not work", 4000.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthKmToCm() {
        double result = unitConverter.convertLength("Kilometre", "Centimetre", 4.0);
        assertEquals("Conversion from km to cm did not work", 400000.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthKmToMm() {
        double result = unitConverter.convertLength("Kilometre", "Millimetre", 4.0);
        assertEquals("Conversion from km to mm did not work", 4000000.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthKmToMile() {
        double result = unitConverter.convertLength("Kilometre", "Mile", 4.0);
        assertEquals("Conversion from km to mile did not work", 2.48548, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthKmToYard() {
        double result = unitConverter.convertLength("Kilometre", "Yard", 4.0);
        assertEquals("Conversion from km to yard did not work", 4374.453193, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthKmToFeet() {
        double result = unitConverter.convertLength("Kilometre", "Feet", 4.0);
        assertEquals("Conversion from km to foot did not work", 13123.359579, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthKmToInch() {
        double result = unitConverter.convertLength("Kilometre", "Inch", 4.0);
        assertEquals("Conversion from km to inch did not work", 157480.314948, result, 0.001);
        //The message here is displayed if the test fails
    }

}