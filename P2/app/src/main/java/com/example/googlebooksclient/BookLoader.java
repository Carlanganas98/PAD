package com.example.googlebooksclient;

import android.content.Context;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

public class BookLoader extends AsyncTaskLoader<String> {

    private String queryString;
    private String printType;

    public BookLoader(@NonNull Context context,String qs, String pt) {
        super(context);
        queryString = qs;
        printType = pt;
    }

    @Nullable
    @Override
    public String loadInBackground() {
        return NetworkClass.getBookInfo(queryString, printType);
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }
}
