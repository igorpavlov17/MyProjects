package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String name = s;
        s = reader.readLine();
        int y = Integer.parseInt(s);
        s = reader.readLine();
        int m = Integer.parseInt(s);
        s = reader.readLine();
        int d = Integer.parseInt(s);
        System.out.println("Меня зовут " + name + ".");
        System.out.print("Я родился " + d + "." + m + "." + y);
    }
}
