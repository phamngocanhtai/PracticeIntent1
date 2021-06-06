package com.example.practiceintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.TextView;

import org.parceler.Parcels;

public class MainActivity3 extends AppCompatActivity {

    TextView txtInform;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        txtInform = findViewById(R.id.txtShow2to3);

        //cách 1
//        Intent intent = getIntent();
//        String name = intent.getStringExtra("name");
//        int year = intent.getIntExtra("year", 0);
//        double gpa = intent.getDoubleExtra("gpa", 0.0);
//        boolean gender = intent.getBooleanExtra("gender", false);

//        txtInform.setText(name + " " + year + " " + gender + " " + gpa);

        //cách 2
 //           Intent intent = getIntent();
 //           Student student = (Student) intent.getSerializableExtra("student");
 //           txtInform.setText(student.toString());

        //cách 3
        Intent intent = getIntent();
        Parcelable parcelable = intent.getParcelableExtra("contact");
        Contact contact = Parcels.unwrap(parcelable);
        txtInform.setText(contact.toString());

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}