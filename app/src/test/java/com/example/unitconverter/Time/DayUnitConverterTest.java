package com.example.unitconverter.Time;

import com.example.unitconverter.UnitConverter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DayUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testTimeToSecond() {
        double result = unitConverter.convertTime("Day", "Second", 7.5);
        assertEquals("Conversion from day to second did not work", 648000, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToMinute() {
        double result = unitConverter.convertTime("Day", "Minute", 7.5);
        assertEquals("Conversion from day to minute did not work", 10800, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToHour() {
        double result = unitConverter.convertTime("Day", "Hour", 7.5);
        assertEquals("Conversion from day to hour did not work", 180, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToDay() {
        double result = unitConverter.convertTime("Day", "Day", 7.5);
        assertEquals("Conversion from day to day did not work", 7.5, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToWeek() {
        double result = unitConverter.convertTime("Day", "Week", 7.5);
        assertEquals("Conversion from day to week did not work", 1.07143, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToMonth() {
        double result = unitConverter.convertTime("Day", "Month", 7.5);
        assertEquals("Conversion from day to month did not work", 0.2465726403, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToYear() {
        double result = unitConverter.convertTime("Day", "Year", 7.5);
        assertEquals("Conversion from day to year did not work", 0.0205479, result, 0.001);
        //The message here is displayed if the test fails
    }
}
