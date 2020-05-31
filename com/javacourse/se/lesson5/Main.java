package com.javacourse.se.lesson5;

import com.javacourse.se.lesons7.Bus;

public class Main {

    /////////////////////////////////////////////////////
    //1 способ
    /*public static void main(String[] args) {
    }*/

   /* //2 способ
    public static void main(String... args) {
        System.out.println("Hot Java");
    }*/

    //3 способ
    /*public static void main(String args[]) {
    }*/

    ////////////////////////////////////////////////////

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
