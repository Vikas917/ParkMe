package com.example.parkme.BookingSaveActivities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.parkme.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class SaveActivity extends AppCompatActivity {
    private EditText name;
    private EditText email;
    private EditText phone;
    private EditText plate;
    private EditText durationfrom;
    private EditText durationto;
    private EditText slotno;

    private Button save;
    private Button payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        name = findViewById(R.id.editTextName);
        email = findViewById(R.id.editTextEmail);
        phone = findViewById(R.id.editTextPhone);
        plate = findViewById(R.id.editTextPlateNo);
        durationfrom = findViewById(R.id.editTextDurationFrom);
        durationto = findViewById(R.id.editTextDurationTo);
        slotno = findViewById(R.id.editTextSlotNo);
        save = findViewById(R.id.buttonSave);
        payment = findViewById(R.id.buttonMakePayment);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Map<String, String> v = new HashMap<>();
                v.put("name", name.getText().toString());
                v.put("email", email.getText().toString());
                v.put("phone", phone.getText().toString());
                v.put("plate", plate.getText().toString());
                v.put("durationfrom", durationfrom.getText().toString());
                v.put("durationto", durationto.getText().toString());
                v.put("slotno", slotno.getText().toString());
                FirebaseFirestore.getInstance().collection("vendor").add(v).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
                    @Override
                    public void onComplete(@NonNull Task<DocumentReference> task) {
                        Toast.makeText(getApplicationContext(), "INSERTED", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}
