package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String agestring = reader.readLine();
        int age = Integer.parseInt(agestring);
        if (age < 18)
            System.out.print("Подрасти еще");
    }
}
