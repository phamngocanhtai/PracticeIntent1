package com.example.practiceintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnDial, btnSMS, btnSendMail, btnURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDial = findViewById(R.id.btnDial);
        btnSMS = findViewById(R.id.btnSMS);
        btnSendMail = findViewById(R.id.btnSendMail);
        btnURL = findViewById(R.id.btnURL);

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = "tel: 0908270195";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(data));
                startActivity(intent);
            }
        });

        btnSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = "smsto: 0908270195";
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse(data));
                intent.putExtra("sms_body", "test intent");
                startActivity(intent);
            }
        });

        btnSendMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("plain/text");
                intent.putExtra(Intent.EXTRA_EMAIL, new String [] {"phamngocanhtai@yahoo.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Test");
                intent.putExtra(Intent.EXTRA_TEXT, "Abc");
                startActivity(intent);
            }
        });

        btnURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = "https://sobee.vn";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(data));
                startActivity(intent);
            }
        });
    }
}