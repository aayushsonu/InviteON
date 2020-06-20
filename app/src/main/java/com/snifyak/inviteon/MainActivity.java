package com.snifyak.inviteon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Event(View view) {
        Intent intent = new Intent(this, Event.class);

        startActivity(intent);

    }

    public void Contact(View view) {
        Intent intent = new Intent(this, Contact.class);

        startActivity(intent);

    }
}
