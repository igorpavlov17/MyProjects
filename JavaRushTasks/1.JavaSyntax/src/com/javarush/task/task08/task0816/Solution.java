package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("а", dateFormat.parse("MAY 1 2012"));
        map.put("б", dateFormat.parse("JUN 1 2012"));
        map.put("в", dateFormat.parse("DEC 1 2012"));
        map.put("г", dateFormat.parse("JAN 1 2012"));
        map.put("д", dateFormat.parse("NOV 1 2012"));
        map.put("е", dateFormat.parse("AUG 1 2012"));
        map.put("ё", dateFormat.parse("JUL 1 2012"));
        map.put("ж", dateFormat.parse("FEB 1 2012"));
        map.put("з", dateFormat.parse("OCT 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        map.entrySet().removeIf(pair -> pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8);
    }

    public static void main(String[] args) {

    }
}
