package com.lesson.les11;

import java.io.*;

public class FileSystemDemo {
    public static void main(String[] args)  throws IOException {
        String inPath ="c:\\Users\\Киса\\Downloads\\женские имена.txt";
        String outPath="c:\\Users\\Киса\\Downloads\\женские имена new 2.txt";
        BufferedReader br = new BufferedReader(new FileReader(inPath));
        PrintWriter pw =new PrintWriter( new FileWriter(outPath));
        br.lines()//возращаем Stream
                .limit(10)
                .peek(pw::println)
                .forEach(System.out::println);
        br.close();
        pw.close();

    }
}
