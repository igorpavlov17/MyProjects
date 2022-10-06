package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);
        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> liststr = new ArrayList<>();
        ArrayList<Integer> listint = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])){
                listint.add(Integer.parseInt(array[i]));
            }
            else{
                liststr.add(array[i]);
            }
        }
        Collections.sort(listint, Collections.reverseOrder());
        Collections.sort(liststr);
        list.addAll(liststr);
        for(int i : listint){
            list.add(Integer.toString(i));
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        //for (int i = listint.size(); i < array.length; i++) {
       //     array[i] = liststr.get(i);
     //   }
        boolean b = isGreaterThan("ааа", "бббб");
        /*for (int i = array.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (isNumber(array[i]) && isNumber(array[j])){
                    if (Integer.parseInt(array[j]) > Integer.parseInt(array[i])){
                        int a = Integer.parseInt(array[i]);
                        array[i] = array[j];
                        array[j] = Integer.toString(a);
                    }
                }
                if (!isNumber(array[i]) && !isNumber(array[j])) {
                    if (isGreaterThan(array[i], array[j])){
                        String s = array[i];
                        array[i] = array[j];
                        array[j] = s;
                    }
                }
            }
        }*/
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
