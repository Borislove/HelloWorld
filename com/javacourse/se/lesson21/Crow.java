package com.javacourse.se.lesson21;

public class Crow extends Birds {
    public Crow(String name, Wings wings) {
        super(name, wings);
    }   //ворона (Crow)
    public void fly() {
        System.out.println("I Crow and I fly");
    }
}
