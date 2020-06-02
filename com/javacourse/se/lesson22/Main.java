package com.javacourse.se.lesson22;

public class Main {

    public static void main(String[] args) {

        //ostrich.walk("Hello");

        Birds ostrich = new Ostrich();
        Birds crow = new Crow();

        Test test = new Test();
        test.foo(crow);
    }
}
