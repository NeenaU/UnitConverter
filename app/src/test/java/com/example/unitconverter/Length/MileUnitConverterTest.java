package com.example.unitconverter.Length;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.example.unitconverter.UnitConverter;

public class MileUnitConverterTest {

    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testLengthMileToKm() {
        double result = unitConverter.convertLength("Mile", "Kilometre", 4.0);
        assertEquals("Conversion from mile to km did not work", 6.43738, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthMileToM() {
        double result = unitConverter.convertLength("Mile", "Metre", 4.0);
        assertEquals("Conversion from mile to m did not work", 6437.376, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthMileToCm() {
        double result = unitConverter.convertLength("Mile", "Centimetre", 4.0);
        assertEquals("Conversion from mile to cm did not work", 643737.6, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthMileToMm() {
        double result = unitConverter.convertLength("Mile", "Millimetre", 4.0);
        assertEquals("Conversion from mile to mm did not work", 6437376, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthMileToMile() {
        double result = unitConverter.convertLength("Mile", "Mile", 4.0);
        assertEquals("Conversion from mile to mile did not work", 4.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthMileToYard() {
        double result = unitConverter.convertLength("Mile", "Yard", 4.0);
        assertEquals("Conversion from mile to yard did not work", 7040, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthMileToFeet() {
        double result = unitConverter.convertLength("Mile", "Feet", 4.0);
        assertEquals("Conversion from mile to foot did not work", 21120, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testLengthMileToInch() {
        double result = unitConverter.convertLength("Mile", "Inch", 4.0);
        assertEquals("Conversion from mile to inch did not work", 253440, result, 0.001);
        //The message here is displayed if the test fails
    }
}
