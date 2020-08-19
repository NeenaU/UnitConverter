package com.example.unitconverter.Volume;

import com.example.unitconverter.UnitConverter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GallonUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testVolumeToLitre() {
        double result = unitConverter.convertVolume("Gallon", "Litre", 3.0);
        assertEquals("Conversion from gallon to litre did not work", 13.6383, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToMillilitre() {
        double result = unitConverter.convertVolume("Gallon", "Millilitre", 3.0);
        assertEquals("Conversion from gallon to millilitre did not work", 13638, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToGallon() {
        double result = unitConverter.convertVolume("Gallon", "Gallon", 3.0);
        assertEquals("Conversion from gallon to gallon did not work", 3.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToQuart() {
        double result = unitConverter.convertVolume("Gallon", "Quart", 3.0);
        assertEquals("Conversion from gallon to quart did not work", 12.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToPint() {
        double result = unitConverter.convertVolume("Gallon", "Pint", 3.0);
        assertEquals("Conversion from gallon to pint did not work", 24.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToCup() {
        double result = unitConverter.convertVolume("Gallon", "Cup", 3.0);
        assertEquals("Conversion from gallon to cup did not work", 48.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToFluidOunce() {
        double result = unitConverter.convertVolume("Gallon", "Fluid Ounce", 3.0);
        assertEquals("Conversion from gallon to floz did not work", 480.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToTablespoon() {
        double result = unitConverter.convertVolume("Gallon", "Tablespoon", 3.0);
        assertEquals("Conversion from gallon to tbsp did not work", 768.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToTeaspoon() {
        double result = unitConverter.convertVolume("Gallon", "Teaspoon", 3.0);
        assertEquals("Conversion from gallon to tsp did not work", 2304.0, result, 0.001);
        //The message here is displayed if the test fails
    }
}
