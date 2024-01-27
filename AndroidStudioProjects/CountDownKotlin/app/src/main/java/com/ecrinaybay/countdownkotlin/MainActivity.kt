package com.ecrinaybay.countdownkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.ecrinaybay.countdownkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //Abstract - Interface - Inheritance

        object : CountDownTimer(10000,1000){
            override fun onTick(millisUntilFinished: Long) {
                binding.textView.text = "Left:${millisUntilFinished / 1000}"
            }

            override fun onFinish() {
                binding.textView.text = "Left: 0"
            }

        }.start()

    }
}






























