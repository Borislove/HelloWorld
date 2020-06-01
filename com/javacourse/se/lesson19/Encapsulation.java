package com.javacourse.se.lesson19;

//Java SE. Урок 19. Инкапсуляция. Методы get и set.
public class Encapsulation {
    private int a , b ;

    public double getPi() {
        return pi;
    }

    private double pi = Math.PI;

    public int showResult() {
        return a + b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;   // this - переменная объекта, и переменнная метода
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setA(11);
        System.out.println(encapsulation.getA());

        System.out.println(encapsulation.showResult());

        System.out.println(encapsulation.pi);
        
        encapsulation.pi = 3.14;
        
        System.out.println(encapsulation.getPi());



    }
}
