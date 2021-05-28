package com.firstapp.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class multiplayer extends AppCompatActivity {
    private Button friendsPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        friendsPage = (Button) findViewById(R.id.addFriend);
        friendsPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(multiplayer.this, AddFriends.class);
                startActivity(intent);
            }
        });
    }
}