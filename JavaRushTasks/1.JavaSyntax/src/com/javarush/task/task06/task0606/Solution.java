package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        while ((x / 10) != 0) {
            if (((x % 10) % 2) == 0)
                even++;
            else
                odd++;
            x /= 10;
        }
        if (((x % 10) % 2) == 0)
            even++;
        else
            odd++;
        System.out.print("Even: " + even + " Odd: " + odd);
    }
}