package com.lesson.les8.ht;

import com.lesson.les7.hometask.StringFunction;

public class LambdaDemo {
    public static void main(String[] args) {
    StringFunction converter = String::toUpperCase;
    StringFunction replacer = s -> s.replaceAll(" ", "");
    String str = "hello";
    System.out.println(converter.convert(str));
    System.out.println(replacer.convert("Hello world!! ))"));
}
}
