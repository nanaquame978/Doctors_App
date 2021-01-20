package com.example.doctors_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText email;
    private EditText userpass;
    private Button Signupbtn;
    private Button Loginbtn;
    private EditText alreadyaccount;
    private final String CREDENTIAL_SHARED_PREF = "our_shared_pref";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        email = findViewById(R.id.Email);
        userpass= findViewById(R.id.user_pass);
        Signupbtn=findViewById(R.id.signup_btn);
        Loginbtn= findViewById(R.id.login_btn);

        Signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(  MainActivity.this,SignUp.class);
                startActivity(intent);

            }
        });

            Loginbtn.setOnClickListener(new View.OnClickListener()  {
                @Override
                    public void onClick(View View) {

                }
                    SharedPreferences credentials = getSharedPreferences(CREDENTIAL_SHARED_PREF, Context.MODE_PRIVATE);
                    String strEmail = credentials.getString((s: "Email", s1: null);
                    String strPassword = credentials.getString(s:"password", null);

                    String Email_from_ed = email.getText().toString();
                    String password_from_ed = userpass.getText().toString();

                    if(strEmail != null && Email_from_ed != null strEmail.equalsIgnoreCase(Email_from_ed))

                {
                    if (strPassword != null && password_from_ed != null && strPassword.equalsIgnoreCase(password_from_ed)) {
                        Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                    }
                } else
                    {
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                     }
                   }
                }
            }};
        }0



