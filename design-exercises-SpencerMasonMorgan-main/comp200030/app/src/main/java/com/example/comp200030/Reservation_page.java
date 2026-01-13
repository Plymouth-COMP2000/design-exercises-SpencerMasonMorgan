package com.example.comp200030;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Reservation_page extends AppCompatActivity {

    ImageButton returnbutton;
    Button gotobooking;
    Button bookings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reservations_page);


        //button back to menu screen
        returnbutton = findViewById(R.id.returntohome);

        returnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to MenuPage
                Intent intent = new Intent(Reservation_page.this, MainActivity.class);
                startActivity(intent);
            }
        });

        gotobooking = findViewById(R.id.new_reservation);

        gotobooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to MenuPage
                Intent intent = new Intent(Reservation_page.this, New_Reservations.class);
                startActivity(intent);
            }
        });
        bookings = findViewById(R.id.reservations);

        bookings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to MenuPage
                Intent intent = new Intent(Reservation_page.this, View_reservations.class);
                startActivity(intent);
            }
        });
    }
}
