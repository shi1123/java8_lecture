package com.szp.jvm.bytecode;

public class Mytest2 {

    String s = "hello";

    private int i = 15;

    public static Integer x = 10;

    public void setI(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        Mytest2 mytest2 = new Mytest2();

        mytest2.setI(5);

        x = 8;

        //s = s + " world";
    }

}
