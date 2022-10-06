package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        while (reader.ready()){
            String s = reader.readLine();
            String name = s.replaceAll("\\d", "").trim();
            String birthDate = s.replace(name, "").trim();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
            PEOPLE.add(new Person(name, simpleDateFormat.parse(birthDate)));
        }
        reader.close();
    }
}
