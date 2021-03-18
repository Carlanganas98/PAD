package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{

    protected Calculator calculator;
    protected EditText editTextX;
    protected EditText editTextY;
    public static final String EXTRA_ADD_RESULT = "resultado";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.editTextNumberDecimal);
        findViewById(R.id.editTextNumberDecimal2);
    }

    protected void addXandY(View v){
        //
        Integer elem1 = Integer.parseInt(editTextX.toString().trim());
        Integer elem2 = Integer.parseInt(editTextY.toString().trim());
        Integer result = calculator.add(elem1,elem2);
        //crear objeto intent
        Intent showResultIntent = new Intent(this, CalculatorResultActivity.class);
        showResultIntent.putExtra(EXTRA_ADD_RESULT, result);
        startActivity(showResultIntent);
    }
}