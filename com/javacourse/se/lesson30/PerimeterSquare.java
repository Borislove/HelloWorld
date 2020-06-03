package com.javacourse.se.lesson30;

public class PerimeterSquare {

    public void getPerimeter(String str) throws PerimeterException {
        Square square = new Square();

        try {
            double side = Double.parseDouble(str);
            square.setSide(4);
        }catch (NumberFormatException e){
            throw  new PerimeterException("String is incorrect",e);

        } catch (PerimeterException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
