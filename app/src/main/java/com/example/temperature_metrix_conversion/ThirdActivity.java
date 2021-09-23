package com.example.temperature_metrix_conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txtResultInCM, getTxtResultInKM,txtDevNameMetric, txtDeveloperName;
    EditText edMeters;
    Button btnConvertMetrics, btnReturnMetrics;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        initialize();
    }

    private void initialize() {

        txtResultInCM = findViewById(R.id.txtResultInCM);
        getTxtResultInKM = findViewById(R.id.txtResultInKM);
        edMeters = findViewById(R.id.edMeter);
        btnConvertMetrics = findViewById(R.id.btnConvertMetrix);
        btnReturnMetrics = findViewById(R.id.btnReturnMetrix);
        //txtDeveloperName = findViewById(R.id.txtDeveloperMetric);
        //txtDevNameMetric = findViewById(R.id.txtDeveloperNameMetric);
        btnReturnMetrics.setOnClickListener(this);
        btnConvertMetrics.setOnClickListener(this);
       // String infor = getIntent().getStringExtra("Information");
        //txtDeveloperName.setText(infor);

    }

    @Override
    public void onClick(View view) {

        int id = view.getId();
        switch (id){

            case R.id.btnReturnMetrix:
                    BackToMain();
                    break;
            case R.id.btnConvertMetrix:
                ConvertToMetric();
                break;


        }


    }

    private void ConvertToMetric() {

         Float  meter = Float.valueOf(edMeters.getText().toString());

         Float toCm = meter * 100;
         Float  toKM = meter / 1000;

         txtResultInCM.setText(String.valueOf(toCm));
         getTxtResultInKM.setText(String.valueOf(toKM));



    }

    private void BackToMain() {
        Intent intent =  new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}