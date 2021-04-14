package com.example.googlebooksclient;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

//Comprobar que se puede hacer extends AppCompatActivity
public class BookLoaderCallbacks implements LoaderManager.LoaderCallbacks<List<BookInfo>> {

    private EditText bookAutorEdit;
    private EditText bookTitleEdit;
    private RadioGroup group;
    private TextView bookSearch;
    private TextView bookAutorText;
    private TextView bookTitleText;
    private MainActivity mA;

    protected static final String EXTRA_QUERY = "q";
    protected static final String EXTRA_PRINT_TYPE = "printType";

    public BookLoaderCallbacks (MainActivity m){
        mA = m;
    }

    @NonNull
    @Override
    public Loader<List<BookInfo>> onCreateLoader(int id, @Nullable Bundle args) {
        return new BookLoader(mA,args.getString("queryString"),args.getString("printType"));
    }

    @Override
    public void onLoadFinished(@NonNull Loader<List<BookInfo>> loader, List<BookInfo> data) {
        try {
            JSONObject jsonObject = new JSONObject(data);
            JSONArray itemsArray = jsonObject.getJSONArray("items");

            int i = 0;
            String titulo = null;
            String autor = null;

            while (i < itemsArray.length() && (autor == null && titulo == null)) {

                JSONObject book = itemsArray.getJSONObject(i);
                JSONObject volumeInfo = book.getJSONObject("volumeInfo");

                try {
                    titulo = volumeInfo.getString("title");
                    autor = volumeInfo.getString("authors");
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                i++;
            }

            if (titulo != null && autor != null) {
                bookTitleText.setText(titulo);
                bookAutorText.setText(autor);
            } else {

                bookTitleText.setText("No se han encontrado resultados");
                bookAutorText.setText("");
            }

        } catch (Exception e) {

            bookTitleText.setText("No se han encontrado resultados");
            bookAutorText.setText("");
            e.printStackTrace();
        }
    }

    @Override
    public void onLoaderReset(@NonNull Loader<List<BookInfo>> loader) {

    }
}
