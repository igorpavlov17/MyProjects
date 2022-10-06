package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new BufferedReader(new InputStreamReader(System.in)).readLine()));
        String num = reader.readLine();
        String[] nums = num.split(" ");
        BufferedWriter writer = new BufferedWriter(new FileWriter(new BufferedReader(new InputStreamReader(System.in)).readLine()));
        for (int i = 0; i < nums.length; i++) {
            writer.write(Math.round(Double.parseDouble(nums[i])) + " ");
        }
        reader.close();
        writer.close();
    }
}