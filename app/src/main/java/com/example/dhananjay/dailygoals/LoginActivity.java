package com.example.dhananjay.dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    Button button_login;
    EditText etname, etpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etname = (EditText) findViewById(R.id.etname);
        etpass = (EditText) findViewById(R.id.etpass);
    }

    public void onLogin(View v)
    {
        String name=etname.getText().toString();
        String pass=etpass.getText().toString();

        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }

    public void onForgotPassword(View v) {

    }

    public void onSignUp(View v) {

    }

}
