package com.DA.SynchronizedSample;

/**
 * <类详细说明:多线程测试程序>
 *
 * @Author： HuangHai
 * @Version: 2017-03-30
 **/
public class RunnableDemo implements Runnable{
    private Thread t;
    private String threadName;
    private SynchronizedCounter synchronizedCounter = new SynchronizedCounter();

    RunnableDemo(String name)   {
        threadName = name;
        System.out.printf("creating " + threadName);
    }

    public void run()   {
        System.out.println("Running " +  threadName );
        if(threadName == "thread1")  {
            for(int i=0; i<5; i++)  {
                synchronizedCounter.increment();
            }
        }
        if(threadName == "thread2")  {
            synchronizedCounter.decrement();
        }

        System.out.println("Thread " +  threadName + " exiting.");
    }
}
