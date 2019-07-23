package com.example.pra5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;

public class Login extends AppCompatActivity {
public EditText e1,e2;
public Button b1;
public String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void loginc(View v){
        e1=(EditText)findViewById(R.id.FN);
        e2=(EditText)findViewById(R.id.LN);
        s1=e1.getText().toString();
        s2=e2.getText().toString();
        if(s1.equals("admin")&&s2.equals("password")){
            Intent i=new Intent(this,LoginShow.class);
            i.putExtra("ms", s1);
            startActivity(i);
        }
        else{
            Toast.makeText(this,"Invalid Login User", Toast.LENGTH_LONG).show();
        }
    }
}
