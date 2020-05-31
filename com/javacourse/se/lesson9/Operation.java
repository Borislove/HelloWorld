package com.javacourse.se.lesson9;

public class Operation {

    Integer a = 5, b = 7, c;
    String str1 = "Hot", str2 = "Java", result;

    public void foo() {
        c = a + b;
        result = str1 + str2;
        System.out.println(c);
        System.out.println(result);
    }

    boolean v = a>b;

    public static void main(String[] args) {
        Operation op = new Operation();
        op.foo();
    }
}

