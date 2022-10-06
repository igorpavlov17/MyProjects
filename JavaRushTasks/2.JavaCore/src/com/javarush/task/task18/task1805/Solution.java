package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        ArrayList<Integer> list = new ArrayList<>();
        while (fileInputStream.available() > 0){
            list.add(fileInputStream.read());
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            int data = list.get(i);
            if (i < list.size()-1) {
                if (data != list.get(i + 1))
                    System.out.print(list.get(i) + " ");
            }
            else{
                for (int j = list.size(); j > 0; j--) {
                    if (data != list.get(j- 1)){
                        System.out.print(list.get(j));
                        break;
                    }
                }
            }
        }
        fileInputStream.close();
    }
}
