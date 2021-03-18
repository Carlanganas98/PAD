package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CalculatorResultActivity extends AppCompatActivity {

    protected TextView result_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_result);

        Intent intent = getIntent();
        int result = intent.getIntExtra(MainActivity.EXTRA_ADD_RESULT, 0);
        TextView result_text = findViewById(R.id.textView);
        result_text.setText("Result is " + result);
    }
}