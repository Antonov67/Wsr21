package com.example.wsr21;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Banks_adapter extends ArrayAdapter<Banks> {

    public Banks_adapter(Context context, ArrayList<Banks> arr) {
        super(context, R.layout.banks_layout,arr);
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        final Banks banks = getItem(position);
        if (convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.banks_layout,null);
        }
        //заполняем адаптер
        ((TextView) convertView.findViewById(R.id.textView4)).setText(banks.address);
        ((TextView) convertView.findViewById(R.id.textView7)).setText(banks.type);
        ((TextView) convertView.findViewById(R.id.textView6)).setText(banks.time);
        if (banks.work_or_not)
            ((TextView) convertView.findViewById(R.id.textView5)).setText("Работает");
        else
            ((TextView) convertView.findViewById(R.id.textView5)).setText("Не работает");
        return convertView;
    }
}
