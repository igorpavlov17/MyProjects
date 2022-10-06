package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(bufferedReader.readLine());
        FileWriter writer = new FileWriter(bufferedReader.readLine());
        int i = 0;
        while(reader.ready()){
            i++;
            int data = reader.read();
            if (i % 2 == 0) writer.write(data);
        }
        bufferedReader.close();
        reader.close();
        writer.close();
    }
}
