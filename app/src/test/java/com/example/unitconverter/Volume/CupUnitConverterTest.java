package com.example.unitconverter.Volume;

import com.example.unitconverter.UnitConverter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CupUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testVolumeToLitre() {
        double result = unitConverter.convertVolume("Cup", "Litre", 1.5);
        assertEquals("Conversion from cup to litre did not work", 0.426196, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToMillilitre() {
        double result = unitConverter.convertVolume("Cup", "Millilitre", 1.5);
        assertEquals("Conversion from cup to millilitre did not work", 426, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToGallon() {
        double result = unitConverter.convertVolume("Cup", "Gallon", 1.5);
        assertEquals("Conversion from cup to gallon did not work", 0.09375, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToQuart() {
        double result = unitConverter.convertVolume("Cup", "Quart", 1.5);
        assertEquals("Conversion from cup to quart did not work", 0.375, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToPint() {
        double result = unitConverter.convertVolume("Cup", "Pint", 1.5);
        assertEquals("Conversion from cup to pint did not work", 0.75, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToCup() {
        double result = unitConverter.convertVolume("Cup", "Cup", 1.5);
        assertEquals("Conversion from cup to cup did not work", 1.5, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToFluidOunce() {
        double result = unitConverter.convertVolume("Cup", "Fluid Ounce", 1.5);
        assertEquals("Conversion from cup to floz did not work", 15, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToTablespoon() {
        double result = unitConverter.convertVolume("Cup", "Tablespoon", 1.5);
        assertEquals("Conversion from cup to tbsp did not work", 24, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToTeaspoon() {
        double result = unitConverter.convertVolume("Cup", "Teaspoon", 1.5);
        assertEquals("Conversion from cup to tsp did not work", 72, result, 0.001);
        //The message here is displayed if the test fails
    }
}
