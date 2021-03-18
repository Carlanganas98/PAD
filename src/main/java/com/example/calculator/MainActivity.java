package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{

    protected Calculator calculator = new Calculator();
    protected EditText editTextX;
    protected EditText editTextY;

    private static final String LOG = MainActivity.class.getSimpleName();
    static final String EXTRA_ADD_RESULT = "resultado";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextX = findViewById(R.id.editTextNumberDecimal);
        editTextY = findViewById(R.id.editTextNumberDecimal2);
        Log.d(LOG,"UI creada correctamente");
    }

    public void addXandY(View v){
        Integer elem1 = Integer.parseInt(editTextX.toString().trim());
        Integer elem2 = Integer.parseInt(editTextY.toString().trim());
        Integer result = calculator.add(elem1,elem2);

        Log.d(LOG,"Resultado con x (" + elem1 + ") y con y (" + elem2 + "): " + result);

        Intent showResultIntent = new Intent(this, CalculatorResultActivity.class);
        showResultIntent.putExtra(EXTRA_ADD_RESULT, result);
        startActivity(showResultIntent);
    }
}