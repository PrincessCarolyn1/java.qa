package com.lesson.les10;

import java.util.ArrayList;
import java.util.List;

public class ListExc {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("peter");
        nameList.add("helen");
        nameList.add("yakov");
        nameList.add("natali");
        nameList.add("ivan");
        nameList.add("sudor");
        nameList.add(3,"ашот");
        System.out.println(nameList);
        for (int i=0;i<nameList.size();i++){
            String name = nameList.get(i);
            String modifiedName = name.toUpperCase();
            nameList.set(i, modifiedName);
           //String name = nameList.get(i)
             //char firstletter =name[i].chartAt(0);
          // String restletters=value.subsring(1);
           //String



           // nameList.set(i, modifiedName);





          //  private static String firstToCase(String value){
            //   String result = value.toUpperCase();

           //     return;
            }
        System.out.println(nameList);

        }
    private static String firstToUpperCase(String value) {
        char firstLetter = value.charAt(0);
        firstLetter = Character.toUpperCase(firstLetter);
        String restLetters = value.substring(1);
        String result = firstLetter + restLetters;
        return result;
    }}

