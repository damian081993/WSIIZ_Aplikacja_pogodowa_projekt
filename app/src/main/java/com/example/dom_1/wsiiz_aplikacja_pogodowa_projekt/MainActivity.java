package com.example.dom_1.wsiiz_aplikacja_pogodowa_projekt;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JedenLayout();
        DwaLayout();
        CzteryLayout();
    }

    private void JedenLayout() {
        ImageButton bjeden = findViewById(R.id.bjeden);
        bjeden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Aktywnosc_1.class));
            }
        });

    }

    private void DwaLayout() {
        ImageButton bdwa = findViewById(R.id.bdwa);
        bdwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Aktywnosc_2.class));
            }
        });

    }


    private void CzteryLayout() {
        ImageButton bcztery = findViewById(R.id.bcztery);
        bcztery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Aktywnosc_3.class));
            }
        });

    }

}
