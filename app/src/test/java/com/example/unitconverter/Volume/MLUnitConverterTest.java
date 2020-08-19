package com.example.unitconverter.Volume;

import com.example.unitconverter.UnitConverter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MLUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testVolumeToLitre() {
        double result = unitConverter.convertVolume("Millilitre", "Litre", 200.0);
        assertEquals("Conversion from ml to litre did not work", 0.2, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToMillilitre() {
        double result = unitConverter.convertVolume("Millilitre", "Millilitre", 200.0);
        assertEquals("Conversion from ml to millilitre did not work", 200.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToGallon() {
        double result = unitConverter.convertVolume("Millilitre", "Gallon", 200.0);
        assertEquals("Conversion from ml to gallon did not work", 0.0439938, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToQuart() {
        double result = unitConverter.convertVolume("Millilitre", "Quart", 200.0);
        assertEquals("Conversion from ml to quart did not work", 0.175975, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToPint() {
        double result = unitConverter.convertVolume("Millilitre", "Pint", 200.0);
        assertEquals("Conversion from ml to pint did not work", 0.351951, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToCup() {
        double result = unitConverter.convertVolume("Millilitre", "Cup", 200.0);
        assertEquals("Conversion from ml to cup did not work", 0.703902, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToFluidOunce() {
        double result = unitConverter.convertVolume("Millilitre", "Fluid Ounce", 200.0);
        assertEquals("Conversion from ml to floz did not work", 7.03902, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToTablespoon() {
        double result = unitConverter.convertVolume("Millilitre", "Tablespoon", 200.0);
        assertEquals("Conversion from ml to tbsp did not work", 11.2624, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testVolumeToTeaspoon() {
        double result = unitConverter.convertVolume("Millilitre", "Teaspoon", 200.0);
        assertEquals("Conversion from ml to tsp did not work", 33.7894914682, result, 0.001);
        //The message here is displayed if the test fails
    }
}
