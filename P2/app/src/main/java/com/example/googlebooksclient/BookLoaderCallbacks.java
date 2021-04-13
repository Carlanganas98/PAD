package com.example.googlebooksclient;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;

//Comprobar que se puede hacer extends AppCompatActivity
public class BookLoaderCallbacks extends AppCompatActivity implements LoaderManager.LoaderCallbacks<String> {
    @NonNull
    @Override
    public Loader<String> onCreateLoader(int id, @Nullable Bundle args) {
        return new BookLoader(this,args.getString("queryString"));
    }

    @Override
    public void onLoadFinished(@NonNull Loader<String> loader, String data) {

    }

    @Override
    public void onLoaderReset(@NonNull Loader<String> loader) {

    }
}
