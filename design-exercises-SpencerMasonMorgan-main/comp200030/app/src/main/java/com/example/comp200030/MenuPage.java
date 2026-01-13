package com.example.comp200030;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MenuPage extends AppCompatActivity {

    Button GoHome;
    ImageButton Basket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_page); // Home layout


        //button back to login screen
        GoHome = findViewById(R.id.buttonBackHome);

        GoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to MenuPage
                Intent intent = new Intent(MenuPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Basket = findViewById(R.id.imageButton8);

        Basket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to MenuPage
                Intent intent = new Intent(MenuPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
        //with the pictures of the food as buttons, once pressed they can therefore be added to the basket
    }
}