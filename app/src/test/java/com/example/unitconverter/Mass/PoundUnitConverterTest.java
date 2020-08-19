package com.example.unitconverter.Mass;

import com.example.unitconverter.UnitConverter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PoundUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testMassPoundToTonne() {
        double result = unitConverter.convertMass("Pound", "Tonne", 25.0);
        assertEquals("Conversion from pound to tonne did not work", 0.0113398, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassPoundToKg() {
        double result = unitConverter.convertMass("Pound", "Kilogram", 25.0);
        assertEquals("Conversion from pound to kg did not work", 11.3378684807, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassPoundToG() {
        double result = unitConverter.convertMass("Pound", "Gram", 25.0);
        assertEquals("Conversion from pound to g did not work", 11350, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassPoundToStone() {
        double result = unitConverter.convertMass("Pound", "Stone", 25.0);
        assertEquals("Conversion from pound to stone did not work", 1.78571, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassPoundToPound() {
        double result = unitConverter.convertMass("Pound", "Pound", 25.0);
        assertEquals("Conversion from pound to pound did not work", 25.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassPoundToOunce() {
        double result = unitConverter.convertMass("Pound", "Ounce", 25.0);
        assertEquals("Conversion from pound to ounce did not work", 400, result, 0.001);
        //The message here is displayed if the test fails
    }
}
