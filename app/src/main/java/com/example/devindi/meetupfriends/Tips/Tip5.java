package com.example.devindi.meetupfriends.Tips;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.devindi.meetupfriends.R;

public class Tip5 extends Activity {
    Button b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip5);
        b5= (Button) findViewById(R.id.button5);

        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.devindi.meetupfriends.contactPage.ContactPage1"));
            }
        });
    }


}
