package com.szp.protobuf;


import io.netty.handler.codec.protobuf.ProtobufEncoder;

public class ProtobufTest {
    public static void main(String[] args) {
        DataInfo.Student student = DataInfo.Student.newBuilder().setName("James").setAddress("Beijing").setAge(20).build();

        byte[] studentByte = student.toByteArray();
    }
}
