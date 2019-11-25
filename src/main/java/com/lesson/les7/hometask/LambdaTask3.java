package com.lesson.les7.hometask;

import com.lesson.les4.hometask.Date;

public class LambdaTask3 {
    public static void main(String[] args) {
    StringFunction converterToUpperCase = s -> s.toUpperCase();
    String result = converterToUpperCase.convert("hello");
    System.out.println(result);

    DateTimeFunction dateTimeFunction = d -> {
        d.setDay(1);
        d.setMonth(1);
    };
    Date date = new Date(12, 2, 2019);
    dateTimeFunction.apply(date);
    System.out.println(date.getFormattedDate());
}
}
