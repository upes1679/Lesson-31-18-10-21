package com.threadgroups;

public class Main {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("First Thread Group");
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(threadGroup, myRunnable, "Thread 1");
        Thread thread2 = new Thread(threadGroup, myRunnable, "Thread 2");
        Thread thread3 = new Thread(threadGroup, myRunnable, "Thread 3");
        Thread thread4 = new Thread(threadGroup, myRunnable, "Thread 4");
        Thread thread5 = new Thread(threadGroup, myRunnable, "Thread 5");

        ThreadGroup threadGroup1=new ThreadGroup(threadGroup,"Second Thread Group");

        thread.run();
        //Thread.currentThread().getThreadGroup().interrupt();
        thread2.run();
        thread3.run();

        System.out.println(threadGroup.getName());
        threadGroup.list();
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Running " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
