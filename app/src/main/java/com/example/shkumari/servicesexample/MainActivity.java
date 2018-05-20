package com.example.shkumari.servicesexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mButtonStart;
    private Button mButtonStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonStart = (Button) findViewById(R.id.button1);
        mButtonStop = (Button) findViewById(R.id.button2);

        mButtonStart.setOnClickListener(this);
        mButtonStop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mButtonStart){
            Toast.makeText(this, "Services is starting...", Toast.LENGTH_LONG).show();
            Intent btn1 = new Intent(this, Myservices.class);
            startService(btn1);

        }else if(v == mButtonStop){
            Toast.makeText(this, "Services is stopped...", Toast.LENGTH_LONG).show();
            Intent  btn2 = new Intent(this, Myservices.class);
            stopService(btn2);
        }

    }
}
