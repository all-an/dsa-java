package org.example;

public class ThreadState implements Runnable {
    public static Thread t1;
    public static ThreadState o1;
    public static void main(String args[])
    {
        o1 = new ThreadState();
        t1 = new Thread(o1);
        System.out.println("post-spanning, state of t1 is"
                + " " + t1.getState());
        // lets invoke start() method on t1
        t1.start();
        // Now,Thread t1 is moved to runnable state
        System.out.println(
                "post invoking of start() method, state of t1 is"
                        + " " + t1.getState());
    }
    public void run()
    {
        MainTwo g1 = new MainTwo();
        Thread t2 = new Thread(g1);

        // Thread is created and its in new state.
        t2.start();
        t2.run();
        // Now t2 is moved to runnable state
        System.out.println(
                "state of t2 Thread, post-calling of start() method is"
                        + " " + t2.getState());
        // create a try-catch block to set t1 in waiting
        // state
        try {
            Thread.sleep(202);
        }
        catch (InterruptedException i2) {
            i2.printStackTrace();
        }
        System.out.println(
                "State of Thread t2 after invoking to method sleep() is"
                        + " " + t2.getState());
        try {
            t2.join();
            System.out.println(
                    "State of Thread t2 after join() is"
                            + " " + t2.getState());
        }
        catch (InterruptedException i3) {
            i3.printStackTrace();
        }
        System.out.println(
                "state of Thread t1 after completing the execution is"
                        + " " + t1.getState());
    }
}