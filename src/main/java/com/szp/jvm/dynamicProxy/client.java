package com.szp.jvm.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class client {
    public static void main(String[] args) {
        System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        MyInterface myinterface = new MyInterfaceImpl();

        InvocationHandler ds = new MyInterfaceProxy(myinterface);

        MyInterface mi = (MyInterface) Proxy.newProxyInstance(myinterface.getClass().getClassLoader(),
                myinterface.getClass().getInterfaces(), ds);

        mi.doSomeThing();
    }
}
