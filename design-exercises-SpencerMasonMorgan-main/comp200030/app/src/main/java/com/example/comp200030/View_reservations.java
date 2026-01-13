package com.example.comp200030;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class View_reservations extends AppCompatActivity {

    ImageButton returnbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.existing_reservations);


        //button back to reservations screen
        returnbutton = findViewById(R.id.returntores);

        returnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(View_reservations.this, Reservation_page.class);
                startActivity(intent);
            }
        //in this section, i would have a section where you are able to manipulate the preexisting items in the database
        //i have set the layer up in the xml file which would then allow this.
        });

}}
