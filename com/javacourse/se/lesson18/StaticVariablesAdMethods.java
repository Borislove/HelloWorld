package com.javacourse.se.lesson18;

//Java SE. Урок 18. Модификатор static
public class StaticVariablesAdMethods {
    public static int variable;  //общая для всех объектов
    public int variable2;

    static {
        variable = foo();
    }

    public static int foo() {
        System.out.println(variable);
        return 1;
    }

    public void show() {
        System.out.println("No");
        foo();
    }

    public static void main(String[] args) {
        StaticVariablesAdMethods s = new StaticVariablesAdMethods();
        StaticVariablesAdMethods s1 = new StaticVariablesAdMethods();
        StaticVariablesAdMethods s2 = new StaticVariablesAdMethods();

        s.variable = 5;
        s1.variable = 6;
        System.out.println(s.variable);
        System.out.println(s1.variable);
        System.out.println(s2.variable);

        StaticVariablesAdMethods.variable = 10;

    }
}
