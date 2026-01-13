package com.example.comp200030;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button buttonGoMenu;
    ImageButton logout_button;
    ImageButton settings_button;
    ImageButton basketbutton;
    Button resbutton;
    Button notibutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.guest_home_page); // Home layout

        // button for menu
        buttonGoMenu = findViewById(R.id.buttonGoMenu);

        buttonGoMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to MenuPage
                Intent intent = new Intent(MainActivity.this, MenuPage.class);
                startActivity(intent);
            }
        });
        //button back to login screen
        logout_button = findViewById(R.id.logoutbutton);

        logout_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to MenuPage
                Intent intent = new Intent(MainActivity.this, login_type.class);
                startActivity(intent);
            }
        });
        //button to the notification on/off page
        settings_button = findViewById(R.id.NotiSettings);

        settings_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to MenuPage
                Intent intent = new Intent(MainActivity.this, login_type.class);
                startActivity(intent);
            }
        });
        //button to the notifications page
        notibutton = findViewById(R.id.notifications);

        notibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to MenuPage
                Intent intent = new Intent(MainActivity.this, NotificationsPage.class);
                startActivity(intent);
            }
        });
        //button to the reservations page
        resbutton = findViewById(R.id.reservations);

        resbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to MenuPage
                Intent intent = new Intent(MainActivity.this, Reservation_page.class);
                startActivity(intent);
            }
        });
        //button to the basket
        basketbutton = findViewById(R.id.imageButton6);

        basketbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to MenuPage
                Intent intent = new Intent(MainActivity.this, BasketPage.class);
                startActivity(intent);
            }
        });

    }
}