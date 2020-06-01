package com.javacourse.se.lesson16;

public class Modifiers {   //private default protected public

    private String name;

    Modifiers() {
    }

    protected  class FirstClass1{

    }

    private void foo() {
        FirstClass firstClass = new FirstClass();
        firstClass.color = "";
    }

    public static void foo2() {

    }

    public void show(){
        foo();
    }

    //вложенный класс или внутренний
    private class FirstClass {
        public String color;
    }

    public static void main(String[] args) {
        Modifiers modifiers = new Modifiers();
        modifiers.foo();
        String name = modifiers.name;

        Modifiers.foo2();
    }
}
