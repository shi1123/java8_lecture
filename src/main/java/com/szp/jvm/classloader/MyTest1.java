package com.szp.jvm.classloader;

public class MyTest1 {
    public static void main(String[] args) {
        System.out.println(MyChild1.b);

    }

}

class MyParent1 {
    public static int a = 10;

    static{
        System.out.println("MyParent1 initial");
    }

}

class MyChild1 extends MyParent1{
    public static int b = 20;

    static{
        System.out.println("MyChild1 initial");
    }
}
