package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        while (reader.ready()){
            String line = reader.readLine();
            for (int i = line.length()-1; i >= 0; i--) {
                System.out.print(line.charAt(i));
            }
            System.out.println();
        }
        bufferedReader.close();
        reader.close();
    }
}
