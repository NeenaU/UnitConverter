package com.example.unitconverter.Time;

import com.example.unitconverter.UnitConverter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SecondUnitConverterTest {
    private UnitConverter unitConverter = new UnitConverter();

    @Test
    public void testTimeToSecond() {
        double result = unitConverter.convertTime("Second", "Second", 100000.0);
        assertEquals("Conversion from second to second did not work", 100000.0, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToMinute() {
        double result = unitConverter.convertTime("Second", "Minute", 100000.0);
        assertEquals("Conversion from second to minute did not work", 1666.6667, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToHour() {
        double result = unitConverter.convertTime("Second", "Hour", 100000.0);
        assertEquals("Conversion from second to hour did not work", 27.777778, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToDay() {
        double result = unitConverter.convertTime("Second", "Day", 100000.0);
        assertEquals("Conversion from second to day did not work", 1.1574074, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToWeek() {
        double result = unitConverter.convertTime("Second", "Week", 100000.0);
        assertEquals("Conversion from second to week did not work", 0.16534392, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToMonth() {
        double result = unitConverter.convertTime("Second", "Month", 100000.0);
        assertEquals("Conversion from second to month did not work", 0.03805175038, result, 0.001);
        //The message here is displayed if the test fails
    }

    @Test
    public void testTimeToYear() {
        double result = unitConverter.convertTime("Second", "Year", 100000.0);
        assertEquals("Conversion from second to year did not work", 0.00317057704, result, 0.001);
        //The message here is displayed if the test fails
    }
}
