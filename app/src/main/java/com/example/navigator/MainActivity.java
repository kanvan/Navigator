package com.example.navigator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private static final String locSend = "location";
    String location;
    EditText locationInput;
    Button searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void randomMe (View v) {

        // Create an Intent to start the second activity


        locationInput = (EditText) findViewById(R.id.locationInput);
        location = locationInput.getText().toString();
        // Add the count to the extras for the Intent
        Intent randomIntent = new Intent(this, SecondActivity.class);
        randomIntent.putExtra(locSend, (String) location);

        // Start the new activity.
        startActivity(randomIntent);




    }}
