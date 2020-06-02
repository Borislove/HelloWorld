package com.javacourse.se.lesson27;
//Java SE. Урок 27. Классы StringBuilder / StringBuffer и их методы
public class Main {
    public static void main(String[] args) {

        String str = new String("Java");
        System.out.println(str.concat(" Hot"));
        System.out.println(str);

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.ensureCapacity(20);
        System.out.println(stringBuilder.capacity());

        stringBuilder.setLength(15);
        System.out.println(stringBuilder.capacity());

        StringBuilder stringBuilder2 = new StringBuilder("Java");
        stringBuilder2.insert(0,"G");      //вставляет букву
        System.out.println(stringBuilder2);

        stringBuilder2.deleteCharAt(1);   //удаляет букву в позиции индекса
        System.out.println(stringBuilder2);

        stringBuilder2.reverse();      //реверс строки
        System.out.println(stringBuilder2);
    }
}
