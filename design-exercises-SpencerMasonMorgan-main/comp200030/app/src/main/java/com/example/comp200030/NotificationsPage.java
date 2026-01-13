package com.example.comp200030;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class NotificationsPage extends AppCompatActivity {

    Button GoHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_page); // Home layout


        //button back to login screen
        GoHome = findViewById(R.id.imageButton);

        GoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to MenuPage
                Intent intent = new Intent(NotificationsPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
