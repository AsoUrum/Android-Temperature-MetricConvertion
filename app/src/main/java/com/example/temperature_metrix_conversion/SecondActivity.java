package com.example.temperature_metrix_conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{
    EditText edTempInC;
    TextView txtTempInF,txtDevName;
    Button btnConvert,btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initialize();
    }

    private void initialize() {
        edTempInC = findViewById(R.id.edTempInC);
        txtDevName  = findViewById(R.id.txtDevName);
        txtTempInF = findViewById(R.id.txtResultTempInF);
        btnConvert = findViewById(R.id.btnConvert);
        btnReturn = findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(this);
        btnConvert.setOnClickListener(this);
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        //String  labelName = txtDevName.getText().toString();
        txtDevName.setText(name);
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();
        switch (id){
            case R.id.btnConvert:
                Convert();
                break;
            case R.id.btnReturn:
                Return();
                break;
        }

    }

    private void Return() {

        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    private void Convert() {

        Float tempInC =  Float.valueOf(edTempInC.getText().toString());
        double tempInF = (tempInC * 1.8) + 32 ;
        txtTempInF.setText(String.valueOf(tempInF));

    }
}