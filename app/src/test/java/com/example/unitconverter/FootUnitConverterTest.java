package com.example.unitconverter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FootUnitConverterTest {

    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testLengthFootToKm() {
        double result = unitConverter.convertLength("Feet", "Kilometre", 4.0);
        assertEquals("Conversion from foot to km did not work", 0.0012192, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthFootToM() {
        double result = unitConverter.convertLength("Feet", "Metre", 4.0);
        assertEquals("Conversion from foot to m did not work", 1.2192, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthFootToCm() {
        double result = unitConverter.convertLength("Feet", "Centimetre", 4.0);
        assertEquals("Conversion from foot to cm did not work", 121.92, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthFootToMm() {
        double result = unitConverter.convertLength("Feet", "Millimetre", 4.0);
        assertEquals("Conversion from foot to mm did not work", 1219.2, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthFootToMile() {
        double result = unitConverter.convertLength("Feet", "Mile", 4.0);
        assertEquals("Conversion from foot to mile did not work", 0.000757576, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthFootToYard() {
        double result = unitConverter.convertLength("Feet", "Yard", 4.0);
        assertEquals("Conversion from foot to yard did not work", 1.33333, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthFootToFeet() {
        double result = unitConverter.convertLength("Feet", "Feet", 4.0);
        assertEquals("Conversion from foot to foot did not work", 4.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthFootToInch() {
        double result = unitConverter.convertLength("Feet", "Inch", 4.0);
        assertEquals("Conversion from foot to inch did not work", 48.0, result, 0.001);
        //The message here is displayed if the test fails
    }
}
