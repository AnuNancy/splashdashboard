package com.a.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView bgapp;
   Animation bganim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         bgapp = (ImageView)findViewById(R.id.bgapp);
        bganim= AnimationUtils.loadAnimation(this, R.anim.bganim);

        try {

              bgapp.startAnimation(bganim);

        }
        catch (NullPointerException ignored){

        }
    }
}