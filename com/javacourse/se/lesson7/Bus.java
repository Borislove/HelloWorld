package com.javacourse.se.lesson7;

//Java SE. Урок 7. Введение в классы и объекты
public class Bus {
    public String model;
    public String color;

    public void showColor(){
        System.out.println(color);
    }

    public static void main(String[] args) {

        Bus bus ;
        bus = new Bus();

        Bus ourBus = new Bus();
        Bus firstBus = new Bus();
        Bus secondBus =new Bus();

        ourBus.color = "Green";
        firstBus.color = "Red";
        secondBus.color = "Gray";

        ourBus.showColor();
        firstBus.showColor();
        secondBus.showColor();
    }
}
