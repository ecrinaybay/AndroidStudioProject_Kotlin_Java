package com.ecrinaybay.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Light Weightness

        /*GlobalScope.launch {
            repeat(100000){
                launch {
                    println("android")
                }
            }
        }*/

        //Scope
        //Global Scope, runBlocikng, CoroutineScope


        //runBlocking
        /*println("run blocking start")    //1
        runBlocking {
            launch {
                delay(5000)
                println("run blocking")    //2
            }
        }
        println("run blocking end")        //3
        */

        /*
        //Global Scope
        println("global scope start")      //1
        GlobalScope.launch {
            delay(5000)
            println("global scope")         //3
        }
        println("global scope end")         //2
        */


        //Coroutines Scope
        //Context -> Hangi verilerle çalışacağını söylüyor

        /*Global scope tüm application içersinde çalıştırılmasını sağlarken, coroutine scope'ta hangi thread'lerde çalıştırılacağına
        kadar seçebiliyoruz. */


        println("coroutine scope start")                //1
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            println("coroutine scope")                  //3
        }
        println("coroutine scope end")                  //2





    }
}














































