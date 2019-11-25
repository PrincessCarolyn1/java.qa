package com.lesson.les3.exc.String;

import java.util.Arrays;

public class StringExc2 {
    public static void main(String[] args) {
    String longStr = "Hello World, sdfalfldf, asd fasd ";
    String shortStr = longStr.substring(0, 5)+"..."; // "Hello...";
    System.out.println(shortStr);
}
}
