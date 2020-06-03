package com.javacourse.se.lesson29;

//Java SE. Урок 29. Исключения, ошибки и их иерархия. Блоки try, catch, finally
public class ErrorExample {

    private ABC abc = new ABC();

    public void foo() {
        // System.out.println(1/0);

//        int array[] = {1,2,3};
//        array[5] = 3;

      /*  try {
        abc.show();
        }catch (NullPointerException e){
            //System.out.println("Деление на ноль");
            System.err.println("Деление на ноль");
           // e.printStackTrace();
        }*/

        //////////////////////////////////////////////////
      /*if(abc == null){
          System.out.println("Null pointer");
      }else {
          abc.show();
      }
    }*/

        try {
            System.out.println(1 / 0);
        } catch (NullPointerException | ArithmeticException e) {
            e.printStackTrace();
        }finally {   //обычно освобождение ресурсов

        }
    }
}
