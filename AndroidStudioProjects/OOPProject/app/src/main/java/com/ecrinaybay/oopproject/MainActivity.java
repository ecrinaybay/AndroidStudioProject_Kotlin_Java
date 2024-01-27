package com.ecrinaybay.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*User myUser = new User();
        myUser.name = "Atil";
        myUser.job = "Instrucor";

        User newUser = new User();
        newUser.name = "Kirk";
        newUser.job = "Musician";*/

        User myUser = new User("Atil","Instructor");
        System.out.println(myUser.information());
        System.out.println(myUser.name);

        //Encapsulations

        Musicians james = new Musicians("James","Guitar",50);
        System.out.println(james.getName());
        james.setAge(60,"Kirk"); //age'i değiştiremeyiz çünkü password yanlış.
        james.setAge(60,"Atil"); //password doğru olduğu için age değiştirilir.
        System.out.println(james.getAge());

        //Inheritance

        SuperMusicians lars = new SuperMusicians("Lars","Drums",55);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());

        //Polymorphism

        //Static Polymorphism

        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(5,3));
        System.out.println(mathematics.sum(5,3,4));

        //Dynamic Polymorphism

        Animal myAnimal = new Animal();
        myAnimal.sing();
        Dog barley = new Dog();
        barley.test();
        barley.sing();

        Piano myPiano = new Piano();
        myPiano.brand = "Yamaha";
        myPiano.digital = true;
        myPiano.info();


    }
}