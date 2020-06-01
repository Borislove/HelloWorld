package com.javacourse.se.lesson21;

//Страус (Ostrich)
public class Ostrich extends Birds {
    public Ostrich(String name, Wings wings) {
        super(name, wings);
    }

    public void hideHead(){  //прятать голову
        System.out.println("I Ostrich and I scared");

    }
}
