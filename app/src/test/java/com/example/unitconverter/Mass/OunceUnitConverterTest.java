package com.example.unitconverter.Mass;

import com.example.unitconverter.UnitConverter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OunceUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testMassOunceToTonne() {
        double result = unitConverter.convertMass("Ounce", "Tonne", 100.4);
        assertEquals("Conversion from ounce to tonne did not work", 0.0028462921, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassOunceToKg() {
        double result = unitConverter.convertMass("Ounce", "Kilogram", 100.4);
        assertEquals("Conversion from ounce to kg did not work", 2.8462921, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassOunceToG() {
        double result = unitConverter.convertMass("Ounce", "Gram", 100.4);
        assertEquals("Conversion from ounce to g did not work", 2846.34, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassOunceToStone() {
        double result = unitConverter.convertMass("Ounce", "Stone", 100.4);
        assertEquals("Conversion from ounce to stone did not work", 0.44821429, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassOunceToPound() {
        double result = unitConverter.convertMass("Ounce", "Pound", 100.4);
        assertEquals("Conversion from ounce to pound did not work", 6.275, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassOunceToOunce() {
        double result = unitConverter.convertMass("Ounce", "Ounce", 100.4);
        assertEquals("Conversion from ounce to ounce did not work", 100.4, result, 0.001);
        //The message here is displayed if the test fails
    }
}
