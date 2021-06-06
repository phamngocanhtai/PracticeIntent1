package com.example.practiceintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    Button btnCalculate;
    TextView txtDataFrom4, txtKQ;
    int tong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        btnCalculate = findViewById(R.id.btnCalculate);
        txtDataFrom4 = findViewById(R.id.txtDataFrom4);
        txtKQ = findViewById(R.id.txtKetqua);

        Intent intent = getIntent();
        int So_Hang_1 = intent.getIntExtra("So_Hang_1", 0);
        int So_Hang_2 = intent.getIntExtra("So_Hang_2", 0);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tong = So_Hang_1 + So_Hang_2;
                txtKQ.setText("Sum: " + tong);
            }
        });
    }

    @Override
    public void onBackPressed() {

        Intent intent = new Intent();
        intent.putExtra("Tong", tong);
        setResult(RESULT_OK, intent);
        finish();
        super.onBackPressed();
    }
}