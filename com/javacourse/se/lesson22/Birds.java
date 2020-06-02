package com.javacourse.se.lesson22;

//Java SE. Урок 22. Полиморфизм. Перегрузка и переопределение методов
public class Birds {
    private String name;

    public void walk() {
        System.out.println("Ho-ho-ho");
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}
