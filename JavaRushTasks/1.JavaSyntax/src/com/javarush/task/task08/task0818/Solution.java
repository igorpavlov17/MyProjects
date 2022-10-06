package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("й",1);
        map.put("ц",2);
        map.put("у",3000);
        map.put("к",4);
        map.put("е",5000);
        map.put("н",6);
        map.put("г",7000);
        map.put("ш",8);
        map.put("щ",9);
        map.put("з",10);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        map.entrySet().removeIf(map1 -> map1.getValue() < 500);
    }

    public static void main(String[] args) {

    }
}