package com.example.unitconverter.Mass;

import com.example.unitconverter.UnitConverter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PoundUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testMassPoundToTonne() {
        double result = unitConverter.convertMass("Pound", "Tonne", 4000.0);
        assertEquals("Conversion from g to tonne did not work", 0.004, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassPoundToKg() {
        double result = unitConverter.convertMass("Pound", "Kilogram", 4000.0);
        assertEquals("Conversion from g to m did not work", 4.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassPoundToG() {
        double result = unitConverter.convertMass("Pound", "Gram", 4000.0);
        assertEquals("Conversion from g to cm did not work", 4000.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassPoundToStone() {
        double result = unitConverter.convertMass("Pound", "Stone", 4000.0);
        assertEquals("Conversion from g to mm did not work", 0.6298922, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassPoundToPound() {
        double result = unitConverter.convertMass("Pound", "Pound", 4000.0);
        assertEquals("Conversion from g to mile did not work", 8.81057268722, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassPoundToOunce() {
        double result = unitConverter.convertMass("Pound", "Ounce", 4000.0);
        assertEquals("Conversion from g to yard did not work", 141.093474427, result, 0.001);
        //The message here is displayed if the test fails
    }
}
