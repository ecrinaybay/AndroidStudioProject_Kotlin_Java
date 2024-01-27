package com.ecrinaybay.oopproject;

public class SuperMusicians extends Musicians {
//extends edilen sınıfın consructorları olmak zorunda
    public SuperMusicians(String name, String instrument, int age) {
        super(name, instrument, age); //super ile extends ettiğimiz sınıfa referans veriyoruz.

    }

    public String sing(){
        return "Nothing Else Matters";
    }



}
