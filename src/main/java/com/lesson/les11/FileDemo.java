package com.lesson.les11;


import java.io.*;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        String inPath ="c:\\Users\\Киса\\Downloads\\женские имена.txt";
        String outPath="c:\\Users\\Киса\\Downloads\\женские имена new.txt";
        BufferedReader br = new BufferedReader(new FileReader(inPath));
        PrintWriter pw =new PrintWriter( new FileWriter(outPath));
        String name = br.readLine();
        System.out.println(name);
        String name2 = br.readLine();
        System.out.println(name);


        String nextName;
        while((nextName= br. readLine())!=null){
            System.out.println(nextName);}
            br.close();
            pw.close();





    }
}
