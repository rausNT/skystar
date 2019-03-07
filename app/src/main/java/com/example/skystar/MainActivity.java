package com.example.skystar;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sofakingforever.stars.AnimatedStarsView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnimatedStarsView stars = findViewById(R.id.stars);
     //   stars.onStart();


        AnimatedStarsView stars_white = findViewById(R.id.stars_white);
        stars_white.onStart();

    }
}
