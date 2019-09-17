package com.example.navigator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {
    private static final String locSend = "location";


    String location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);




        Intent intent = getIntent();
        location = intent.getStringExtra(locSend).toString();

//        Bundle bundle = new Bundle();
//        bundle.putString("location", received);
//        WeatherFragment fragobj = new WeatherFragment();
//        fragobj.setArguments(bundle);

    }
    public String getMyData() {
        return location;
    }

    /*
      Bundle bundle = new Bundle();
        bundle.putString("location", location);
        WeatherFragment fragobj = new WeatherFragment();
        fragobj.setArguments(bundle);

     */


    //String hello = getIntent().getIntExtra(location, 0);
}
