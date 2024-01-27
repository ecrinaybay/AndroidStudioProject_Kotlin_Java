package com.ecrinaybay.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    //Dispatchers
    //Dispatchers.Default -> CPU Intensive
    //Dispatchers.IO -> Input / Output, Networking
    //Dispatchers.Main -> UI
    //Dispatchers.Uncofined -> Inherited dispatcher

    //Bu kodları MainActivity içerisinden çalıştırmak gerekiyor

    runBlocking {
        launch(Dispatchers.Main) {
            println("Main Thread ${Thread.currentThread().name}")
        }

        launch(Dispatchers.IO) {
            println("IO Thread ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default) {
            println("Default Thread ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Unconfined) {
            println("Unconfined Thread ${Thread.currentThread().name}")
        }
    }



}

















































