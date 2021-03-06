package com.aweperi.multithreading.multithreadStates;

//Thread Class
class thread implements Runnable {
    public void run() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("State of thread1 while it called join() method on thread2 -" + MultithreadStates.thread1.getState());

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Main Class
public class MultithreadStates implements Runnable {
    public static Thread thread1;
    public static MultithreadStates obj;

    public static void main(String[] args) {
        obj = new  MultithreadStates();
        thread1 = new Thread(obj);

        // thread1 created and is currently in the NEW state.
        System.out.println("State of thread1 after creating it - " + thread1.getState());
        thread1.start();

        // thread1 moved to Runnable state
        System.out.println("State of thread1 after calling .start() method on it - " +
                thread1.getState());
    }
    public void run() {
        thread myThread = new thread();
        Thread thread2 = new Thread(myThread);
        System.out.println("State of thread2 after creating it - " + thread2.getState());

        thread2.start();
        System.out.println("State of thread2 after calling .start() method on it - " + thread2.getState());

        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("State of thread2 after calling .sleep() method on it - " + thread2.getState());

        try
        {
            // waiting for thread2 to die
            thread2.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("State of thread2 when it has finished it's execution - " + thread2.getState());
    }
}
