package com.example.unitconverter.Time;

import com.example.unitconverter.UnitConverter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WeekUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testTimeToSecond() {
        double result = unitConverter.convertTime("Week", "Second", 0.1);
        assertEquals("Conversion from week to second did not work", 60480, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToMinute() {
        double result = unitConverter.convertTime("Week", "Minute", 0.1);
        assertEquals("Conversion from week to minute did not work", 1008, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToHour() {
        double result = unitConverter.convertTime("Week", "Hour", 0.1);
        assertEquals("Conversion from week to hour did not work", 16.8, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToDay() {
        double result = unitConverter.convertTime("Week", "Day", 0.1);
        assertEquals("Conversion from week to day did not work", 0.7, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToWeek() {
        double result = unitConverter.convertTime("Week", "Week", 0.1);
        assertEquals("Conversion from week to week did not work", 0.1, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToMonth() {
        double result = unitConverter.convertTime("Week", "Month", 0.1);
        assertEquals("Conversion from week to month did not work", 0.0230137, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToYear() {
        double result = unitConverter.convertTime("Week", "Year", 0.1);
        assertEquals("Conversion from week to year did not work", 0.00191781, result, 0.001);
        //The message here is displayed if the test fails
    }
}
