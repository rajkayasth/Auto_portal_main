package com.example.raj2.Activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.example.raj2.R;
import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Pattern;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^" +
                    //"(?=.*[0-9])" +         //at least 1 digit
                    //"(?=.*[a-z])" +         //at least 1 lower case letter
                    //"(?=.*[A-Z])" +         //at least 1 upper case letter
                    "(?=.*[a-zA-Z])" +      //any letter
                    "(?=.*[@#$%^&+=])" +    //at least 1 special character
                    "(?=\\S+$)" +           //no white spaces
                    ".{8,}" +               //at least 4 characters
                    "$");


    private static final String PREF = "1";

    Button reg;
    TextInputLayout tl_firstname,tl_lastname,tl_email,tl_password,tl_confirmpassword;
    EditText et_input_name,et_input_email,et_input_password,et_input_cpassword;
    TextView signtext;
    public static int flag = 0;
    // so ki ne bhavna bhar ave 6

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        reg = findViewById(R.id.reg);

        et_input_name = findViewById(R.id.et_input_name);
        et_input_email = findViewById(R.id.et_input_email);
        et_input_password = findViewById(R.id.et_input_password);
        et_input_cpassword = findViewById(R.id.et_input_con_password);
        signtext = findViewById(R.id.signtext);

        tl_firstname = (TextInputLayout) findViewById(R.id.input_name);
        tl_email = (TextInputLayout) findViewById(R.id.input_email);
        tl_password = (TextInputLayout) findViewById(R.id.input_password);
        tl_confirmpassword = (TextInputLayout) findViewById(R.id.reg_input_con_password);

        signtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });

        {
            et_input_name.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView view, int actionId, KeyEvent event) {
                    int result = actionId & EditorInfo.IME_MASK_ACTION;
                    if (result == EditorInfo.IME_ACTION_NEXT) {
                        ValidateCredentials(et_input_name);
                    }
                    return true;
                }
            });

            et_input_email.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView view, int actionId, KeyEvent event) {
                    int result = actionId & EditorInfo.IME_MASK_ACTION;
                    if (result == EditorInfo.IME_ACTION_NEXT) {
                        ValidateCredentials(et_input_email);
                    }
                    return true;
                }
            });
            et_input_password.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView view, int actionId, KeyEvent event) {
                    int result = actionId & EditorInfo.IME_MASK_ACTION;
                    if (result == EditorInfo.IME_ACTION_NEXT) {
                        ValidateCredentials(et_input_password);
                    }
                    return true;
                }
            });
            et_input_cpassword.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView view, int actionId, KeyEvent event) {
                    int result = actionId & EditorInfo.IME_MASK_ACTION;
                    if (result == EditorInfo.IME_ACTION_DONE) {
                        ValidateCredentials(et_input_cpassword);
                    }
                    return true;
                }
            });
        }
    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Do you want to Exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user pressed "yes", then he is allowed to exit from application
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user select "No", just cancel this dialog and continue with app
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    private void ValidateCredentials(View view) {

        switch (view.getId()){
            case R.id.et_input_name:
                if(et_input_name.getText().toString().equals(""))
                {
                    tl_firstname.setError("*Required");
                    et_input_name.requestFocus();
                }
                else
                {
                    tl_firstname.setErrorEnabled(false);
                    et_input_email.requestFocus();
                    flag++;
                }
                break;
            case R.id.et_input_email:
                if(et_input_email.getText().toString().equals(""))
                {
                    tl_email.setError("*Required");
                    et_input_email.requestFocus();
                }
                else
                {
                    tl_email.setErrorEnabled(false);
                    et_input_email.requestFocus();
                    flag++;
                }
                break;
            case R.id.et_input_password:
                String pass = et_input_password.getText().toString();
                if(pass.equals(""))
                {
                    tl_password.setError("*Required");
                    et_input_password.requestFocus();
                    // HideKeyboard();
                }
                else if (pass.length() < 8){
                    tl_password.setError("Minimum 8 Characters");
                    et_input_password.requestFocus();
                    //  HideKeyboard();
                }
                else
                {
                    tl_password.setErrorEnabled(false);
                    et_input_cpassword.requestFocus();
                    flag++;
                }
                break;
            case R.id.et_input_con_password:
                if(et_input_cpassword.getText().toString().equals(""))
                {
                    tl_confirmpassword.setError("*Required");
                    et_input_cpassword.requestFocus();
                    //HideKeyboard();
                }
                //We must check if password and confirm password match.
                else if(!et_input_password.getText().toString().
                        equals(et_input_cpassword.getText().toString())){
                    tl_confirmpassword.setError("Passwords Do Not Match");
                    et_input_cpassword.requestFocus();
                    // HideKeyboard();
                }
                else
                {
                    tl_confirmpassword.setErrorEnabled(false);
                    //Hide the soft keyboard when everything is fine as now user does not need
                    //to write anything !
                    // HideKeyboard();
                    flag++;
                }
                break;
        }
    }
}
