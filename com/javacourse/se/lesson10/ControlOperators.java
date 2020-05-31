package com.javacourse.se.lesson10;

//Java SE. Урок 10. Условный оператор if или оператор ветвления
public class ControlOperators {

    int a = 5, b = 7;
    boolean value = false;

    public void foo() {

        if (value) {
            System.out.println("True");

            if(a<b){
                System.out.println("Yes");
            }

        } else if(b<a) {
            System.out.println("False");
        } else {
            System.out.println("hmm");
        }
    }

    public static void main(String[] args) {

        ControlOperators co = new ControlOperators();
        co.foo();
    }
}
