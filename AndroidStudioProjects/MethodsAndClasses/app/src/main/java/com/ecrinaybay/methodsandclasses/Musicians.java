package com.ecrinaybay.methodsandclasses;

public class Musicians {
    //attribute
    String name;
    String instrument;
    int age;

    //Constructor
    public Musicians(String name, String instrument, int age) {
        this.name = name; //this sınıfa referans veriyor.
        this.instrument = instrument;
        this.age = age;
        System.out.println("construtor called.");
    }
}


