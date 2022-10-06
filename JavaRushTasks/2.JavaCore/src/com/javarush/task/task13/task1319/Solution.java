package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename)));
        while (true){
            String s = reader.readLine();
            for (int i = 0; i < s.length(); i++) {
                writer.write((char) s.charAt(i));
            }
            writer.write((char) '\n');
            if (s.equals("exit"))
                break;
        }
        reader.close();
        writer.close();
    }
}
