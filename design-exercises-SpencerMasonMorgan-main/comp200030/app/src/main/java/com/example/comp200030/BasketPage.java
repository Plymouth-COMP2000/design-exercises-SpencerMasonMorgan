package com.example.comp200030;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class BasketPage extends AppCompatActivity {

    ImageButton returnguesthome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basket_page); // Home layout


        //button back to login screen
        returnguesthome = findViewById(R.id.GuestBack);

        returnguesthome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to MenuPage
                Intent intent = new Intent(BasketPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
        //here i would use the database to show what is in the basket along with the accumulative price
        //i would then develop the payment button a bit more

    }
}