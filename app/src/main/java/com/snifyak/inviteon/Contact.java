package com.snifyak.inviteon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Contact extends AppCompatActivity {
    TextView etNumber,etNumber2,etNumber3,etNumber4,etNumber5,etNumber6,etNumber7,etNumber8;
    ImageButton btCall,btCall2,btCall3,btCall4,btCall5,btCall6,btCall7,btCall8;
    private static final int REQUEST_CALL = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        etNumber = findViewById(R.id.number1);
        etNumber2 = findViewById(R.id.number2);
        etNumber3 = findViewById(R.id.number3);
        etNumber4 = findViewById(R.id.number4);
        etNumber5 = findViewById(R.id.number5);
        etNumber6 = findViewById(R.id.number6);
        etNumber7 = findViewById(R.id.number7);
        etNumber8 = findViewById(R.id.number8);


        btCall = findViewById(R.id.ik1);
        btCall2 = findViewById(R.id.ik2);
        btCall3 = findViewById(R.id.ik3);
        btCall4 = findViewById(R.id.ik4);
        btCall5 = findViewById(R.id.ik5);
        btCall6 = findViewById(R.id.ik6);
        btCall7 = findViewById(R.id.ik7);
        btCall8 = findViewById(R.id.ik8);


        btCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton();
            }
        });
        btCall2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton2();
            }
        });
        btCall3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton3();
            }
        });
        btCall4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton4();
            }
        });
        btCall5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton5();
            }
        });
        btCall6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton6();
            }
        });
        btCall7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton7();
            }
        });
        btCall8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton8();
            }
        });

    }


    private void CallButton() {
        String number = etNumber.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(Contact.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Contact.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

        }
    }

    private void CallButton2() {
        String number = etNumber2.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(Contact.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Contact.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

        }
    }

    private void CallButton3() {
        String number = etNumber3.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(Contact.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Contact.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

        }
    }

    private void CallButton4() {
        String number = etNumber4.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(Contact.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Contact.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

        }
    }

    private void CallButton5() {
        String number = etNumber5.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(Contact.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Contact.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

        }
    }

    private void CallButton6() {
        String number = etNumber6.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(Contact.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Contact.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

        }
    }

    private void CallButton7() {
        String number = etNumber7.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(Contact.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Contact.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

        }
    }

    private void CallButton8() {
        String number = etNumber8.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(Contact.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(Contact.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                CallButton();
                CallButton2();
                CallButton3();
                CallButton4();
                CallButton5();
                CallButton6();
                CallButton7();
                CallButton8();
            } else {
                Toast.makeText(this, "Permission DENIED", Toast.LENGTH_SHORT).show();
            }
        }
    }
}