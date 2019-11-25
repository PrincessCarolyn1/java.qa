package com.lesson.les6;

import com.lesson.les6.skil.Musician;
import com.lesson.les6.skil.QA;

public class Talented implements QA, Musician, Wrestler {
    @Override
    public void play() {
        System.out.println("Я крутой музыкант");

    }

    @Override
    public void doTest() {
        System.out.println("Я классный тестер");
    }

    @Override
    public void fight() {
        System.out.println("Борец не очень");
    }
}
