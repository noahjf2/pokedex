package com.example.noah.pokemonindex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Credits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);
    }

    public void returnTitle(View view) {
        Intent i = new Intent(Credits.this, TitleScreen.class);
        startActivity(i);
    }
}
