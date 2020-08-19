package com.example.unitconverter.Time;

import com.example.unitconverter.UnitConverter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MonthUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testTimeToSecond() {
        double result = unitConverter.convertTime("Month", "Second", 0.1);
        assertEquals("Conversion from month to second did not work", 262800, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToMinute() {
        double result = unitConverter.convertTime("Month", "Minute", 0.1);
        assertEquals("Conversion from month to minute did not work", 4380, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToHour() {
        double result = unitConverter.convertTime("Month", "Hour", 0.1);
        assertEquals("Conversion from month to hour did not work", 73.0001, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToDay() {
        double result = unitConverter.convertTime("Month", "Day", 0.1);
        assertEquals("Conversion from month to day did not work", 3.04167, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToWeek() {
        double result = unitConverter.convertTime("Month", "Week", 0.1);
        assertEquals("Conversion from month to week did not work", 0.434524, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToMonth() {
        double result = unitConverter.convertTime("Month", "Month", 0.1);
        assertEquals("Conversion from month to month did not work", 0.1, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToYear() {
        double result = unitConverter.convertTime("Month", "Year", 0.1);
        assertEquals("Conversion from month to year did not work", 0.00833334, result, 0.001);
        //The message here is displayed if the test fails
    }
}
