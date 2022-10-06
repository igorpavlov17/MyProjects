package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(bufferedReader.readLine());
        BufferedReader buffer = new BufferedReader(fileReader);
        int count = 0;
        while (buffer.ready()){
            String[] wordsInLine = buffer.readLine().split("[\\p{P}\\s]");
            for (int i=0; i < wordsInLine.length; i++){
                if (wordsInLine[i].equals("world"))
                    count++;
            }
        }
        System.out.println(count);
        buffer.close();
        bufferedReader.close();
        fileReader.close();
    }
}
