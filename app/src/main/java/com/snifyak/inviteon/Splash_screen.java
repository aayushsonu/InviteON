package com.snifyak.inviteon;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class Splash_screen extends AppCompatActivity {
//    MediaPlayer ourSound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        ourSound = MediaPlayer.create(this,R.raw)

        startActivity(new Intent(this,MainActivity.class));

    }
}
