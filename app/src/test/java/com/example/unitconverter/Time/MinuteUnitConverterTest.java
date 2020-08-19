package com.example.unitconverter.Time;

import com.example.unitconverter.UnitConverter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MinuteUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testTimeToSecond() {
        double result = unitConverter.convertTime("Minute", "Second", 100.0);
        assertEquals("Conversion from minute to second did not work", 6000.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToMinute() {
        double result = unitConverter.convertTime("Minute", "Minute", 100.0);
        assertEquals("Conversion from minute to minute did not work", 100, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToHour() {
        double result = unitConverter.convertTime("Minute", "Hour", 100.0);
        assertEquals("Conversion from minute to hour did not work", 1.66667, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToDay() {
        double result = unitConverter.convertTime("Minute", "Day", 100.0);
        assertEquals("Conversion from minute to day did not work", 0.0694444, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToWeek() {
        double result = unitConverter.convertTime("Minute", "Week", 100.0);
        assertEquals("Conversion from minute to week did not work", 0.00992063, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToMonth() {
        double result = unitConverter.convertTime("Minute", "Month", 100.0);
        assertEquals("Conversion from minute to month did not work", 0.0022831, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToYear() {
        double result = unitConverter.convertTime("Minute", "Year", 100.0);
        assertEquals("Conversion from minute to year did not work", 0.000190259, result, 0.001);
        //The message here is displayed if the test fails
    }
}
