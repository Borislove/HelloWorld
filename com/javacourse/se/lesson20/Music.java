package com.javacourse.se.lesson20;

//Java SE. Урок 20. Перечисления enum
public enum Music {

    CLASSIC(5, "classic"), ROCK(8, "rock"), POP(12, "pop");

    Music(int i) {
        this.i = i;
    }

    private int i;

    public int getI() {
        return i;
    }

    public String getName() {
        return name;
    }

    private String name;

    Music(int i, String name) {
        this.i = i;
        this.name = name;
    }

    public void foo(){
        System.out.println("It's is true");
    }

}

class Main {
    public static void main(String[] args) {
        Music mc = Music.CLASSIC; // 1 способ

        Music mc2 = Music.valueOf(Music.class, "ROCK");  //2 способ

        System.out.println(mc);
        System.out.println(mc2);

        System.out.println(mc.getI());
        System.out.println(mc.getName());


        switch (mc) {
            case CLASSIC:
                System.out.println("Classic");
                break;
            case POP:
                System.out.println("Pop");
                break;
            case ROCK:
                System.out.println("Rock");
                break;
        }

        //    mc.ordinal();   //возвращает позицию элемента в данном перечислении
        //System.out.println(mc.ordinal());

        //перебор ENUM
/*
        for (Music element: Music.values()){
            System.out.println(element);
        }*/
    }
}
