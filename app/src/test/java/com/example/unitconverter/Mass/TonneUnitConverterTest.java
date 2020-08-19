package com.example.unitconverter.Mass;

import com.example.unitconverter.UnitConverter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TonneUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testMassTonneToTonne() {
        double result = unitConverter.convertMass("Tonne", "Tonne", 0.5);
        assertEquals("Conversion from tonne to tonne did not work", 0.5, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassTonneToKg() {
        double result = unitConverter.convertMass("Tonne", "Kilogram", 0.5);
        assertEquals("Conversion from tonne to kg did not work", 500, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassTonneToG() {
        double result = unitConverter.convertMass("Tonne", "Gram", 0.5);
        assertEquals("Conversion from tonne to g did not work", 500000, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassTonneToStone() {
        double result = unitConverter.convertMass("Tonne", "Stone", 0.5);
        assertEquals("Conversion from tonne to stone did not work", 78.5, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassTonneToPound() {
        double result = unitConverter.convertMass("Tonne", "Pound", 0.5);
        assertEquals("Conversion from tonne to pound did not work", 1102.5, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassTonneToOunce() {
        double result = unitConverter.convertMass("Tonne", "Ounce", 0.5);
        assertEquals("Conversion from tonne to ounce did not work", 17637, result, 0.001);
        //The message here is displayed if the test fails
    }
}
