package com.javacourse.se.lesson22;

//Страус (Ostrich)
public class Ostrich extends Birds {

    public void hideHead() {  //прятать голову
        System.out.println("I Ostrich and I scared");

    }

    //динамический
    @Override
    public void walk() {
        System.out.println("eee");
    }

    //статический
    /*public void walk(String str) {
        System.out.println("Ho-ho-ho" + str);
    }*/



}
