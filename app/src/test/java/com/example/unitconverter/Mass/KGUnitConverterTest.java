package com.example.unitconverter.Mass;

import com.example.unitconverter.UnitConverter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KGUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testMassKgToTonne() {
        double result = unitConverter.convertMass("Kilogram", "Tonne", 40.0);
        assertEquals("Conversion from kg to tonne did not work", 0.04, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassKgToKg() {
        double result = unitConverter.convertMass("Kilogram", "Kilogram", 40.0);
        assertEquals("Conversion from kg to kg did not work", 40.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassKgToG() {
        double result = unitConverter.convertMass("Kilogram", "Gram", 40.0);
        assertEquals("Conversion from kg to g did not work", 40000, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassKgToStone() {
        double result = unitConverter.convertMass("Kilogram", "Stone", 40.0);
        assertEquals("Conversion from kg to stone did not work", 6.29892, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassKgToPound() {
        double result = unitConverter.convertMass("Kilogram", "Pound", 40.0);
        assertEquals("Conversion from kg to pound did not work", 88.2, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassKgToOunce() {
        double result = unitConverter.convertMass("Kilogram", "Ounce", 40.0);
        assertEquals("Conversion from kg to ounce did not work", 1410.96, result, 0.001);
        //The message here is displayed if the test fails
    }
}
