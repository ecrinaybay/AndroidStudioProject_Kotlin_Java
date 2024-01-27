package com.ecrinaybay.landmarkbookkotlin

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.ecrinaybay.landmarkbookkotlin.databinding.ActivityDetailsBinding
import com.ecrinaybay.landmarkbookkotlin.databinding.ActivityMainBinding

//var chosenLandmark : Landmark? = null //Sınıfın dışında tanımlandığından global değişken diyoruz


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        // Data

        val pisa = Landmark("Pisa","Italy",R.drawable.pisa)
        val colosseum = Landmark("Colosseum","Italy",R.drawable.colosseum)
        val eiffel = Landmark("Eiffel","France",R.drawable.eiffel)
        val londonBridge = Landmark("London Bridge", "UK", R.drawable.london_bridge)

        landmarkList.add(pisa)
        landmarkList.add(colosseum)
        landmarkList.add(eiffel)
        landmarkList.add(londonBridge)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter

        //Inefficient
        //val pisaBitmap = BitmapFactory.decodeResource(resources,R.drawable.pisa)

        /* //ListView
        // Adapter : Layout & Data

        //Mapping

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkList.map { landmark -> landmark.name })

        binding.listView.adapter = adapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener{parent,view,position,id ->
            val intent = Intent(Main@this,DetailsActivity::class.java)
            intent.putExtra("landmark",landmarkList.get(position))

            startActivity(intent)
        }
        */

    }
}
























































