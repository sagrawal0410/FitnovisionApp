package com.firstapp.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class singleplayer extends AppCompatActivity {
    private Button worldMainPage;
    private Button Progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        worldMainPage = (Button) findViewById(R.id.play);
        worldMainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(singleplayer.this, WorldsMainPage.class);
                startActivity(intent);
            }
        });
        Progress = (Button) findViewById(R.id.progress);
        Progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(singleplayer.this, ProgressActivity.class);
                startActivity(intent);
            }
        });
    }
}