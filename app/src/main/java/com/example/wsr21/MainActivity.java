package com.example.wsr21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
    }
}