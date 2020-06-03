package com.javacourse.se.lesson31;

import java.io.*;

//Java SE. Урок 31. Потоки ввода вывода (I/O)
public class Main {

    public static void main(String[] args) {

        FileInputStream fis = null;
        InputStreamReader isr = null;

        int b = 0;

        try {

            fis = new FileInputStream("E:/1.txt");
            //    isr = new InputStreamReader(fis,"UTF-8");   //символьное чтение

            while ((b = fis.read()) != -1) {
                System.out.println((char) b);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {

                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
