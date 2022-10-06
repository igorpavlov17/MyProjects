package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        allLines = Files.readAllLines(Paths.get(new BufferedReader(new InputStreamReader(System.in)).readLine()));
        forRemoveLines = Files.readAllLines(Paths.get(new BufferedReader(new InputStreamReader(System.in)).readLine()));
        Solution solution = new Solution();
        try {
            solution.joinData();
        }
        catch (CorruptedDataException e){

        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
