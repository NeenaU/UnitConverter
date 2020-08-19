package com.example.unitconverter.Volume;

import com.example.unitconverter.UnitConverter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TbspUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testVolumeToLitre() {
        double result = unitConverter.convertVolume("Tablespoon", "Litre", 500.0);
        assertEquals("Conversion from tbsp to litre did not work", 8.87909, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToMillilitre() {
        double result = unitConverter.convertVolume("Tablespoon", "Millilitre", 500.0);
        assertEquals("Conversion from tbsp to millilitre did not work", 8879, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToGallon() {
        double result = unitConverter.convertVolume("Tablespoon", "Gallon", 500.0);
        assertEquals("Conversion from tbsp to gallon did not work", 1.95313, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToQuart() {
        double result = unitConverter.convertVolume("Tablespoon", "Quart", 500.0);
        assertEquals("Conversion from tbsp to quart did not work", 7.8125, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToPint() {
        double result = unitConverter.convertVolume("Tablespoon", "Pint", 500.0);
        assertEquals("Conversion from tbsp to pint did not work", 15.625, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToCup() {
        double result = unitConverter.convertVolume("Tablespoon", "Cup", 500.0);
        assertEquals("Conversion from tbsp to cup did not work", 31.25, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToFluidOunce() {
        double result = unitConverter.convertVolume("Tablespoon", "Fluid Ounce", 500.0);
        assertEquals("Conversion from tbsp to floz did not work", 312.5, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToTablespoon() {
        double result = unitConverter.convertVolume("Tablespoon", "Tablespoon", 500.0);
        assertEquals("Conversion from tbsp to tbsp did not work", 500.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToTeaspoon() {
        double result = unitConverter.convertVolume("Tablespoon", "Teaspoon", 500.0);
        assertEquals("Conversion from tbsp to tsp did not work", 1500.0, result, 0.001);
        //The message here is displayed if the test fails
    }
}
