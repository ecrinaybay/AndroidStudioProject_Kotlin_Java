package com.ecrinaybay.oopproject;

import android.os.Bundle;

public class User extends People {

    //Property
    String name;
    String job;

    //Constructor


    public User(String name, String job) {
        this.name = name; //this içinde bulunduğumuz aktiviteye ya da sınıfa referans verir.
        this.job = job;

        System.out.println("User created");
    }

    /*Bu şekilde de yapabilirdik
    public User(String nameInput, String jobInput) {
        this.name = nameInput; //this içinde bulunduğumuz aktiviteye ya da sınıfa referans verir.
        this.job = jobInput;
    }*/

}
