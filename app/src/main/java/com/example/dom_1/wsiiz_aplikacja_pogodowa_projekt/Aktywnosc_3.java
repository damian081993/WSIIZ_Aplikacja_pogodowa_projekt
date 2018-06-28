package com.example.dom_1.wsiiz_aplikacja_pogodowa_projekt;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import com.example.dom_1.wsiiz_aplikacja_pogodowa_projekt.m_JSON.JSONDownloader;

public class Aktywnosc_3 extends AppCompatActivity {

    String jsonURL="http://jsonplaceholder.typicode.com/users";
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktywnosc_3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


        lv = (ListView) findViewById(R.id.lv);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new JSONDownloader(Aktywnosc_3.this,jsonURL, lv).execute();

            }
        });
    }
}
