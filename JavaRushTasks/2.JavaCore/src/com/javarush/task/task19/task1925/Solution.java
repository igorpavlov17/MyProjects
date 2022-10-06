package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder stringBuilder = new StringBuilder();
        while (reader.ready()){
            String[] words = reader.readLine().split(" ");
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > 6) stringBuilder.append(words[i] + ",");
            }
        }
        writer.write(stringBuilder.deleteCharAt(stringBuilder.length()-1).toString());
        reader.close();
        writer.close();
    }
}
