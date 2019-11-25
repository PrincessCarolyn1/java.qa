package com.lesson.les9.collection;

import com.lesson.les6.Gender;
import com.lesson.les6.Person;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {public static void main(String[] args) {
    Person p1 = new Person(1L, "Helen", Gender.FEMALE);
    Person p2 = new Person(21L, "Peter", Gender.MALE);
    Person p3 = new Person(11L, "Oksana", Gender.FEMALE);
    Person p4 = new Person(15L, "Ашот", Gender.MALE);

    Map<Long, Person> persons = new HashMap<>();
    persons.put(p1.getId(), p1);
    persons.put(p2.getId(), p2);
    persons.put(p3.getId(), p3);
    persons.put(p4.getId(), p4);

    System.out.println(persons);

    persons.remove(15L);
    System.out.println(persons);

    Set<Long> keys = persons.keySet();
    Collection<Person> personsAsList = persons.values();
    System.out.println(keys);
    System.out.println(personsAsList);

    for(Map.Entry<Long, Person> item: persons.entrySet()) {
        System.out.println("Next person");
        System.out.println("key->" + item.getKey());
        System.out.println("value->" + item.getValue());
    }
}
}
