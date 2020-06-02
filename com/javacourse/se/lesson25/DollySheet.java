package com.javacourse.se.lesson25;

//Java SE. Урок 25. Клонирование объектов
public class DollySheet implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static DollySheet foo(DollySheet dollySheet2) {
        DollySheet sheet = null;
        try {
            sheet = (DollySheet) dollySheet2.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheet;
    }

    public static void main(String[] args) {
        DollySheet dollySheet = new DollySheet();
        foo(dollySheet);

        DollySheet dollySheet2 = foo(dollySheet);

        dollySheet.setName("Dolly");
        dollySheet2.setName("Sheet");

        System.out.println(dollySheet.getName());
        System.out.println(dollySheet2.getName());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
