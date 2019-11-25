package com.lesson.les7.anonymuos;

public class AppMain {public static void main(String[] args) {
    HelloWord hw = new HelloWorldImpl();
    hw.say("!!!");
    HelloWord hw2 = new HelloWorldImpl2();
    hw2.say(" всем добра");

    // Анонимный класс
    HelloWord hw3 = new HelloWord() {
        @Override
        public void say(String msg) {
            System.out.println("Hello from anonymous class");
        }
    };

    hw3.say("");

    // Лямбда выражения
    System.out.println("---");
    HelloWord hw4 = msg -> System.out.println(msg);
    hw4.say("Скажи что-нибудь");

    // Лямбда выражения - ссылка на метод
    System.out.println("---");
    HelloWord hw5 = System.out::println;
    hw4.say("Скажи еще что-нибудь");

    int n = 3;
    String str = n == 2 ? "Два" : "Не два";
    System.out.println(str);
}
}
