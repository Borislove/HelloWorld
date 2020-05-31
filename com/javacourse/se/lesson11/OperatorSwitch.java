package com.javacourse.se.lesson11;

//Java SE. Урок 11. Оператор switch ( оператор множественного выбора )
public class OperatorSwitch {

    final int VALUE = 2, VALUE_1 = 1, VALUE_2 = 2, VALUE_3 = 3;

    //Оператор множественного выбора.
    //byte, short,int,char,enum,String
    public void foo() {

        switch (52) {
            case 48:
                System.out.println(48);
                break;
            case 25:
                System.out.println(25);
                break;
            case 73:
                System.out.println(73);
                break;

            default:
                System.out.println("Not found");
        }


        switch (VALUE) {
            case VALUE_1:
                System.out.println(VALUE_1);
                break;
            case VALUE_2:
                System.out.println(VALUE_2);
                break;
            case VALUE_3:
                System.out.println(VALUE_3);
                break;

            default:
                System.out.println("Default");
        }
    }


    public static void main(String[] args) {
        OperatorSwitch op = new OperatorSwitch();
        op.foo();
    }
}
