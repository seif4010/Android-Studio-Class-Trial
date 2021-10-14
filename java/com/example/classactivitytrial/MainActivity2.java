package com.example.classactivitytrial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView);

        //receive
        Intent intent  = getIntent();

        String str = intent.getStringExtra("key1");
        Integer age = intent.getIntExtra("key2", 0);
        Double weight = intent.getDoubleExtra("key3", 0);

        textView.setText(str);

    }
}