package com.snifyak.inviteon;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Splash_screen extends AppCompatActivity {

    MediaPlayer oursound;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        oursound =MediaPlayer.create(this,R.raw.splashclip);
        oursound.start();
        oursound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Splash_screen.this.oursound.stop();
                Splash_screen.this.startActivity(new Intent(Splash_screen.this,MainActivity.class));
                Splash_screen.this.finish();
            }
        });

//        startActivity(new Intent(this,MainActivity.class));
//        finish();

    }
    public void onDestroy(){
        this.oursound.stop();
        super.onDestroy();
    }
}
