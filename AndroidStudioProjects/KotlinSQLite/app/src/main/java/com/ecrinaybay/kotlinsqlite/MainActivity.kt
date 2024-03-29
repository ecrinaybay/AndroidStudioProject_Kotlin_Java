package com.ecrinaybay.kotlinsqlite

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try{

            val myDatabase = this.openOrCreateDatabase("Musicians", Context.MODE_PRIVATE,null)

            myDatabase.execSQL("CREATE TABLE IF NOT EXISTS musicians (id INTEGER PRIMARY KEY, name VARCHAR, age INT)")

            //myDatabase.execSQL("INSERT INTO musicians (name, age) VALUES ('James', 50)")
            //myDatabase.execSQL("INSERT INTO musicians (name, age) VALUES ('Lars', 60)")
            //myDatabase.execSQL("INSERT INTO musicians (name, age) VALUES ('Kirk', 55)")

            //myDatabase.execSQL("UPDATE musicians SET age = 61 WHERE name = 'Lars'") //Sadece lars'ın yaşını 61 olarak güncelledik
            //myDatabase.execSQL("UPDATE musicians SET name = 'Kirk Hammet' WHERE id = 3") //id = 3 olanının name'ini Kirk Hammet olarak değiştir

            myDatabase.execSQL("DELETE FROM musicians WHERE name = 'Lars'") //İsmi Lars olan verileri sil

            //val cursor = myDatabase.rawQuery("SELECT * FROM musicians WHERE id = 3 ", null)
            //val cursor = myDatabase.rawQuery("SELECT * FROM musicians WHERE name LIKE '%s' ", null)
            //val cursor = myDatabase.rawQuery("SELECT * FROM musicians WHERE name LIKE 'K%' ", null)
            val cursor = myDatabase.rawQuery("SELECT * FROM musicians", null)

            val nameIx = cursor.getColumnIndex("name")
            val ageIx = cursor.getColumnIndex("age")
            val idIx = cursor.getColumnIndex("id")

            while (cursor.moveToNext()) {
                println("Name: " + cursor.getString(nameIx))
                println("Age: " + cursor.getInt(ageIx))
                println("Id: " + cursor.getInt(idIx))
            }
            cursor.close()


        }catch (e: Exception){
            e.printStackTrace()

        }



    }
}























































