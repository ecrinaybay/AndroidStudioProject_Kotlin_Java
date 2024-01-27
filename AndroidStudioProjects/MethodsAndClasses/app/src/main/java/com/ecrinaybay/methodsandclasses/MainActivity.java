package com.ecrinaybay.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String username; //Global değişken olduğu için farklı metotların içinden ulaşabildik.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("on create called");
        testMethod();

        System.out.println(math(3,5));

        System.out.println(newMethod("Ecrin"));

        username = "";

        makeMusicians();
        makeSimpsons();

    }

    public void makeSimpsons(){
        Simpsons homer = new Simpsons("Homer",50,"Nuclear");
        /*homer.age = 51; //get ve set yoksa private yaptığımızda erişemeyiz.
        System.out.println(homer.age);*/

        System.out.println(homer.getName());
        homer.setName("Homer Simpsons"); //set ile alarak değişiklik yaptık ve yazdırdık
        System.out.println(homer.getName()); //get ile alarak yazdırdık

    }

    public void makeMusicians(){
        //instance

        Musicians james = new Musicians("James","Guitar",50);
        System.out.println(james.instrument);

    }


    public void testMethod() {
        //String username = "Lark"; //Buradaki username globalde tanımladığımız usernameden farklıdır.
        username = "Lark";
        int x = 4 + 4;
        x = 9;
        System.out.println("value of x" + x);
    }

    public int math(int a, int b){
        username = "Kirk"; //Globaldeki username
        int x = 11;
        System.out.println("value of x in math: " + x);
        return a + b;
    }

    public String newMethod(String string){
        username = "Rob";
        return string + " new Method";
    }


    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("on resume called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("on stop called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("on pause called");
    }
}