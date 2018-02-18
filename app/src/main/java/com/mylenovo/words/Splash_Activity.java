package com.mylenovo.words;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);
        getSupportActionBar().hide();
        new Thread( new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep( 5000 );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent in = new Intent( Splash_Activity.this,MainActivity.class );
                startActivity( in );
            }
        } ).start();
    }
}
