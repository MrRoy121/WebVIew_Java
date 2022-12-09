package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        final Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(() -> {
            finish();
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }, 3000);

    }
}