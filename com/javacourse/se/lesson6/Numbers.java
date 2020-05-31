package com.javacourse.se.lesson6;

//Java SE. Урок 6. Примитивные типы данных и литералы. Объявление и инициализация переменных
public class Numbers {
    // x+3 = 5

    //целочисленные типы
    static byte a = 3;   // 2^8
    static short b = 777;  // 2^16
    static int c = 35_000;  // 2^32
    static long d = 1_000_000_000_000_000L;   // 2^64

    //символьный тип
    static char e = 'C';   //2^16

    //типы с плавающей точкой
    static float f = 8.1f;  // 2^32
    static float fi = 9234134192349123040234f;
    static double g = 6.3;  //2^64

    static boolean h = true;  // 8 bit (in arrays)  , 32 bit (not in arrays)

   /* public static void main(String[] args) {

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        System.out.println(e);

        System.out.println(f);
        System.out.println(g);

        System.out.println(h);

        System.out.println(fi);  //будет выводить в степени
    }*/
}
