package com.example.wsr21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class Banks_activity extends AppCompatActivity {

    ArrayList<Banks> makeBanks(){
        ArrayList<Banks> arr = new ArrayList<>();
        arr.add(new Banks("Смоленск","отделение","00:00-00:00", true));
        arr.add(new Banks("Москва","отделение","09:00-00:00", false));
        arr.add(new Banks("Калуга","банкомат","00:00-00:00", true));
        return arr;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banks_activity);
        Banks_adapter banks_adapter = new Banks_adapter(this, makeBanks());
        ListView lv = (ListView)findViewById(R.id.banks);
        lv.setAdapter(banks_adapter);
    }
}