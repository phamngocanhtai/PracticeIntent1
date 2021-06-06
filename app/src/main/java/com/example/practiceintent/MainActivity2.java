package com.example.practiceintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import android.widget.Button;

import org.parceler.Parcels;

public class MainActivity2 extends AppCompatActivity {

    Button btnShowData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnShowData = findViewById(R.id.btnSendData);
        btnShowData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //cách 1
 //               Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
 //               intent.putExtra("name", "Tai Pham");
 //               intent.putExtra("year", 2021);
 //               intent.putExtra("gender", true);
 //               intent.putExtra("gpa", 5.5);
 //               startActivity(intent);

                //cách 2
 //              Student student = new Student("Tai Pham", 2021, 5.5, true);
 //               Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
 //               intent.putExtra("student", student);
 //               startActivity(intent);

                //cách 3
                Contact contact = new Contact("Tai Pham","0908 270");
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("contact", Parcels.wrap(contact));
                startActivity(intent);
            }
        });
    }
}