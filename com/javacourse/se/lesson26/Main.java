package com.javacourse.se.lesson26;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String str1 = new String(" Hot JAva ");

        String str2 = "Java";

        str1.charAt(0);         //принимает индекс и возвращает символ
        System.out.println(str1.charAt(1));

        System.out.println(str1.codePointAt(1));   //возвращает символ в кодировке unicode

        System.out.println(str1.compareTo(str2));

        System.out.println(str1.compareToIgnoreCase(str2));   //сравнение без регистра букв

        System.out.println(str1.concat(str2));   //для слияния строк

        System.out.println(str1.equals(str2));   //сравнение на равенство, возвращает булево

        System.out.println(str1.equalsIgnoreCase(str2));  //сравнение на равенство без учета регистра

        System.out.println(str1.hashCode());  //возвращает хешкод

        System.out.println(str1.indexOf(65));    //поиск символа в кодировке,если есть возвращает 1

        System.out.println(str1.isEmpty());  //возвращает true , если длина строки равна 0

        System.out.println(str1.length()); //число символов в строке

        String [] strings = str1.split(" ");
        //System.out.println(str1.split());   //принимает разделитель и возвращает массив слов
        System.out.println(Arrays.toString(strings));

        str1.substring(2,8);
        System.out.println(str1.substring(2,8));   //вырезает кусок строки по заданному индексу

        char[] charArray = str1.toCharArray();
        for(char element: charArray){
            System.out.println(element);
        }
        //str1.toCharArray() ;  //разбивает строку посимвольно на массив


        str1.toLowerCase();  //приводит строку к мелким буквам
        System.out.println(str1.toLowerCase());

        System.out.println(str2.toUpperCase());  //все символы большими

        System.out.println(str1.trim());   //обрезает пробелы в начале и конце строки

        //String.copyValueOf()    //принимает массив и преобразует в строку
    }

}
