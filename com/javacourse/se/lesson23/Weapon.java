package com.javacourse.se.lesson23;

//Java SE. Урок 23. Абстрактные классы и методы
public abstract class Weapon {

    private String name;

    public abstract void foo();

    public void shwo() {
        System.out.println();
    }

    public static void main(String[] args) {
        Weapon weapon = new AK47();
        AK47 ak47 = new AK47();

    }
}
