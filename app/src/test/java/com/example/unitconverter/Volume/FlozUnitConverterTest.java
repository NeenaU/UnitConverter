package com.example.unitconverter.Volume;

import com.example.unitconverter.UnitConverter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FlozUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testVolumeToLitre() {
        double result = unitConverter.convertVolume("Fluid Ounce", "Litre", 10.4);
        assertEquals("Conversion from floz to litre did not work", 0.2954959, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToMillilitre() {
        double result = unitConverter.convertVolume("Fluid Ounce", "Millilitre", 10.4);
        assertEquals("Conversion from floz to millilitre did not work", 295.4959, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToGallon() {
        double result = unitConverter.convertVolume("Fluid Ounce", "Gallon", 10.4);
        assertEquals("Conversion from floz to gallon did not work", 0.065, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToQuart() {
        double result = unitConverter.convertVolume("Fluid Ounce", "Quart", 10.4);
        assertEquals("Conversion from floz to quart did not work", 0.26, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToPint() {
        double result = unitConverter.convertVolume("Fluid Ounce", "Pint", 10.4);
        assertEquals("Conversion from floz to pint did not work", 0.52, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToCup() {
        double result = unitConverter.convertVolume("Fluid Ounce", "Cup", 10.4);
        assertEquals("Conversion from floz to cup did not work", 1.04, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToFluidOunce() {
        double result = unitConverter.convertVolume("Fluid Ounce", "Fluid Ounce", 10.4);
        assertEquals("Conversion from floz to floz did not work", 10.4, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToTablespoon() {
        double result = unitConverter.convertVolume("Fluid Ounce", "Tablespoon", 10.4);
        assertEquals("Conversion from floz to tbsp did not work", 16.63999, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToTeaspoon() {
        double result = unitConverter.convertVolume("Fluid Ounce", "Teaspoon", 10.4);
        assertEquals("Conversion from floz to tsp did not work", 49.91998, result, 0.001);
        //The message here is displayed if the test fails
    }
}
