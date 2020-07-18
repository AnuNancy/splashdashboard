package com.a.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView bgapp;
    TextView text;
    Animation bganim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text =  findViewById(R.id.test);
        bgapp = findViewById(R.id.img);
        bganim= AnimationUtils.loadAnimation(this, R.anim.bganim);
        bgapp.animate().translationY(-700).setDuration(800).setStartDelay(300);


    }
}