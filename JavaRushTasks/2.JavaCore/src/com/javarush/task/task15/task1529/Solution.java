package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        try {
            String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
            if (s.equals("helicopter"))
                result = new Helicopter();
            else if (s.equals("plane")){
                int count = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
                result = new Plane(count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
