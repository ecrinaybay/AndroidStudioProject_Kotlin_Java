package com.ecrinaybay.classesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.Nullable
import kotlinx.coroutines.yield

class MainActivity : AppCompatActivity() {

    private lateinit var myTextView : TextView
    private lateinit var  myButton : Button
    private lateinit var nameText : EditText
    private lateinit var ageText : EditText
    private lateinit var jobText : EditText
    var name = ""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTextView = findViewById(R.id.textView)
        myButton = findViewById(R.id.button)
        nameText = findViewById(R.id.nameText)
        nameText = findViewById(R.id.jobText)
        nameText = findViewById(R.id.ageText)


        /*
        myButton.setOnClickListener {
            myTextView.text = "Button clicked 2"
        }
*/

        // 1) code block, reusable 2) input 3) output - return

        println("hello kotlin")

        test()
        val sumResult =  mySum(10,15)
        val result =  myMultiply(10,20)

        println(sumResult)
        println(result)

        //Class
        val homer = Simpson("Homer Simpson", 50, "Nuclear")
        homer.setHeight(50)

        //Nullability

        var myString : String? = null
        myString = "test"
        println(myString)

        var myAge : Int? = null
        //myAge = 50
        // !! ?

    // 1) !!
        //println(myAge!! * 10) // !! koymak myAge %100 null değil eminiz demiş oluyoruz. Gerçekten %100 ise kullanılmlı yoksa uygulama çöker.

    // 2) safe call
        println(myAge?. minus(10))

    // 3)
    if(myAge != null){
        println(myAge.minus(10))
    }else{
        println("myAge is null")
    }

    // 4) elvis operator ?:
    //Elvis operatorun solundaki değer eğer null gelirse -10 yazıdırır değilse istenilen şeyi yapar.

    println(myAge?.minus(10) ?: -10 )

    // 5)
    myAge?.let {
        //this gibi it keywordu var
        println(it*10) //Bu it myAge'in değerini alıyor
    }


    }

    fun test(){
        println("test function")
    }

    fun mySum(a : Int, b: Int){

    }

    fun myMultiply(x : Int, y : Int) : Int{

        val result = x * y
        myTextView.text = "Result: ${result}"
        return result

    }

    fun buttonClicked(view : View){
        name = nameText.text.toString()
        val age = ageText.text.toString().toIntOrNull()
        val job = jobText.text.toString()

        if(age != null){
            val simpson = Simpson(name, age, job)
            myTextView.text = "Name: ${simpson.name} Age: ${simpson.age} Job: ${simpson.job}"
        }else{
            myTextView.text = "Enter your age"
        }


    }




}



















