package com.example.devindi.meetupfriends.Tips;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.devindi.meetupfriends.R;

public class Tip3 extends Activity implements View.OnClickListener {
        Button b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip3);
        b3= (Button) findViewById(R.id.button3);

        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.devindi.meetupfriends.Tips.Tip4"));
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button3:
                startActivity(new Intent("com.example.devindi.meetupfriends.Tips.Tip4"));
                break;
            default:
                break;
        }

    }
}
