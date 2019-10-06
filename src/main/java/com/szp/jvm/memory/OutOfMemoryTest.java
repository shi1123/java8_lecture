package com.szp.jvm.memory;

import com.szp.jvm.bytecode.Mytest2;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryTest {
    public static void main(String[] args) {
        List<Mytest2> list = new ArrayList<>();

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for( ; ;){
            System.out.println("a");
            list.add(new Mytest2());
        }
    }
}
