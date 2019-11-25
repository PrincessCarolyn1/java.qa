package com.lesson.les7.anonymuos;

public class HelloWorldImpl implements HelloWord {
    @Override
    public void say(String msg) {
        System.out.println("Hello world " + msg);
    }
}
