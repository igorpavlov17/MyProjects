package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        List<String> cities = new ArrayList<>();
        while (true) {
            String a = reader.readLine();
            if (a.isEmpty()) {
                break;
            }
            cities.add(a);
            a = reader.readLine();
            if (a.isEmpty()) {
                break;
            }
            list.add(a);
        }

        // Read the house number
        //int houseNumber = Integer.parseInt(reader.readLine());
        String city = reader.readLine();

        for (String a: cities) {
            if (a.equals(city))
                System.out.println(list.get(cities.indexOf(a)));
        }

        /*if (0 <= houseNumber && houseNumber < list.size()) {
            String familyName = list.get(houseNumber);
            System.out.println(familyName);
        }*/
    }
}
