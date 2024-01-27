package com.ecrinaybay.storingdata

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ecrinaybay.storingdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var sharedPref : SharedPreferences
    var ageFromPref : Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //SharedPreferences - XML - Key-Value
        sharedPref = this.getSharedPreferences("com.ecrinaybay.storingdata", Context.MODE_PRIVATE)

        ageFromPref = sharedPref.getInt("age",-1)

        if(ageFromPref == -1){
            binding.textView.text = "Your age: "
        }else{
            binding.textView.text = "Your age: ${ageFromPref}"
        }

    }

    fun save(view : View){
        val myAge = binding.editText.text.toString().toIntOrNull()

        if (myAge != null){
            binding.textView.text = "Your age: ${myAge}"
            sharedPref.edit().putInt("age",myAge).apply()
        }
    }

    fun delete(view : View){

        ageFromPref = sharedPref.getInt("age",-1)

        if(ageFromPref != -1){
            sharedPref.edit().remove("age").apply()
            binding.textView.text = "Your age: "

        }


    }


}































