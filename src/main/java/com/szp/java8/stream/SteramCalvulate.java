package com.szp.java8.stream;

import java.util.stream.Stream;

public class SteramCalvulate {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, item  -> item + 2).limit(6);

        System.out.println(stream.filter(item -> item >2 ).mapToInt( item -> item *2).skip(2).limit(2).sum());
    }
}
