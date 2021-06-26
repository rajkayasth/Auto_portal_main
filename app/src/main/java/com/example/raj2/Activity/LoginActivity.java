package com.example.raj2.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.example.raj2.Fregments.HomeFregment;
import com.example.raj2.MainActivity;
import com.example.raj2.R;
import com.google.android.material.textfield.TextInputLayout;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    TextView tv_register,newaccount;
    private String PREF="1";

    TextInputLayout tl_email,tl_password;
    EditText email,password;
    Button btn_login,reg1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        reg1=findViewById(R.id.btnre);
        email = (EditText)findViewById(R.id.et_input_email);
        password = (EditText)findViewById(R.id.et_input_password);
        tl_email = (TextInputLayout)findViewById(R.id.input_email);
        tl_password = (TextInputLayout)findViewById(R.id.input_password);
        btn_login = findViewById(R.id.btnsubmit);

        newaccount = findViewById(R.id.newaccount);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent1);
            }
        });

        reg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        newaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(i);
            }
        });

           }
}
