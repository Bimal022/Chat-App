package com.example.chatapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.chatapp.login;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Start LoginActivity

        Intent intent = new Intent(this, login.class);
        startActivity(intent);

        // Finish MainActivity if you don't want to go back to it when pressing back
        finish();
    }
}
