package com.example.ugadai_chislo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvInfo = findViewById(R.id.textView);
    EditText etInput = findViewById(R.id.editTextNumber);
    Button bControl = findViewById(R.id.button);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Integer.parseInt(etInput.getText().toString());
        tvInfo.setText(getResources().getString(R.string.ahead));
    }
    public void OnClick(View view) {
        int guess;
        guess = (int)(Math.random()*100);
        int inp=Integer.parseInt(etInput.getText().toString());
        if (inp > guess)
            tvInfo.setText("Перелет!");
        if (inp < guess)
            tvInfo.setText("Недолет!");
        if (inp == guess) {
            tvInfo.setText("В точку!");
            bControl.setText("Сыграть еще");
        }
        etInput.setText("");
    }
}