package com.javacourse.se.lesson31;

import java.io.*;

public class Main2 {

    public static void main(String[] args) {

       // FileOutputStream fileOutputStream = null;

        FileWriter fr = null;
        String str = "Hot";

        File file = new File("E;/2.txt");


        try {
             fr = new FileWriter("E:/1.txt",true);
             fr.write(str);
            //fileOutputStream = new FileOutputStream("E:/1.txt");
         //   fileOutputStream.write(str.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
