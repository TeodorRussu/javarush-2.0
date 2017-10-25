package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    Thread thread;

    public LoggingStateThread(Thread throwable) {
        this.thread = throwable;
    }

    @Override
    public void run() {
        Thread.State threadState;
        System.out.println(threadState = thread.getState());
        while (!thread.isInterrupted()) {
            if (!(threadState == thread.getState())) {
                threadState = thread.getState();
                System.out.println(threadState);
                if (threadState== State.TERMINATED)
                    break;
            }
        }

    }
}