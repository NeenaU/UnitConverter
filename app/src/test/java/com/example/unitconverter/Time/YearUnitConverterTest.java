package com.example.unitconverter.Time;

import com.example.unitconverter.UnitConverter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class YearUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testTimeToSecond() {
        double result = unitConverter.convertTime("Year", "Second", 0.01);
        assertEquals("Conversion from year to second did not work", 315360, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToMinute() {
        double result = unitConverter.convertTime("Year", "Minute", 0.01);
        assertEquals("Conversion from year to minute did not work", 5256, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToHour() {
        double result = unitConverter.convertTime("Year", "Hour", 0.01);
        assertEquals("Conversion from year to hour did not work", 87.6, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToDay() {
        double result = unitConverter.convertTime("Year", "Day", 0.01);
        assertEquals("Conversion from year to day did not work", 3.65, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToWeek() {
        double result = unitConverter.convertTime("Year", "Week", 0.01);
        assertEquals("Conversion from year to week did not work", 0.5214286, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToMonth() {
        double result = unitConverter.convertTime("Year", "Month", 0.01);
        assertEquals("Conversion from year to month did not work", 0.1199999, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToYear() {
        double result = unitConverter.convertTime("Year", "Year", 0.01);
        assertEquals("Conversion from year to year did not work", 0.01, result, 0.001);
        //The message here is displayed if the test fails
    }
}
