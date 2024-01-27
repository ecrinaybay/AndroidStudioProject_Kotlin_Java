package com.ecrinaybay.sqliteproject;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            //Bir veri tabanı açtık
            SQLiteDatabase database = this.openOrCreateDatabase("Musicians",MODE_PRIVATE,null);

            //Buradan itibaren SQL kodu yazıyoruz
            //CREATE TABLE IF NOT EXISTS -> Bir tablo oluştur eğer yoksa
            //(name,age) -> Columnları yazıyoruz
            //VARCHAR -> SQLite'ta String
            //INTEGER yerine INT de yazabiliriz. Ama id belirtirken INTEGER yazmamız gerekir.
            database.execSQL("CREATE TABLE IF NOT EXISTS musicians (id INTEGER PRIMARY KEY,name VARCHAR,age INTEGER)");

            //Bir tabloya değer kaydederken:
            //database.execSQL("INSERT INTO musicians (name,age) VALUES ('James',50)");
            //database.execSQL("INSERT INTO musicians (name,age) VALUES ('Lars',60)");
            //database.execSQL("INSERT INTO musicians (name,age) VALUES ('Kirk',55)");

            //Güncelleme:
            //UPDATE ve SET keywordlerini kullanırız.
            //name = 'Lars' olan verinin age'ini 61 yaptık.
            //database.execSQL("UPDATE musicians SET age = 61 WHERE name = 'Lars'");
            //id = 3 olan verinin name'ini 'Kirk Hammett' yaptık
            //database.execSQL("UPDATE musicians SET name = 'Kirk Hammett' WHERE id = 3");

            //Silme:
            //id = 2 olan veriyi sil
            //database.execSQL("DELETE FROM musicians WHERE id = 2");


            //Veri tabanından okuma:
            // * -> Her şey demek everything
            Cursor cursor = database.rawQuery("SELECT * FROM musicians",null);

            //LIKE ->Gibi
            //LIKE '%s' -> Sonu s ile bitenleri getirir.
            //Cursor cursor = database.rawQuery("SELECT * FROM musicians WHERE name LIKE '%s'",null);
            //LIKE 'K%' -> K ile başlayanları getirir.
            //Cursor cursor = database.rawQuery("SELECT * FROM musicians WHERE name LIKE 'K%'",null);


            //Filtreleyerek okuma:
            //WHERE keyword'u kullanrak biz soruglarımız filtreleyebiliyoruz
            //id= 2 olan verileri getir
            //Cursor cursor = database.rawQuery("SELECT * FROM musicians WHERE id = 2",null);
            //age>52 olan verileri getir
            //Cursor cursor = database.rawQuery("SELECT * FROM musicians WHERE age >52",null);
            //name = 'James' olan verileri getir
            //Cursor cursor = database.rawQuery("SELECT * FROM musicians WHERE name = 'James'",null);

            int nameIx = cursor.getColumnIndex("name");
            int ageIx = cursor.getColumnIndex("age");
            int idIx = cursor.getColumnIndex("id");

            while(cursor.moveToNext()){
                System.out.println("Name:" + cursor.getString(nameIx));
                System.out.println("Age:" + cursor.getInt(ageIx));
                System.out.println("Id:" + cursor.getInt(idIx));
            }
            cursor.close();

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}