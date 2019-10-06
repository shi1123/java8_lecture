package com.szp.jvm.thread;

public class DeadLock {
    public static void main(String[] args) throws Exception{
        new Thread(()->A.method(), "Thread A").start();

        new Thread(()->B.method(), "Thread B").start();
    }

}

class A{
    public synchronized static void method(){
        System.out.println("method a");

        try {
            Thread.sleep(5000);
            B.method();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class B{
    public synchronized static void method(){
        System.out.println("method b");

        try {
            Thread.sleep(5000);
            A.method();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
