package com.example.temperature_metrix_conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
 EditText  edName;
 Button btnTemperature, btnMetric, btnQuit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        EditText  edName = findViewById(R.id.edName);
        Button btnTemperature = findViewById(R.id.btnTemperature);
        Button btnMetric = findViewById(R.id.btnMetric);
        Button btnQuit = findViewById(R.id.btnQuit);
        btnQuit.setOnClickListener(this);
        btnTemperature.setOnClickListener(this);
        btnMetric.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        int id   = view.getId();
        switch(id){
            case R.id.btnTemperature:
                goToTemperature();
                break;

            case R.id.btnMetric:
                goToMetric();
                break;
            case R.id.btnQuit:
                Quit();
                break;



        }



    }

    private void Quit() {

        finish();
    }

    private void goToMetric() {
        //String infor = edName.getText().toString().trim();
        Intent intent = new Intent(this,ThirdActivity.class);
        //intent.putExtra("Information", infor);
        startActivity(intent);
    }

    private void goToTemperature() {
        //String aName  = edName.getText().toString();
        Intent intent = new Intent(this,SecondActivity.class);
        //intent.putExtra("name", aName);
        startActivity(intent);
    }
}