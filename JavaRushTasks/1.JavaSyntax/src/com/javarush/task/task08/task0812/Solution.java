package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int row = 1;
        int a = 1;
        for(int i = 0; i < 10; i++)
            list.add(Integer.parseInt(reader.readLine()));
        for(int i = 0; i < list.size()-1; i++){
            if ((int)list.get(i) == (int)list.get(i+1)) {
                a++;
                if (a > row)
                    row = a;
            }
            else
                a = 1;
        }
        System.out.print(row);
    }
}