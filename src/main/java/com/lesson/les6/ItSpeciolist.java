package com.lesson.les6;

public class ItSpeciolist extends Person {

    public void doTest() {
        System.out.println("Я разрабатываю автотесты");
    }

    @Override
    public void about() {
        System.out.println("Я тестировщик");
    }
}
