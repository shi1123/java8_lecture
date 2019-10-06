package com.szp.jvm.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInterfaceProxy implements InvocationHandler {

    private MyInterface myInterface;

    public MyInterfaceProxy(MyInterface myInterface){
        this.myInterface = myInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        method.invoke(myInterface, args);
        System.out.println("end");

        return null;
    }
}
