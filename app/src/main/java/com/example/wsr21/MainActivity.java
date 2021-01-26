package com.example.wsr21;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
        final Context context = this;
        TextView date = (TextView)findViewById(R.id.textDate);
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
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

        //создаем всплывающее окно авторизации
        //кнопка авторизации
        Button butt_auth = (Button)findViewById(R.id.button5);
        butt_auth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //берем разметку для окна авторизации
                LayoutInflater li = LayoutInflater.from(context);
                View promptsView = li.inflate(R.layout.auth_wind, null);
                //Создаем AlertDialog
                AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context);
                //Настраиваем prompt.xml для нашего AlertDialog:
                mDialogBuilder.setView(promptsView);
                //Настраиваем отображение поля для ввода текста в открытом диалоге:
                final EditText userInputLogin = (EditText) promptsView.findViewById(R.id.login_txt);
                final EditText userInputPassword = (EditText) promptsView.findViewById(R.id.password_txt);
            }
        });
    }
}