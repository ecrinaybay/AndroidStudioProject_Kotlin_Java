package com.ecrinaybay.javalearning;

public class Variables {

    public static void main(String[] args){

        //Variables ( Değişkenler)

        //Integer - Long

        int age = 20;

        System.out.println(10*age);
        System.out.println(age/5);

        int x = 5;
        int y = 11;

        System.out.println(y/x); //cvp:2

        long myLong = 10;
        System.out.println(myLong/5);

        //Double - Float

        double z = 5.0;
        double a = 11.0;

        System.out.println(a/z); //cvp:2.2

        float myFloat = 10.0f;

        double pi = 3.14;

        int r = 5;

        System.out.println(2*pi*r); //cvp:31.400000000000002

        //String

        String name = "James";
        String surname = "Hetfield";

        name = "Lars"; //James değil Lars oldu
        //name = 40 diyemeyiz çünkü tipleri farklı. Python'da yapılabilir ama java buna izin vermez.

        String fullname = name + " " + surname;

        System.out.println(name);
        System.out.println(surname);
        System.out.println(fullname);

        //Boolean

        boolean isAlive = true;
        isAlive = false;
        System.out.println(isAlive);

        //Final
        final int myInteger = 5; // final ile sabit tanımlamış olduk.
        System.out.println("myIntger:" + myInteger);

        //myInteger = 4; yapıp değeri değiştiremeyiz çünkü final ile tanımladık



    }


}
