package com.fsq.learnJava.day02;

public class WrapperClasses {



    public static void main(String[] args) {
        Byte byteData = 99;
        Integer intData = 9999;
        Long longData = 99999999999999999l;
        Float floatData = 123.23f;
        Double doubleData = 12345678.12345;

        Character charData = 'A';
        Boolean booleanData=true;

        String name="test";

        System.out.println(byteData + " " + Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
        System.out.println(intData + " " + Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
        System.out.println(longData + " " + Long.MIN_VALUE + " " + Long.MAX_VALUE);
        System.out.println(floatData + " " + Float.MIN_VALUE + " " + Float.MAX_VALUE);
        System.out.println(doubleData + " " + Double.MIN_VALUE + " " + Double.MAX_VALUE);
        System.out.println(charData + " " + Character.MIN_VALUE + " " + Character.MAX_VALUE);
        System.out.println(booleanData + " " + Boolean.TRUE + " " + Boolean.FALSE);
 //       System.out.println(name + " " + String. + " " + String.MAX_VALUE);

        String age="21";
        int int_age = Integer.parseInt(age);
        System.out.println(int_age);
    }
}
