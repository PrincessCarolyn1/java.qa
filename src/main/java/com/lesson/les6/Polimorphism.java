package com.lesson.les6;

import com.lesson.les6.skil.Musician;

public class Polimorphism {public static void main(String[] args) {
    Person person = new Person();
    person.setGender(Gender.MALE);
    person.doCommonJob("очистить лес");

    ItSpeciolist itSpecialist = new ItSpeciolist();
    itSpecialist.doTest();

    Person person1 = new ItSpeciolist();
    person1.doCommonJob("уборку леса");

    WrestlerImpl person2 = new WrestlerImpl();
    person2.doCommonJob("Рублю дрова");
    person2.fight();

    Person[] persons = new Person[5];
    persons[0] = new Person();
    persons[1] = new ItSpeciolist();
    persons[2] = new WrestlerImpl();
    persons[3] = new ItSpeciolist();
    persons[4] = new Musiciant();

    System.out.println("****");
    for (int i = 0; i < persons.length; i++) {
//            persons[i].doCommonJob("помой посуду");
        persons[i].about();
    }

    System.out.println("----");
    if (persons[2] instanceof ItSpeciolist)
        ((ItSpeciolist)persons[2]).doTest();
    else if (persons[2] instanceof WrestlerImpl)
        ((WrestlerImpl)persons[2]).fight();
    else
        persons[2].doCommonJob("Убирай");
}}
