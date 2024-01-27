package com.ecrinaybay.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ecrinaybay.intentkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        println("onCreate executed")

    }

    override fun onStart() {
        super.onStart()
        println("onStart executed")
    }

    override fun onResume() {
        super.onResume()
        println("onResume executed")

    }

    override fun onPause() {
        super.onPause()
        println("onPause executed")
    }

    override fun onStop() {
        super.onStop()
        println("onStop executed")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy executed")
    }



    fun next(view : View){
        val intent = Intent(this@MainActivity, nextActivity::class.java) //nextActivity::class.java nextAactivitye referans veriyoruz
        intent.putExtra("name",binding.editText.text.toString())
        intent.putExtra("myinteger",10)
        //intent.putExtra("username","ecrinaybay")
        startActivity(intent)
        finish()

    }
}



























