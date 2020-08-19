package com.example.unitconverter.Time;

import com.example.unitconverter.UnitConverter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HourUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testTimeToSecond() {
        double result = unitConverter.convertTime("Hour", "Second", 80.4);
        assertEquals("Conversion from hour to second did not work", 289440, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToMinute() {
        double result = unitConverter.convertTime("Hour", "Minute", 80.4);
        assertEquals("Conversion from hour to minute did not work", 4824, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToHour() {
        double result = unitConverter.convertTime("Hour", "Hour", 80.4);
        assertEquals("Conversion from hour to hour did not work", 80.4, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToDay() {
        double result = unitConverter.convertTime("Hour", "Day", 80.4);
        assertEquals("Conversion from hour to day did not work", 3.35, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToWeek() {
        double result = unitConverter.convertTime("Hour", "Week", 80.4);
        assertEquals("Conversion from hour to week did not work", 0.4785714, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToMonth() {
        double result = unitConverter.convertTime("Hour", "Month", 80.4);
        assertEquals("Conversion from hour to month did not work", 0.1101368590281, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToYear() {
        double result = unitConverter.convertTime("Hour", "Year", 80.4);
        assertEquals("Conversion from hour to year did not work", 0.009178082, result, 0.001);
        //The message here is displayed if the test fails
    }
}
