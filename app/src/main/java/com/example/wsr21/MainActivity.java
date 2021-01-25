package com.example.wsr21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView date = (TextView)findViewById(R.id.textDate);
        SimpleDateFormat format = new SimpleDateFormat("dd.mm.yyyy");
        date.setText(format.format(new Date()));
        Button buttonBanki = (Button)findViewById(R.id.button);
        buttonBanki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"банки",Toast.LENGTH_LONG).show();
            }
        });

        LinearLayout buttonMix = (LinearLayout)findViewById(R.id.buttonMix);
        buttonMix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"курсы валют",Toast.LENGTH_LONG).show();
            }
        });
    }
}