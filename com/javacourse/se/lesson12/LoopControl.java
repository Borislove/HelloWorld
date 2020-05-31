package com.javacourse.se.lesson12;

public class LoopControl {

    boolean value = true;

    int a = 5, b = 7;

    public void foo() {
        do {
            a++;
            System.out.println(a);
        }while (a<b);
    }

    public static void main(String[] args) {
        LoopControl lp = new LoopControl();
        lp.foo();
    }
}
