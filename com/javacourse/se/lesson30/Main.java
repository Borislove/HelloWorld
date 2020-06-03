package com.javacourse.se.lesson30;

//Java SE. Урок 30. Создание собственных исключений. Оператор throw
public class Main {

    public static void main(String[] args) throws PerimeterException {

        PerimeterSquare perimeterSquare = new PerimeterSquare();
        perimeterSquare.getPerimeter("22");
    }
}
