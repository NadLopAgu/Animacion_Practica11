package com.example.cecyt9.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;


public class Juego extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = (TextView) findViewById(R.id.textView);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animacion);
        texto.startAnimation(animacion);

    }




}
