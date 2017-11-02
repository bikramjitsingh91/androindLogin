package com.example.bsvic.loginregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    TextView Sal, s_name, s_email, s_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        String pass = intent.getStringExtra("pass");
        String mr_ms = intent.getStringExtra("Salute");

        Sal = (TextView) findViewById(R.id.textView6);
        s_name = (TextView) findViewById(R.id.textView2);
        s_email = (TextView) findViewById(R.id.textView8);
        s_pass = (TextView) findViewById(R.id.textView5);

        Sal.setText(mr_ms);
        s_name.setText(name);
        s_email.setText(email);
        s_pass.setText(pass);
    }
}
