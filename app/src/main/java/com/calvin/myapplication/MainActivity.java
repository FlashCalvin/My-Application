package com.calvin.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edHeight;
    private EditText edWeight;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi);
        edWeight = findViewById(R.id.ed_Weight);
        edHeight = findViewById(R.id.ed_Height);

    }
    public void bmi(View view){
        float weight = Float.parseFloat(edWeight.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());
        float bmi = weight/(height*height);
        Log.d("MainActivity","BMI"+bmi);

    }
}
