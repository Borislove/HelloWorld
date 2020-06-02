package com.javacourse.se.lesson22;

public class Crow extends Birds {

    public void fly() {
        System.out.println("I Crow and I fly");
    }

    @Override
    public void walk() {
        System.out.println("Crow");
    }
}
