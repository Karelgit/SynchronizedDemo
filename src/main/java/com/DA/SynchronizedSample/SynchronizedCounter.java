package com.DA.SynchronizedSample;

/**
 * <类详细说明:多线程下的线程同步关键字synchronized>
 *
 * @Author： HuangHai
 * @Version: 2017-03-22
 **/
public class SynchronizedCounter {
    private static int c = 0;

    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }

    //测试
    public static void main(String[] args) throws Exception {
        RunnableDemo r1 = new RunnableDemo("thread1");
        Thread thread1 = new Thread(r1);
        thread1.start();
        RunnableDemo r2 = new RunnableDemo("thread2");
        Thread thread2 = new Thread(r2);
        thread2.start();
        thread2.join();
        System.out.println("c: "+SynchronizedCounter.c);
    }
}
