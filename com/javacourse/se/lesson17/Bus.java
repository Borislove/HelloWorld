package com.javacourse.se.lesson17;

//Java SE. Урок 17. Поля и методы
public class Bus {
    public String model, color;
    public Engine engine;
    public Transmission transmission;
    public final String SERIAL_NUMBER = "D3HA6";
    public final int SERIAL_NUMBER_2 = 124674;

    public void go(){
        System.out.println("Go");
    }

    public int showKm(){
        int km = 65;
        return km;
    }

    public void showkM(int km){
        System.out.println(km);
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.go();

        int km2 = bus.showKm();
        System.out.println(km2);


        bus.showkM(20);
    }
}
