package com.snifyak.inviteon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.allyants.notifyme.NotifyMe;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog;

import java.util.Calendar;

public class Scheduler2 extends AppCompatActivity implements DatePickerDialog.OnDateSetListener , TimePickerDialog.OnTimeSetListener {
    //    Instance Fields
    Calendar now  = Calendar.getInstance();
    TimePickerDialog tpd;
    DatePickerDialog dpd;
    EditText etTitle,etContent;

    //    When activity is created.......
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheduler1);
        Button btnNotify = findViewById(R.id.btnNotify);
        etTitle= findViewById(R.id.etTitle);
        etContent= findViewById(R.id.etContent);
        Button btnCancel = findViewById(R.id.btnCancel);

//        get current date and set it to DatePickerDialog
        dpd = DatePickerDialog.newInstance(
                Scheduler2.this,
                now.get(Calendar.YEAR),
                now.get(Calendar.MONTH),
                now.get(Calendar.DAY_OF_MONTH)
        );


//        initialize timepickerdailog with current time
        tpd = TimePickerDialog.newInstance(
                Scheduler2.this,
                now.get(Calendar.HOUR_OF_DAY),
                now.get(Calendar.MINUTE),
                now.get(Calendar.SECOND),
                false
        );

//        cancel Notification.........
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotifyMe.cancel(getApplicationContext(),"test");
            }
        });

//        show Notification........
        btnNotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dpd.show(getSupportFragmentManager(),"Datepickerdialog");
            }
        });
    }


    @Override
    public void onTimeSet(TimePickerDialog view, int hourofday,int minute,int second){
        now.set(Calendar.HOUR_OF_DAY,hourofday);
        now.set(Calendar.MINUTE,minute);
        now.set(Calendar.SECOND,second);
//    Initialize notification....
        NotifyMe notifyMe = new NotifyMe.Builder(getApplicationContext())
                .title(etTitle.getText().toString())
                .content(etContent.getText().toString())
                .led_color(255,255,255,100)
                .time(now)
                .addAction(new Intent(),"Snooze",false)
                .key("test")
                .addAction(new Intent(),"Dismiss",true,false)
                .addAction(new Intent(),"Done")
                .large_icon(R.mipmap.ic_launcher_round)
                .build();
    }
    //    Set custom date to datepickdialog
    @Override
    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
        now.set(Calendar.YEAR,year);
        now.set(Calendar.MONTH,monthOfYear);
        now.set(Calendar.DAY_OF_MONTH,dayOfMonth);
        tpd.show(getSupportFragmentManager(), "Timepickerdialog");
    }
}
