package com.szp.jvm.dynamicProxy;

public class MyInterfaceImpl implements MyInterface {
    @Override
    public void doSomeThing() {
        System.out.println("my interface implements");
    }
}
