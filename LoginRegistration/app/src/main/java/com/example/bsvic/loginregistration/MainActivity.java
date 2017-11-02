package com.example.bsvic.loginregistration;

import android.content.Intent;
import android.provider.ContactsContract;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText name;
    EditText email;
    EditText password;

    RadioGroup rg;
    RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.button);
        name = (EditText) findViewById(R.id.editText);
        email = (EditText) findViewById(R.id.editText2);
        password =  (EditText) findViewById(R.id.editText3);
        rg = (RadioGroup) findViewById(R.id.rgGroup);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Clicked",Toast.LENGTH_SHORT).show();
                String s_name = name.getText().toString();
                String s_email = email.getText().toString();
                System.out.println("Email : " + s_email);
                String s_pass = password.getText().toString();
                rb =(RadioButton) findViewById(rg.getCheckedRadioButtonId());
                String rdio = rb.getText().toString();

                Intent intent = new Intent(MainActivity.this,Second.class);
                intent.putExtra("name",s_name);
                intent.putExtra("email",s_email);
                intent.putExtra("pass",s_pass);
                String mr_ms;
                if(rdio.equals("Male"))
                    mr_ms = "Mr";
                else
                    mr_ms = "Ms";
                intent.putExtra("Salute",mr_ms);
                startActivity(intent);
            }
        });
    }
}
