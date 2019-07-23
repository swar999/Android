package com.example.pra4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void msg(View view) {
        t1=(TextView)findViewById(R.id.T1);
        t2=(TextView)findViewById(R.id.T2);
        String s1,s2,s3;
        s1=t1.getText().toString();
        s2=t2.getText().toString();
        s3=s1+s2;
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("mm",s3);
        startActivity(intent);
    }
}
