package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException {
        for (String fileName = new BufferedReader(new InputStreamReader(System.in)).readLine(); !fileName.equals("exit"); fileName = new BufferedReader(new InputStreamReader(System.in)).readLine()){
            ReadThread readThread = new ReadThread(fileName);
            readThread.start();
            readThread.join();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
        private ArrayList<Integer> list = new ArrayList<>();

        public ReadThread(String fileName) throws IOException {
            this.fileName = fileName;
            FileInputStream fileInputStream = new FileInputStream(fileName);
            while (fileInputStream.available() > 0){
                list.add(fileInputStream.read());
            }
            fileInputStream.close();
        }

        @Override
        public void run(){
            int element = list.get(0);
            for (Integer i : list) {
                if (Collections.frequency(list, i) > Collections.frequency(list, element)) element = i;
            }
            resultMap.put(fileName, element);
        }
    }
}
