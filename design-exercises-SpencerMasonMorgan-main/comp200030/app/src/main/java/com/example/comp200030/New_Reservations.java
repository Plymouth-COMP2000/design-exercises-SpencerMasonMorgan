package com.example.comp200030;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class New_Reservations extends AppCompatActivity {
    CalendarView calendarView;
    EditText timeEditText, peopleEditText;
    Button submitButton;

    boolean dateSelected = false;
    ImageButton logoutbutton;

    private final TextWatcher simpleWatcher = new TextWatcher() {
        @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
        @Override public void onTextChanged(CharSequence s, int start, int before, int count) {
            checkFormValid();
        }
        @Override public void afterTextChanged(Editable s) {}
    };

    private void checkFormValid() {
        String time = timeEditText.getText().toString().trim();
        String people = peopleEditText.getText().toString().trim();

        boolean isValid =
                dateSelected &&
                        !time.isEmpty() &&
                        !people.isEmpty();

        submitButton.setEnabled(isValid);
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_reservations);


        //button back to reservations screen
        logoutbutton = findViewById(R.id.gotoreservations);

        logoutbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to reservations page
                Intent intent = new Intent(New_Reservations.this, Reservation_page.class);
                startActivity(intent);
            }
        });
        calendarView = findViewById(R.id.calendarView);
        timeEditText = findViewById(R.id.time);
        peopleEditText = findViewById(R.id.numberofpeople);
        submitButton = findViewById(R.id.submit);

        // Date selected
        calendarView.setOnDateChangeListener((view, year, month, dayOfMonth) -> {
            dateSelected = true;
            checkFormValid();
        });

        // Text change listeners
        timeEditText.addTextChangedListener(simpleWatcher);
        peopleEditText.addTextChangedListener(simpleWatcher);

        submitButton.setOnClickListener(v -> {
            Toast.makeText(this, "Reservation submitted", Toast.LENGTH_SHORT).show();
            // Proceed with submission logic
        });

    }
}
