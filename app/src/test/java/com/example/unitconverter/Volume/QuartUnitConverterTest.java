package com.example.unitconverter.Volume;

import com.example.unitconverter.UnitConverter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class QuartUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testVolumeToLitre() {
        double result = unitConverter.convertVolume("Quart", "Litre", 0.5);
        assertEquals("Conversion from quart to litre did not work", 0.568261, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToMillilitre() {
        double result = unitConverter.convertVolume("Quart", "Millilitre", 0.5);
        assertEquals("Conversion from quart to millilitre did not work", 568.5, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToGallon() {
        double result = unitConverter.convertVolume("Quart", "Gallon", 0.501);
        assertEquals("Conversion from quart to gallon did not work", 0.125, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToQuart() {
        double result = unitConverter.convertVolume("Quart", "Quart", 0.5);
        assertEquals("Conversion from quart to quart did not work", 0.5, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToPint() {
        double result = unitConverter.convertVolume("Quart", "Pint", 0.5);
        assertEquals("Conversion from quart to pint did not work", 1.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToCup() {
        double result = unitConverter.convertVolume("Quart", "Cup", 0.5);
        assertEquals("Conversion from quart to cup did not work", 2.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToFluidOunce() {
        double result = unitConverter.convertVolume("Quart", "Fluid Ounce", 0.5);
        assertEquals("Conversion from quart to floz did not work", 20.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToTablespoon() {
        double result = unitConverter.convertVolume("Quart", "Tablespoon", 0.5);
        assertEquals("Conversion from quart to tbsp did not work", 32.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToTeaspoon() {
        double result = unitConverter.convertVolume("Quart", "Teaspoon", 0.5);
        assertEquals("Conversion from quart to tsp did not work", 96.0, result, 0.001);
        //The message here is displayed if the test fails
    }
}
