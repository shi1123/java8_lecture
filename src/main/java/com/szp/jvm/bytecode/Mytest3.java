package com.szp.jvm.bytecode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;

public class Mytest3 {
    public static void test(){
        try{
            InputStream is = new FileInputStream("test.txt");

            ServerSocket ss = new ServerSocket(8888);
            ss.accept();
        }catch (FileNotFoundException ex){

        }catch(IOException ex){

        }finally {
            System.out.println("finish");
        }
    }
}
