package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        int a = 0;
        int b = 0;
        int max = 1;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < 10; i++){
            list.add(reader.readLine());
        }
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).length() < min) {
                min = list.get(i).length();
            }
        }
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).length() == min) {
                a = i;
                break;
            }
        }
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).length() > max) {
                max = list.get(i).length();
            }
        }
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).length() == max) {
                b = i;
                break;
            }
        }
        if (a < b){
            for (int i = 0; i < list.size(); i++){
                if (list.get(i).length() == min) {
                    System.out.println(list.get(i));
                    break;
                }
            }
        }
        else{
            for (int i = 0; i < list.size(); i++){
                if (list.get(i).length() == max) {
                    System.out.println(list.get(i));
                    break;
                }
            }
        }

    }
}
