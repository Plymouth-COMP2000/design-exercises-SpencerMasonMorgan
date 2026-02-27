package com.example.comp200030;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class login_type extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        RadioGroup loginTypeGroup = findViewById(R.id.loginTypeGroup);
        LinearLayout staffContainer = findViewById(R.id.staffContainer);
        LinearLayout userContainer = findViewById(R.id.userContainer);

        // Optional: set a default state
        staffContainer.setVisibility(View.GONE);
        userContainer.setVisibility(View.GONE);

        loginTypeGroup.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.staff) {
                staffContainer.setVisibility(View.VISIBLE);
                userContainer.setVisibility(View.GONE);
            } else if (checkedId == R.id.guest) {
                staffContainer.setVisibility(View.GONE);
                userContainer.setVisibility(View.VISIBLE);
            }
        });
        EditText staffId = findViewById(R.id.staff_id);
        EditText staffPassword = findViewById(R.id.password);
        Button staffEnter = findViewById(R.id.button1);

        EditText email = findViewById(R.id.email);
        EditText userPassword = findViewById(R.id.password1);
        Button userEnter = findViewById(R.id.button);

        // Staff Entry validation
        staffEnter.setOnClickListener(v -> {
            String staffIdText = staffId.getText().toString().trim();
            String passText = staffPassword.getText().toString().trim();

            if (staffIdText.isEmpty()) {
                staffId.setError("Staff ID is required");
                staffId.requestFocus();
                return;
            }
            if (passText.isEmpty()) {
                staffPassword.setError("Password is required");
                staffPassword.requestFocus();
                return;
            }

            // ✅ All staff fields filled - continue
            Toast.makeText(this, "Staff login OK", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(login_type.this, StaffHome.class);
            startActivity(intent);
        });

        // User Entry validation
        userEnter.setOnClickListener(v -> {
            String emailText = email.getText().toString().trim();
            String passText = userPassword.getText().toString().trim();

            if (emailText.isEmpty()) {
                email.setError("Email is required");
                email.requestFocus();
                return;
            }
            if (!Patterns.EMAIL_ADDRESS.matcher(emailText).matches()) {
                email.setError("Enter a valid email");
                email.requestFocus();
                return;
            }
            if (passText.isEmpty()) {
                userPassword.setError("Password is required");
                userPassword.requestFocus();
                return;
            }

            // All user fields filled - continue
            Toast.makeText(this, "User login OK", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(login_type.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
