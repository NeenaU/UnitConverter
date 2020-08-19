package com.example.unitconverter.Mass;

import com.example.unitconverter.UnitConverter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StoneUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testMassStoneToTonne() {
        double result = unitConverter.convertMass("Stone", "Tonne", 5.0);
        assertEquals("Conversion from stone to tonne did not work", 0.03184713375, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassStoneToKg() {
        double result = unitConverter.convertMass("Stone", "Kilogram", 5.0);
        assertEquals("Conversion from stone to kg did not work", 31.75, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassStoneToG() {
        double result = unitConverter.convertMass("Stone", "Gram", 5.0);
        assertEquals("Conversion from stone to g did not work", 31750, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassStoneToStone() {
        double result = unitConverter.convertMass("Stone", "Stone", 5.0);
        assertEquals("Conversion from stone to stone did not work", 5.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassStoneToPound() {
        double result = unitConverter.convertMass("Stone", "Pound", 5.0);
        assertEquals("Conversion from stone to pound did not work", 70.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassStoneToOunce() {
        double result = unitConverter.convertMass("Stone", "Ounce", 5.0);
        assertEquals("Conversion from stone to ounce did not work", 1120.0, result, 0.001);
        //The message here is displayed if the test fails
    }
}
