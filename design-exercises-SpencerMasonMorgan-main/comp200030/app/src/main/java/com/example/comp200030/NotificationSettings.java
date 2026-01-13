package com.example.comp200030;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class NotificationSettings extends AppCompatActivity {

    ImageButton returntoguesthome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_settings); // Home layout


        //button back to login screen
        returntoguesthome = findViewById(R.id.reverse);

        returntoguesthome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to MenuPage
                Intent intent = new Intent(NotificationSettings.this, MainActivity.class);
                startActivity(intent);
            }
        });
        //from here there would be a section to stop notifications using if statements on the radiobutton
    }
}