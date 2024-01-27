package com.ecrinaybay.kotlinadvancedfunctions

import android.app.backup.BackupAgent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private var myInt : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(myInt != null){
            val num = myInt!! + 1
        }

        myInt?.let {
            val num = it + 1
        }

        val myNum = myInt?.let {
            it + 1
        }?:0 //myInt'in değeri yoksa 0 kabul edilir

        //also
        val atil = Person("Atil",35)
        val atlas = Person("Atlas",1)
        val zeynep = Person("Zeynep", 27)

        val people = listOf<Person>(atil,atlas,zeynep)

        //also şunu yap bir de şunları yap gibi bir işe yarıyor

        people.filter { it.age > 18 }.also {
            for(person in it){
                println(person.name)
            }
        }

        //apply

        val intent = Intent()
        intent.putExtra("","")
        intent.putExtra("","")
        intent.`package` = ""
        intent.action = ""

        val intentWithApply = Intent().apply {
            intent.putExtra("","")
            intent.putExtra("","")
            intent.`package` = ""
            intent.action = ""
        }

        //with

        Person("barley",4).apply {
            name = "Barley"
        }.also {
            println(it.name)
        }

        val newBarley = Person("bar",4).apply {
            name = "Barley"
        }
        println(newBarley)

        val anotherBarley = with(Person("arley",4)){
            name = "Barley"
        }
        println(anotherBarley)

        val withBarley = Person("arley",4)

        with(withBarley){
            name = "Barley"
            age = 4
        }

        println("last barley: " + withBarley.name)



    }
}

data class Person(var name : String, var age : Int)












































