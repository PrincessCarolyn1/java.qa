package com.lesson.les7.anonymuos;

public class HelloWorldImpl2 implements HelloWord {
    @Override
    public void say(String msg) {
        System.out.println("Привет мир " + msg + "!!!");
    }
}
