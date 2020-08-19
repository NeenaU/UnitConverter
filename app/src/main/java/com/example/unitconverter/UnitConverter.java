package com.example.unitconverter;

import java.util.ArrayList;
import java.util.Arrays;
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
        put("Feet",6);
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
        put("Teaspoon",8);
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

    ArrayList<ArrayList<Double>> lengthList = new ArrayList<ArrayList<Double>>();
    ArrayList<ArrayList<Double>> massList = new ArrayList<ArrayList<Double>>();
    ArrayList<ArrayList<Double>> volumeList = new ArrayList<ArrayList<Double>>();
    ArrayList<ArrayList<Double>> timeList = new ArrayList<ArrayList<Double>>();

    public UnitConverter() {

        ArrayList<Double> km = new ArrayList<Double>(Arrays.asList(1.0, 1000.0, 100000.0, 1000000.0, 0.62150403977, 1093.6132983, 3280.839895, 39370.0787));
        ArrayList<Double> m = new ArrayList<Double>(Arrays.asList(0.001, 1.0, 100.0, 1000.0, 0.00062150403, 1.0936, 3.281, 39.37));
        ArrayList<Double> cm = new ArrayList<Double>(Arrays.asList(0.00001, 0.01, 1.0, 10.0, 0.00000621372, 0.01093613298, 0.03280839895, 0.3937007874));
        ArrayList<Double> mm = new ArrayList<Double>(Arrays.asList(0.000001, 0.001, 0.1, 1.0, 0.0000006213712121212, 0.0010940919, 0.00327868852, 0.03937007874));
        ArrayList<Double> mile = new ArrayList<Double>(Arrays.asList(1.60934, 1609.344, 160934.4, 1609344.0, 1.0, 1760.0, 5280.0, 63360.0));
        ArrayList<Double> yard = new ArrayList<Double>(Arrays.asList(0.0009144, 0.9144, 91.44, 914.4, 0.000568182, 1.0, 3.0, 36.0));
        ArrayList<Double> foot = new ArrayList<Double>(Arrays.asList(0.0003048, 0.3048, 30.48, 304.8, 0.00018939393, 0.3333333333333, 1.0, 12.0));
        ArrayList<Double> inch = new ArrayList<Double>(Arrays.asList(0.00002540005, 0.0254, 2.54, 25.4, 0.00001578282, 0.0277778, 0.0833334, 1.0));

        lengthList.add(km);
        lengthList.add(m);
        lengthList.add(cm);
        lengthList.add(mm);
        lengthList.add(mile);
        lengthList.add(yard);
        lengthList.add(foot);
        lengthList.add(inch);

        ArrayList<Double> tonne = new ArrayList<Double>(Arrays.asList(1.0, 1000.0, 1000000.0, 157.0, 2205.0, 35274.0));
        ArrayList<Double> kg = new ArrayList<Double>(Arrays.asList(0.001, 1.0, 1000.0, 0.15748031496, 2.205, 35.274));
        ArrayList<Double> g = new ArrayList<Double>(Arrays.asList(0.000001, 0.001, 1.0, 0.00015748031, 0.00220264317, 0.0352733686));
        ArrayList<Double> st = new ArrayList<Double>(Arrays.asList(0.00636942675, 6.35, 6350.0, 1.0, 14.0, 224.0));
        ArrayList<Double> lbs = new ArrayList<Double>(Arrays.asList(0.00045351473, 0.45351473922, 454.0, 0.07142857142, 1.0, 16.0));
        ArrayList<Double> oz = new ArrayList<Double>(Arrays.asList(0.00002834949, 0.02834949254, 28.35, 0.00446428571, 0.0625, 1.0));

        massList.add(tonne);
        massList.add(kg);
        massList.add(g);
        massList.add(st);
        massList.add(lbs);
        massList.add(oz);

        ArrayList<Double> l = new ArrayList<Double>(Arrays.asList(1.0, 1000.0, 0.21997360316, 0.87950747581, 1.76, 3.52, 35.195, 56.312, 169.0));
        ArrayList<Double> ml = new ArrayList<Double>(Arrays.asList(0.001, 1.0, 0.0002199736, 0.00087950747, 0.00176056338, 0.00352112676, 0.03519515714, 0.05631264782, 0.16894745734));
        ArrayList<Double> gallon = new ArrayList<Double>(Arrays.asList(4.546, 4546.0, 1.0, 4.0, 8.0, 16.0, 160.0, 256.0, 768.0));
        ArrayList<Double> quart = new ArrayList<Double>(Arrays.asList(1.137, 1137.0, 0.25, 1.0, 2.0, 4.0, 40.0, 64.0, 192.0));
        ArrayList<Double> pint = new ArrayList<Double>(Arrays.asList(0.56818181818, 568.0, 0.125, 0.5, 1.0, 2.0, 20.0, 32.0, 96.0));
        ArrayList<Double> cup = new ArrayList<Double>(Arrays.asList(0.28409090909, 284.0, 0.0625, 0.25, 0.5, 1.0, 10.0, 16.0, 48.0));
        ArrayList<Double> floz = new ArrayList<Double>(Arrays.asList(0.02841312686, 28.413, 0.00625, 0.025, 0.05, 0.1, 1.0, 1.6, 4.8));
        ArrayList<Double> tbsp = new ArrayList<Double>(Arrays.asList(0.01775820429, 17.758, 0.00390625, 0.015625, 0.03125, 0.0625, 0.625, 1.0, 3.0));
        ArrayList<Double> tsp = new ArrayList<Double>(Arrays.asList(0.00591715976, 5.919, 0.00130208333, 0.00520833333, 0.01041666666, 0.02083333333, 0.20833333333, 0.3333333333333, 1.0));

        volumeList.add(l);
        volumeList.add(ml);
        volumeList.add(gallon);
        volumeList.add(quart);
        volumeList.add(pint);
        volumeList.add(cup);
        volumeList.add(floz);
        volumeList.add(tbsp);
        volumeList.add(tsp);

        ArrayList<Double> second = new ArrayList<Double>(Arrays.asList(1.0, 0.01666666666, 0.00027777777, 0.00001157407, 0.00000165343, 0.000000380517504, 0.0000000317057705));
        ArrayList<Double> minute = new ArrayList<Double>(Arrays.asList(60.0, 1.0, 0.01666666666, 0.00069444444, 0.00009920634, 0.00002283105, 0.00000190258));
        ArrayList<Double> hour = new ArrayList<Double>(Arrays.asList(3600.0, 60.0, 1.0, 0.04166666666, 0.00595238095, 0.00136986301, 0.00011415525));
        ArrayList<Double> day = new ArrayList<Double>(Arrays.asList(86400.0, 1440.0, 24.0, 1.0, 0.14285714285, 0.03287635204, 0.00273972602));
        ArrayList<Double> week = new ArrayList<Double>(Arrays.asList(604800.0, 10080.0, 168.0, 7.0, 1.0, 0.23014959723, 0.01917802964));
        ArrayList<Double> month = new ArrayList<Double>(Arrays.asList(2628000.0, 43800.0, 730.0, 30.417, 4.345, 1.0, 0.08333333333));
        ArrayList<Double> year = new ArrayList<Double>(Arrays.asList(31540000.0, 525600.0, 8760.0, 365.0, 52.143, 12.0, 1.0));

        timeList.add(second);
        timeList.add(minute);
        timeList.add(hour);
        timeList.add(day);
        timeList.add(week);
        timeList.add(month);
        timeList.add(year);
    }

    public double convertLength(String option1, String option2, double number) {
        int length1 = lengthMap.get(option1);
        int length2 = lengthMap.get(option2);

        double result = number * lengthList.get(length1).get(length2);
        return result;
    }

    public double convertMass(String option1, String option2, double number) {
        int mass1 = massMap.get(option1);
        int mass2 = massMap.get(option2);

        double result = number * massList.get(mass1).get(mass2);
        return result;
    }

    public double convertVolume(String option1, String option2, double number) {
        int volume1 = volumeMap.get(option1);
        int volume2 = volumeMap.get(option2);

        double result = number * volumeList.get(volume1).get(volume2);
        return result;
    }

    public double convertTime(String option1, String option2, double number) {
        int time1 = timeMap.get(option1);
        int time2 = timeMap.get(option2);

        double result = number * timeList.get(time1).get(time2);
        return result;
    }

    public double convertTemp(String option1, String option2, double number) {
        if (option1 == "Celsius") {
            if (option2 == "Celsius") {
                return number;
            }
            else {
                double result = number * 9/5 + 32;
                return result;
            }
        }

        else {
            if (option2 == "Fahrenheit") {
                return number;
            }
            else {
                double result = (number - 32) * 5/9;
                return result;
            }
        }
    }

}
