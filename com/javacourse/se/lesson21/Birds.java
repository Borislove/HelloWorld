package com.javacourse.se.lesson21;

//Java SE. Урок 21. Наследование. Использование this и super
public class Birds {
    private String name;
    private Wings wings;

    public Birds(String name, Wings wings) {
        this.name = name;
        this.wings = wings;
    }

    public void walk() {
        System.out.println("Ho-ho-ho");
    }

    public String getName() {
        return name;
    }

    public Wings getWings() {
        return wings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }
}
