package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(bufferedReader.readLine());
        BufferedReader buffer = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(bufferedReader.readLine()));
        while (buffer.ready()){
            String[] numLineArr = buffer.readLine().split(" ");
            for (String tmp: numLineArr){
                try{
                    long i = Long.parseLong(tmp);
                    bufferedWriter.write(tmp+" ");
                }
                catch (Exception e){

                }
            }
        }
        bufferedReader.close();
        fileReader.close();
        buffer.close();
        bufferedWriter.close();
    }
}
