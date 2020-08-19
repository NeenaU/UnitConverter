package com.example.unitconverter.Volume;

import com.example.unitconverter.UnitConverter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TspUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testVolumeToLitre() {
        double result = unitConverter.convertVolume("Teaspoon", "Litre", 800.3);
        assertEquals("Conversion from tsp to litre did not work", 4.73550295858, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToMillilitre() {
        double result = unitConverter.convertVolume("Teaspoon", "Millilitre", 800.3);
        assertEquals("Conversion from tsp to millilitre did not work", 4736.9757, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToGallon() {
        double result = unitConverter.convertVolume("Teaspoon", "Gallon", 800.3);
        assertEquals("Conversion from tsp to gallon did not work", 1.0420577, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToQuart() {
        double result = unitConverter.convertVolume("Teaspoon", "Quart", 800.3);
        assertEquals("Conversion from tsp to quart did not work", 4.1682309, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToPint() {
        double result = unitConverter.convertVolume("Teaspoon", "Pint", 800.3);
        assertEquals("Conversion from tsp to pint did not work", 8.3364618, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToCup() {
        double result = unitConverter.convertVolume("Teaspoon", "Cup", 800.3);
        assertEquals("Conversion from tsp to cup did not work", 16.672925, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToFluidOunce() {
        double result = unitConverter.convertVolume("Teaspoon", "Fluid Ounce", 800.3);
        assertEquals("Conversion from tsp to floz did not work", 166.72924, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToTablespoon() {
        double result = unitConverter.convertVolume("Teaspoon", "Tablespoon", 800.3);
        assertEquals("Conversion from tsp to tbsp did not work", 266.76667, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToTeaspoon() {
        double result = unitConverter.convertVolume("Teaspoon", "Teaspoon", 800.3);
        assertEquals("Conversion from tsp to tsp did not work", 800.3, result, 0.001);
        //The message here is displayed if the test fails
    }
}
