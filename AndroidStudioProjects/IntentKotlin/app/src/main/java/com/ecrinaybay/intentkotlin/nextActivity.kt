package com.ecrinaybay.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ecrinaybay.intentkotlin.databinding.ActivityMainBinding
import com.ecrinaybay.intentkotlin.databinding.ActivityNextBinding

class nextActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intentFromMain = intent //getIntent
        val name = intentFromMain.getStringExtra("name")
        val myInteger = intentFromMain.getIntExtra("myinteger",-1)
        println(myInteger)
        binding.nameText.text = "Name: ${name}"

    }

    fun previous(view : View){

        val intent = Intent(this@nextActivity,MainActivity::class.java)
        startActivity(intent)
        finish()

    }


}
































