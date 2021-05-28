package com.firstapp.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class world1 extends AppCompatActivity {

    private ImageButton captureVideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world1);
        captureVideo  = (ImageButton) findViewById(R.id.captVideo);
        captureVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWorldOneActivity();
            }
        } );
    }
    public void openWorldOneActivity() {
        Intent intent = new Intent(world1.this, CaptureVideo.class);
        startActivity(intent);
    }
}