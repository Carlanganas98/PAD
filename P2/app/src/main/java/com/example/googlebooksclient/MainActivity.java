package com.example.googlebooksclient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.nio.file.Files;

public class MainActivity extends AppCompatActivity {

    private EditText bookAutor;
    private EditText bookTitle;
    private RadioGroup group;
    private TextView bookSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bookSearch = findViewById(R.id.bookSearch);
        bookAutor = findViewById(R.id.bookAuthor);
        bookTitle = findViewById(R.id.bookTitle);
        group = findViewById(R.id.radioGroup);
    }

    public void searchBooks (View view){

    }
}