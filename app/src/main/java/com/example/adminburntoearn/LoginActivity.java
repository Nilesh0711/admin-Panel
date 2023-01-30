package com.example.adminburntoearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button mButtonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mButtonLogin = findViewById(R.id.idBTNLogin);

        mButtonLogin.setOnClickListener(v -> {
            Toast.makeText(this, "I am clicked", Toast.LENGTH_SHORT).show();
        });

    }
}