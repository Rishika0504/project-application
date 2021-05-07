package com.example.sustainablewastemanagement;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.sql.Ref;
import java.util.HashMap;

public class FormActivity extends AppCompatActivity  {

    private Button submitdetails;
    private EditText fullname, phoneno, location, date, quantity;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference root = database.getReference().child("details");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        fullname = (EditText) findViewById(R.id.Name);
        phoneno = (EditText) findViewById(R.id.mobile);
        location = (EditText) findViewById(R.id.location);
        date = (EditText) findViewById(R.id.date);
        quantity = (EditText) findViewById(R.id.quantity);

        submitdetails = (Button) findViewById(R.id.submit);


        String Name = fullname.getText().toString();
        String mobileno = phoneno.getText().toString();
        String address = location.getText().toString();
        String dateofpickup = date.getText().toString();
        String quantityofstubble = quantity.getText().toString();

        submitdetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.submit:
                        startActivity(new Intent(FormActivity.this,ThirdActivity.class));
                        break;
                }
                String Name = fullname.getText().toString();
                String mobileno = phoneno.getText().toString();
                String address = location.getText().toString();
                String dateofpickup = date.getText().toString();
                String quantityofstubble = quantity.getText().toString();

                HashMap<String , String>userMap=new HashMap<>();

                userMap.put("name",Name);
                userMap.put("mobileno",mobileno);
                userMap.put("address",address);
                userMap.put("Dateo f pickup",dateofpickup);
                userMap.put("Quantity of stubble",quantityofstubble);

                root.push().setValue(userMap);

            }
        });
    }
}

