package com.javacourse.se.lesson32;

import java.io.IOException;

//Java SE. Урок 32. Сериализация | Десериализация Объектов
public class Main {
    public static void main(String[] args) {

        /*Cat cat = new Cat();
        cat.setName("Tom");*/

    Serializator serializator = new Serializator();

       // System.out.println(serializator.serialization(cat));

        try {
            Cat cat =serializator.deserialization();
            System.out.println(cat.getName());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
