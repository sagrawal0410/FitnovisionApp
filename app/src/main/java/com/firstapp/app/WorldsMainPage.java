package com.firstapp.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class WorldsMainPage extends AppCompatActivity {
    private ImageButton World1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worlds_main_page);
        RelativeLayout relativeLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) relativeLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();
        World1  = (ImageButton) findViewById(R.id.world1);
        World1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWorldOneActivity();
            }
        } );
    }
    public void openWorldOneActivity() {
        Intent intent = new Intent(WorldsMainPage.this, world1.class);
        startActivity(intent);


    }
}