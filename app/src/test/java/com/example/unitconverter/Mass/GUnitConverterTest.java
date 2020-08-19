package com.example.unitconverter.Mass;

import com.example.unitconverter.UnitConverter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testMassGToTonne() {
        double result = unitConverter.convertMass("Gram", "Tonne", 4000.0);
        assertEquals("Conversion from g to tonne did not work", 0.004, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassGToKg() {
        double result = unitConverter.convertMass("Gram", "Kilogram", 4000.0);
        assertEquals("Conversion from g to kg did not work", 4.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassGToG() {
        double result = unitConverter.convertMass("Gram", "Gram", 4000.0);
        assertEquals("Conversion from g to g did not work", 4000.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassGToStone() {
        double result = unitConverter.convertMass("Gram", "Stone", 4000.0);
        assertEquals("Conversion from g to stone did not work", 0.6298922, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassGToPound() {
        double result = unitConverter.convertMass("Gram", "Pound", 4000.0);
        assertEquals("Conversion from g to pound did not work", 8.81057268722, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testMassGToOunce() {
        double result = unitConverter.convertMass("Gram", "Ounce", 4000.0);
        assertEquals("Conversion from g to ounce did not work", 141.093474427, result, 0.001);
        //The message here is displayed if the test fails
    }

}
