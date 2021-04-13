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

    private EditText bookAutorEdit;
    private EditText bookTitleEdit;
    private RadioGroup group;
    private TextView bookSearch;
    private TextView bookAutorText;
    private TextView bookTitleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bookSearch = findViewById(R.id.bookSearch);
        bookAutorEdit = findViewById(R.id.bookAuthor);
        bookTitleEdit = findViewById(R.id.bookTitle);
        bookAutorText = findViewById(R.id.bookAuthorText);
        bookTitleText = findViewById(R.id.bookTitleText);
        group = findViewById(R.id.radioGroup);
    }

    public void searchBooks (View view){

    }
}