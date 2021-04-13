package com.example.googlebooksclient;

import android.content.Context;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

public class BookLoader extends AsyncTaskLoader<String> {

    private String queryString;

    public BookLoader(@NonNull Context context,String qs) {
        super(context);
        queryString = qs;
    }

    @Nullable
    @Override
    public String loadInBackground() {
        return NetworkClass.getBookInfo(queryString);
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }
}
