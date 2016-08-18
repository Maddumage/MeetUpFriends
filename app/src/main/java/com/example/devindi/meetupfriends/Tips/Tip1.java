package com.example.devindi.meetupfriends.Tips;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import com.example.devindi.meetupfriends.FirstPage.SignupActivity;
import com.example.devindi.meetupfriends.R;

import java.util.Calendar;

public class Tip1 extends Activity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip1);

        b1= (Button) findViewById(R.id.button1);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.devindi.meetupfriends.Tips.Tip2"));
            }
        });

    }
}
