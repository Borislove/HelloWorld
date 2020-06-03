package com.javacourse.se.lesson29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ABC {

    public void show() {

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
