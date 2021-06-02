package com.flixberry.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.feedbackBtn);
        btn.setOnClickListener(v->{
            Intent intent = new Intent(this.getApplicationContext(),FeedBack.class);
            startActivity(intent);
        });
    }
}