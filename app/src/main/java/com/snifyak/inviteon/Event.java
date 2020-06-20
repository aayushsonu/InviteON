package com.snifyak.inviteon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Event extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        ImageView map =  findViewById(R.id.map1);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:25.627963,85.056415"));
                startActivity(intent);
            }
        });
        ImageView map1 = findViewById(R.id.map2);
        map1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 25.615952,85.053588"));
                startActivity(intent);
            }
        });
        ImageView map2 = findViewById(R.id.map3);
        map2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 25.617412,85.049251"));
                startActivity(intent);
            }
        });

    }
    public void Goto1(View view) {
        Intent intent = new Intent(this,Scheduler1.class);

        startActivity(intent);
    }
    public void Goto2(View view) {
        Intent intent = new Intent(this,Scheduler2.class);

        startActivity(intent);
    }
    public void Goto3(View view) {
        Intent intent = new Intent(this,Scheduler3.class);

        startActivity(intent);
    }

}
