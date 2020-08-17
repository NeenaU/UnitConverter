package com.example.unitconverter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UnitConverter {

    //Hashmaps linking each unit in a category to a number
    Map<String, Integer> lengthMap = new HashMap<String, Integer>() {{
        put("Kilometre",0);
        put("Metre",1);
        put("Centimetre",2);
        put("Millimetre",3);
        put("Mile",4);
        put("Yard",5);
        put("Foot",6);
        put("Inch",7);
    }};

    Map<String, Integer> massMap = new HashMap<String, Integer>() {{
        put("Tonne",0);
        put("Kilogram",1);
        put("Gram",2);
        put("Stone",3);
        put("Pound",4);
        put("Ounce",5);
    }};

    Map<String, Integer> volumeMap = new HashMap<String, Integer>() {{
        put("Litre",0);
        put("Millilitre",1);
        put("Gallon",2);
        put("Quart",3);
        put("Pint",4);
        put("Cup",5);
        put("Fluid Ounce",6);
        put("Tablespoon",7);
        put("Teaspoon",7);
    }};

    Map<String, Integer> timeMap = new HashMap<String, Integer>() {{
        put("Second",0);
        put("Minute",1);
        put("Hour",2);
        put("Day",3);
        put("Week",4);
        put("Month",5);
        put("Year",6);
    }};

    Map<String, Integer> tempMap = new HashMap<String, Integer>() {{
        put("Celsius",0);
        put("Fahrenheit",1);
    }};

    ArrayList[][] lengthList = new ArrayList[8][8];

    ArrayList[][] massList = new ArrayList[6][6];
    ArrayList[][] volumeList = new ArrayList[8][8];
    ArrayList[][] timeList = new ArrayList[7][7];
    ArrayList[][] tempList = new ArrayList[2][2];

    public UnitConverter() {

    }

    public double convertLength(String option1, String option2, double number) {
        int length1 = lengthMap.get(option1);
        int length2 = lengthMap.get(option2);
    }

    public double convertMass(String option1, String option2, double number) {
        int mass1 = massMap.get(option1);
        int mass2 = massMap.get(option2);
    }

    public double convertVolume(String option1, String option2, double number) {
        int volume1 = volumeMap.get(option1);
        int volume2 = volumeMap.get(option2);
    }

    public double convertTime(String option1, String option2, double number) {
        int time1 = timeMap.get(option1);
        int time2 = timeMap.get(option2);
    }

    public double convertTemp(String option1, String option2, double number) {
        int temp1 = tempMap.get(option1);
        int temp2 = tempMap.get(option2);
    }
}
