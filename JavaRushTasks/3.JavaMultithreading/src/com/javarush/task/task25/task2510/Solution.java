package com.javarush.task.task25.task2510;

/* 
Поживем - увидим
*/
public class Solution extends Thread {

    public Solution() {
        this.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                if (e.getClass().getName().contains("Error")) System.out.println("Нельзя дальше работать");
                if (e.getClass().getName().contains("Exception")) System.out.println("Надо обработать");
                if (e.getClass().getName().contains("Throwable")) System.out.println("Поживем - увидим");
            }
        });
    }

    public static void main(String[] args) {
    }
}
