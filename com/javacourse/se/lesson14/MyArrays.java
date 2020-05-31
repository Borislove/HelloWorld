package com.javacourse.se.lesson14;

public class MyArrays {

    int[] array = new int[3];
    Candy[] box = new Candy[5];

    int[] array2 = {10, 3, 7};
    Candy candyFirst = new Candy();
    Candy candySecond = new Candy();
    Candy candyThird = new Candy();

    Candy[] box2 = {candyFirst, candySecond, candyThird};

    Candy[] box3;

    public void foo() {
        Candy candy = new Candy();
        box[0] = candy;
        System.out.println(box[0]);
    }

    public void foo1() {
        System.out.println(box2[2]);
    }

    public void foo3() {
        System.out.println(array2[0]);
    }

    public void foo4() {
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }

    public void foo5() {
        int[][] array = new int[2][2];
        int[][] array2 = {{2, 3}, {3, 4}};

        int[][][] array3 =
                {
                        {{55}},
                        {{155, 255}},
                        {{455, 555, 355}}
                };

        System.out.println(array2[1][0]);

        System.out.println(array3[2][0][2]);
    }


    public static void main(String[] args) {
        MyArrays myArrays = new MyArrays();
        myArrays.foo();

        myArrays.foo1();

        myArrays.foo3();

        myArrays.foo4();

        myArrays.foo5();
    }
}
