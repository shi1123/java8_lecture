package com.szp.jvm.bytecode;

public class Test1 {
    private int a = 1;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        System.out.println(new Test1().getA());

    }
}
