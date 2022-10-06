package com.javarush.task.task31.task3101;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

/*
Проход по дереву файлов
*/

public class Solution {
    private ArrayList<File> fileList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        File path = new File(args[0]);
        File resultFileAbsolutePath = new File(args[1]);
        File allFilesContent = new File(resultFileAbsolutePath.getParent() + "/allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath, allFilesContent);
        FileOutputStream fileOutputStream = new FileOutputStream(allFilesContent);
        fillFileList(path.getPath());
        Solution solution = new Solution();
        solution.fileList.sort(new FileNameComparator());
        for (File file : solution.fileList) {
            FileInputStream fileInputStream = new FileInputStream(file);
            while (fileInputStream.available() > 0) {
                fileOutputStream.write(fileInputStream.read());
            }
            fileOutputStream.write(System.lineSeparator().getBytes());
            fileOutputStream.flush();
            fileInputStream.close();
        }
        fileOutputStream.close();
    }

    private static void fillFileList(String path) {
        File[] files = new File(path).listFiles();
        Solution solution = new Solution();
        for (File file : files) {
            if (file.isDirectory()) {
                fillFileList(file.getAbsolutePath());
                continue;
            }
            if (file.length() > 50)
                FileUtils.deleteFile(file);
            else
                solution.fileList.add(file);
        }
    }
}

class FileNameComparator implements Comparator<File> {
    public int compare(File first, File second) {
        return first.getName().compareTo(second.getName());
    }
}