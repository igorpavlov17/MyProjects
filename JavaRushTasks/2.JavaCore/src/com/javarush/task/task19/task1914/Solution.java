package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        testString.printSomething();
        System.setOut(consoleStream);
        String[] s = outputStream.toString().split(" ");
        int result = 0;
        for (int i = 0; i < s.length-1; i=i+2) {
            switch (s[i+1]){
                case ("+") : result = Integer.parseInt(s[i]) + Integer.parseInt(s[i+2]); break;
                case ("-") : result = Integer.parseInt(s[i]) - Integer.parseInt(s[i+2]); break;
                case ("*") : result = Integer.parseInt(s[i]) * Integer.parseInt(s[i+2]); break;
            }
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.print(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.print("3 + 6 = ");
        }
    }
}

