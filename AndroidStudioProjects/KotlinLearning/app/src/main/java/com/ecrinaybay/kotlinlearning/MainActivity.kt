package com.ecrinaybay.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Variables && Constants

        //Integer

        var x = 5
        var y = 4

        println(x * y)

        var age = 35

        val result = age / 7 * 5

        println(result)

        //Defining
        var myInteger : Int

        //Initialize
        myInteger = 10
        myInteger = 20

        val a : Int = 35

        println(a/2)

        //Long

        var myLong : Long = 10

        //Double & Float

        val pi = 3.14

        println(pi * 2.0)

        val myFloat = 3.14f

        println(myFloat * 2)

        var myAge : Double
        myAge = 3.6
        println(myAge / 2)

        //camelCase
        //snake_case

        //String
        println("-------String--------")

        val myString = "atil samancioglu"
        val name = "James"
        val surname = "Hetfield"

        val fullname = name + " " + surname

        println(fullname)

        val larsName : String = "Lars"

        println(myString.capitalize())

        //Boolean
        var myBoolean : Boolean = true
        myBoolean = false

        var isAlive = true

        // <
        // >
        // <=
        // >=
        // ==
        // !=
        // && -> AND
        // || -> OR

        println(3 < 5)
        println(6 < 3)
        println(3 == 3)
        println(4 != 5)

        //Conversion

        var myNumber = 5
        var myLongNumber = myNumber.toLong()
        println(myLongNumber)

        var input = "10"
        var inputInteger = input.toInt()
        println(inputInteger * 2)


        //Collections
         val myArray = arrayOf("James","Kirk","Rob","Lars")

        //index
        println(myArray[0])
        myArray[0] = "James Hetfield"
        println(myArray[0])

        myArray.set(1,"Kirk Hammett")
        println(myArray[1])

        val numberArray = arrayOf(1,2,3,4,5)
        println(numberArray[3])
        //println(numberArray[5]) -->Uygulama çöker

        val myNewArray = doubleArrayOf(1.0,2.0,3.0)

        val mixedArray = arrayOf("Atil", 5)

        println(mixedArray[0])
        println(mixedArray[1])

        //List - ArrayList

        val myMusician = arrayListOf<String>("James", "Kirk")
        myMusician.add("Lars")
        println(myMusician[2])
        myMusician.add(0,"Rob")
        println(myMusician[0])

        val myArrayList = ArrayList<Int>()
        myArrayList.add(1)
        myArrayList.add(200)

        val myMixedArrayList = ArrayList<Any>()
        myMixedArrayList.add("Atil")
        myMixedArrayList.add(12.25)
        myMixedArrayList.add(true)

        println(myMixedArrayList[0])
        println(myMixedArrayList[1])
        println(myMixedArrayList[2])

        //Set
        //Diziden farkı bir eleman set2in içinde yalnız 1 defa olabilir

        val myExampleArray = arrayOf(1,1,2,3,4)

        println("element 1: ${myExampleArray[0]}")
        println("element 1: ${myExampleArray[1]}")

        val mySet = setOf<Int>(1,1,2,3,)
        println(mySet.size) // 1 sayısnı 1 kez alır eleman sayısını 3 kabul eder

        //For Each

        mySet.forEach { println(it * 3) } //1,2 ve 3'ü 3 ile çarparak yazar

        val myStringSet = HashSet<String>()
        myStringSet.add("Atil")
        myStringSet.add("Atil")
        println(myStringSet.size) //Çıktı 1 olur


        //Map - HashMap

        //Key - Value

        val fruitArray = arrayOf("Apple", "Banana")
        val caloriesArray = arrayOf(100,150)

        println("${fruitArray[0]} : ${caloriesArray[0]}") //Çıktı -> Apple : 100

        val fruitCalorieMap = hashMapOf<String, Int>()
        fruitCalorieMap.put("Apple",100)
        fruitCalorieMap.put("Banana",150)
        println(fruitCalorieMap["Apple"]) //Çıktı -> 100

        val myHashMap = HashMap<String, String>()

        val myNewMap = hashMapOf<String,Int>("A" to 1, "B" to 2, "C" to 3)
        println(myNewMap["C"]) //Çıktı -> 3

        // Operator
        var m = 5
        println(m)
        m = m + 1
        println(m)
        m++
        println(m)
        m--
        println(m)

        var n = 7

        println(n > m)

        // && - VE
        // || - VEYA

        println(n > m && 2 > 1) //true
        println(n > m && 1 > 2) //false
        println(n > m || 1 > 2) // true

        println(10 + 2)
        println(10 - 2)
        println(10 * 2)
        println(10 / 2)
        //Remainder - mod işlemi
        println(10 % 2) //0
        println(10 % 3) //1
        println(10 % 4) //2

        //If Control

        val myNumberAge = 52

        if(myNumberAge < 30){
            println("<30")
        }else if(myNumberAge >= 30 && myNumberAge <= 40){
            println("30 - 40")
        }else if(myNumberAge >= 40 && myNumberAge < 50){
            println("40 - 50")
        }else{
            println(">=50")
        }

        //Switch - when

        /*
        val day = 3
        var dayString = ""

        if(day == 1){
            dayString = "Monday"
        }else if(day == 2){
            dayString = "Tuesday"
        }
        else if(day == 3){
            dayString = "Wednesday"
        }
        else if(day == 4){
            dayString = "Thursday"
        }else if(day == 5){
            dayString = "Friday"
        }else if(day == 6){
            dayString = "Saturday"
        }else{
            dayString = "Sunday"
        }
        println(dayString)
        */

        val day = 3
        var dayString = ""

        when(day) {

            1 -> dayString = "Monday"
            2 -> dayString = "Tuesday"
            3 -> dayString = "Wednesday"
            4 -> dayString = "Thursday"
            5 -> dayString = "Friday"
            6 -> dayString = "Saturday"
            7 -> dayString = "Sunday"
            else -> dayString = ""
        }
        println(dayString)

        //Loops

        //For Loop

        val myArrayOfNumbers = arrayOf(12,15,18,21,24,27,30,33)
        val q = myArrayOfNumbers[0] / 3 * 5
        println(q)

        for(number in myArrayOfNumbers){
            val z = number / 3 * 5
            println(z)
        }

        for(i in myArrayOfNumbers.indices) {
            //indices tek tek indisleri veriyor

            val qz = myArrayOfNumbers[i] / 3 * 5
            println(qz)
        }

        for(b in 0..9){
            println(b)
        }
        val myStringArrayList = ArrayList<String>()
        myStringArrayList.add("Atil")
        myStringArrayList.add("Samancioglu")
        myStringArrayList.add("Bar")

        for(str in myStringArrayList){
            println(str)
        }

        myStringArrayList.forEach { println(it) }


        //While Loop

        var j = 0

        while(j < 10){
            println(j)
            j = j + 1
        }


    }
}





























