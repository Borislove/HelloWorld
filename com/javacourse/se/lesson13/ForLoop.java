package com.javacourse.se.lesson13;

public class ForLoop {

   /* public void foo() {
        for (; ; ) {
            System.out.println("Hello");
        }*/

    int[] array = {1, 2, 3};

    public void foo3() {
        for (int element : array) {
            System.out.println("element "+element);
        }
    }

    public void foo() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public void foo1() {
        for (int i = 0; i < 10; i = i + 1) {
            System.out.println(i);
        }
    }

    public void foo2() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ForLoop f = new ForLoop();
        f.foo();

        f.foo1();
        f.foo2();

        f.foo3();
    }
}
