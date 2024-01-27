package com.ecrinaybay.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ecrinaybay.kotlincalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var myString : String
    private lateinit var binding: ActivityMainBinding

    var number1 : Double? = null
    var number2 : Double? = null
    var result : Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        myString = ""

    }

    fun mySum(view : View) {

        number1 = binding.editText.text.toString().toDoubleOrNull()
        number2 = binding.editText2.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null ) {
            result = number1!! + number2!!
            binding.resultText.text = "Result: ${result}"

        } else {
            binding.resultText.text = "Error!"
        }


    }

    fun mySub(view : View) {

        number1 = binding.editText.text.toString().toDoubleOrNull()
        number2 = binding.editText2.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null ) {
            result = number1!! - number2!!
            binding.resultText.text = "Result: ${result}"

        } else {
            binding.resultText.text = "Error!"
        }

    }

    fun myMultiply(view: View) {

        number1 = binding.editText.text.toString().toDoubleOrNull()
        number2 = binding.editText2.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null ) {
            result = number1!! * number2!!
            binding.resultText.text = "Result: ${result}"

        } else {
            binding.resultText.text = "Error!"
        }


    }

    fun myDiv(view: View) {

        number1 = binding.editText.text.toString().toDoubleOrNull()
        number2 = binding.editText2.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null ) {
            result = number1!! / number2!!
            binding.resultText.text = "Result: ${result}"

        } else {
            binding.resultText.text = "Error!"
        }

    }

}