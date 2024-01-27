package com.ecrinaybay.kotlindelegates

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

class MainActivity : AppCompatActivity(), LifecycleLogger by LifecycleLoggerImplementation() {

    //property delegates
    //lazy ile buna ulaşılana kadar hafızada yer kaplamıyor
    private val myVariable by lazy {
        println("hello this is a lazy implementation")
        10
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        registerLifecycleOwner(this)
        println(myVariable)
    }

}

interface LifecycleLogger{
    fun registerLifecycleOwner(owner: LifecycleOwner)
}

class LifecycleLoggerImplementation : LifecycleLogger, LifecycleEventObserver{
    override fun registerLifecycleOwner(owner: LifecycleOwner) {
        owner.lifecycle.addObserver(this)
    }

    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        when(event){
            Lifecycle.Event.ON_RESUME -> println("on resume executed")
            Lifecycle.Event.ON_PAUSE -> println("on pause executed")
            else -> Unit
        }
    }
}























































