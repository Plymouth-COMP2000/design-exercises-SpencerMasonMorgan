package com.example.comp200030;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class StaffHome extends AppCompatActivity {

    ImageButton logoutbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.staff_home_page); // Home layout


        //button back to login screen
        logoutbutton = findViewById(R.id.logoutbutton1);

        logoutbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to MenuPage
                Intent intent = new Intent(StaffHome.this, login_type.class);
                startActivity(intent);
            }
        });
    }
}
