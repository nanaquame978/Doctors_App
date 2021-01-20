package com.example.doctors_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Toast;


public class SignUp extends AppCompatActivity {

    private EditText email;
    private EditText userpass;
    private EditText confirmpass;
    private EditText username;
    private EditText telenumber;
    private Button Signupbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up); }

    email = findViewById(R.id.Email);
    userpass= findViewById(R.id.user_pass);
    Signupbtn=findViewById(R.id.signup_btn);


}