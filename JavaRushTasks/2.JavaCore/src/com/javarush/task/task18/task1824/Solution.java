package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        while (true) {
            String fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();
            try (FileInputStream inputStream = new FileInputStream(fileName)) {
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                break;
            }
        }
    }
}
