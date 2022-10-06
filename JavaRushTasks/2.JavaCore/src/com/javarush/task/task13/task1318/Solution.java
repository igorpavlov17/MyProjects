package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        InputStream input = new FileInputStream(filename);
        while (input.available() > 0) {
            System.out.print((char) input.read());
        }
        input.close();
        reader.close();
    }
}