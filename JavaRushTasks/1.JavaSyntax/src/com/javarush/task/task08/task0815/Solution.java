package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("й","ф");
        map.put("ц","ы");
        map.put("у","в");
        map.put("к","а");
        map.put("е","п");
        map.put("н","р");
        map.put("г","о");
        map.put("ш","л");
        map.put("щ","д");
        map.put("з","ж");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int a = 0;
        for (Map.Entry<String, String> map1 : map.entrySet()){
            if(map1.getValue().equals(name))
                a++;
        }
        return a;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int a = 0;
        for (Map.Entry<String, String> map1 : map.entrySet()){
            if(map1.getKey().equals(lastName))
                a++;
        }
        return a;
    }

    public static void main(String[] args) {

    }
}
