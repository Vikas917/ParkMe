package com.example.parkme.BookingSaveActivities;


import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.parkme.R;

public class PaymentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payments);

        // Find the TextView by its ID
        TextView underDevelopmentText = findViewById(R.id.underDevelopmentText);

        // Set text size and color
        underDevelopmentText.setTextSize(20); // Set text size to 20sp
        underDevelopmentText.setTextColor(getResources().getColor(R.color.black)); // Set text color to black

        // You can also set other properties of the TextView programmatically if needed
        // For example, to set the text to "Under Development":
        // underDevelopmentText.setText("Under Development");
    }
}
