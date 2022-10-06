package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String name = reader.readLine();
        String number1 = reader.readLine();
        String number2 = reader.readLine();
        //int a = Integer.parseInt(number1);
        //int b = Integer.parseInt(number2);
        System.out.print(name + " получает " + number1 + " через " + number2 + " лет.");
    }
}
