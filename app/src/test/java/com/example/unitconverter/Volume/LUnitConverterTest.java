package com.example.unitconverter.Volume;

import com.example.unitconverter.UnitConverter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testVolumeToLitre() {
        double result = unitConverter.convertVolume("Litre", "Litre", 2.0);
        assertEquals("Conversion from litre to litre did not work", 2.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToMillilitre() {
        double result = unitConverter.convertVolume("Litre", "Millilitre", 2.0);
        assertEquals("Conversion from litre to millilitre did not work", 2000, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToGallon() {
        double result = unitConverter.convertVolume("Litre", "Gallon", 2.0);
        assertEquals("Conversion from litre to gallon did not work", 0.439938, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToQuart() {
        double result = unitConverter.convertVolume("Litre", "Quart", 2.0);
        assertEquals("Conversion from litre to quart did not work", 1.75975, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToPint() {
        double result = unitConverter.convertVolume("Litre", "Pint", 2.0);
        assertEquals("Conversion from litre to pint did not work", 3.51951, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToCup() {
        double result = unitConverter.convertVolume("Litre", "Cup", 2.0);
        assertEquals("Conversion from litre to cup did not work", 7.03902, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToFluidOunce() {
        double result = unitConverter.convertVolume("Litre", "Fluid Ounce", 2.0);
        assertEquals("Conversion from litre to floz did not work", 70.3902, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToTablespoon() {
        double result = unitConverter.convertVolume("Litre", "Tablespoon", 2.0);
        assertEquals("Conversion from litre to tbsp did not work", 112.624, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToTeaspoon() {
        double result = unitConverter.convertVolume("Litre", "Teaspoon", 2.0);
        assertEquals("Conversion from litre to tsp did not work", 338, result, 0.001);
        //The message here is displayed if the test fails
    }
}
