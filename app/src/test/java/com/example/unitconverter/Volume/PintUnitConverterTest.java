package com.example.unitconverter.Volume;

import com.example.unitconverter.UnitConverter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PintUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testVolumeToLitre() {
        double result = unitConverter.convertVolume("Pint", "Litre", 2.5);
        assertEquals("Conversion from pint to litre did not work", 1.42065, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToMillilitre() {
        double result = unitConverter.convertVolume("Pint", "Millilitre", 2.5);
        assertEquals("Conversion from pint to millilitre did not work", 1420, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToGallon() {
        double result = unitConverter.convertVolume("Pint", "Gallon", 2.5);
        assertEquals("Conversion from pint to gallon did not work", 0.3125, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToQuart() {
        double result = unitConverter.convertVolume("Pint", "Quart", 2.5);
        assertEquals("Conversion from pint to quart did not work", 1.25, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToPint() {
        double result = unitConverter.convertVolume("Pint", "Pint", 2.5);
        assertEquals("Conversion from pint to pint did not work", 2.5, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToCup() {
        double result = unitConverter.convertVolume("Pint", "Cup", 2.5);
        assertEquals("Conversion from pint to cup did not work", 5, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToFluidOunce() {
        double result = unitConverter.convertVolume("Pint", "Fluid Ounce", 2.5);
        assertEquals("Conversion from pint to floz did not work", 50, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToTablespoon() {
        double result = unitConverter.convertVolume("Pint", "Tablespoon", 2.5);
        assertEquals("Conversion from pint to tbsp did not work", 80, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToTeaspoon() {
        double result = unitConverter.convertVolume("Pint", "Teaspoon", 2.5);
        assertEquals("Conversion from pint to tsp did not work", 240, result, 0.001);
        //The message here is displayed if the test fails
    }
}
