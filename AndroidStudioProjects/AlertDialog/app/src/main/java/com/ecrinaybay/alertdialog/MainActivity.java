package com.ecrinaybay.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Context
        //Activity Context -->Aktiviteyle alakalı durumlarda this kullanıyoruz.
        //this
        //App Context --> Genel app'i ilgilendiren durumlarda getApplicationContext()'i kullanıyoruz. Genelde app ile alakalı olanlar activitiy'i de ilgilendirebilir.
        //getApplicationContext()

        Toast.makeText(this,"Toast Message",Toast.LENGTH_LONG).show(); //Burada MainActivity.this yerine sadece this kullanabilriz
        //Toast.makeText(getApplicationContext(),"Toast Message",Toast.LENGTH_LONG).show(); //Bu şekilde de kullanabiliriz.
    }

    public void save(View view){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Save");
        alert.setMessage("Are you sure?");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() { //listeneri bir olay olduğununda ne yapılacağını yazdığımız dinleyici metotlar , arayüzler olarak düşünebiliriz.
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //save
                Toast.makeText(MainActivity.this,"Saved",Toast.LENGTH_LONG).show(); //Burada MainActivity.this yerine sadece this kullanamayız.
                //Toast.makeText(getApplicationContext(),"Saved",Toast.LENGTH_LONG).show(); //Bu şekilde de yapabiliriz.
            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"Not Saved",Toast.LENGTH_LONG).show();
            }
        });
        alert.show();

    }


}