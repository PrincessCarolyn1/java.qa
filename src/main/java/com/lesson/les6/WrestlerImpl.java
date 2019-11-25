package com.lesson.les6;

public class WrestlerImpl extends Person implements Wrestler {

    public void fight() {
        System.out.println("Борюсь");
    }

    @Override
    public void about() {
        System.out.println("Я чемпион");
    }}
