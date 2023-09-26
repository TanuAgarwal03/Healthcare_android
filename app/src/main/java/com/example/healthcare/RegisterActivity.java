package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText edUsername, edEmail, edPassword, edConfirmPwd;
    Button buttonRegister;
    TextView textViewRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edUsername = findViewById(R.id.register_username);
        edEmail = findViewById(R.id.register_email);
        edPassword = findViewById(R.id.register_password);
        edConfirmPwd = findViewById(R.id.register_confirm_pwd);
        buttonRegister = findViewById(R.id.register_button);
        textViewRegister = findViewById(R.id.textview_existing_user);

        textViewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edUsername.getText().toString();
                String email = edEmail.getText().toString();
                String password = edPassword.getText().toString();
                String confirmPwd = edConfirmPwd.getText().toString();
                Database db = new Database(getApplicationContext() , "healthcare" , null , 1);
                if (username.length() == 0 || email.length() == 0 || password.length() == 0 || confirmPwd.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Kindly fill the entries", Toast.LENGTH_LONG).show();
                } else {
                    if (password.compareTo(confirmPwd) == 0) {

                        if(isValid(password)){
                            db.register(username , email , password);
                            Toast.makeText(getApplicationContext() , "Record Inserted" , Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(RegisterActivity.this , LoginActivity.class));
                        }else{
                            Toast.makeText(getApplicationContext(), "Password must contain at least 8 characters (includes letters , digits and special symbols)", Toast.LENGTH_SHORT).show();

                        }

                    } else {
                        Toast.makeText(getApplicationContext(), "Password and confirm password didn't match", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    }

    public static boolean isValid(String passwordhere) {
        int f1 = 0, f2 = 0, f3 = 0;
        if (passwordhere.length() < 8) {
            return false;
        } else {
            for (int p = 0; p < passwordhere.length(); p++) {
                if (Character.isLetter(passwordhere.charAt(p))) {
                    f1 = 1;
                }
            }
            for (int r = 0; r < passwordhere.length(); r++) {
                if (Character.isDigit(passwordhere.charAt(r))) {
                    f2 = 1;
                }
            }
            for (int s = 0; s < passwordhere.length(); s++) {
                char c = passwordhere.charAt(s);
                if (c >= 33 && c <= 46 || c == 64) {
                    f3 = 1;
                }
            }
            if (f1 == 1 && f2 == 1 && f3 == 1)
                return true;
            return false;
        }
    }
}