package com.example.pra5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LoginShow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_show);
        Intent intent = getIntent();
        String message = intent.getStringExtra("ms");
// Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.LoginShow);
        textView.setText(message);
    }
}
