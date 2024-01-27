package com.ecrinaybay.landmarkbookkotlin

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ecrinaybay.landmarkbookkotlin.databinding.ActivityDetailsBinding
import com.ecrinaybay.landmarkbookkotlin.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
/*
        val selectedLandmark : Landmark = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getSerializableExtra("landmark",Landmark::class.java)!! }
        else { intent.getSerializableExtra("landmark") as Landmark }

 */

        val selectedLandmark = MySingleton.chosenLandmark

        selectedLandmark.let {
            binding.nameText.text = selectedLandmark!!.name
            binding.countryText.text = selectedLandmark!!.country
            binding.imageView.setImageResource(selectedLandmark!!.image)
        }





    }
}













































