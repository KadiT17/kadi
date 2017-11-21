package com.example.opilane.kadi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class pildidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pildid);
    }

    public void tagasi(View view) {
        Intent intent = new Intent(pildidActivity.this,MainActivity.class);
        startActivity(intent);
    }
}