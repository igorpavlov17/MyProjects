package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread{
    public Thread thread;
    public LoggingStateThread(Thread thread){
        this.thread = thread;
    }

    @Override
    public void run() {
        String state = new String();
        while (true) {
            if (!(state.equals(thread.getState().name()))) {
                state = thread.getState().name();
                System.out.println(state);
                if (state.equals("TERMINATED")) {
                    break;
                }
            }
        }
    }
}
