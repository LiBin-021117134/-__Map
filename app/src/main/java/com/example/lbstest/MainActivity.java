package com.example.lbstest;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.MapView;

public class MainActivity extends AppCompatActivity {
    private MapView mMapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            SDKInitializer.initialize(getApplicationContext());
        } catch (Exception e) {
            Log.e("Error", e.getMessage());
        }
        setContentView(R.layout.activity_main);
        mMapView = findViewById(R.id.bmapView);
    }

}