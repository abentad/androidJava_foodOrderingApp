package com.rentoch.foodorderingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class cartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_screen);

        //
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        //set home selected
        bottomNavigationView.setSelectedItemId(R.id.btnav_cart);
        //add itemSelected listener
        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.btnav_home:
                        Intent i = new Intent(getApplicationContext(),HomeScreenActivity.class);
                        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(i);
                        finish();
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.btnav_cart:
                        return true;
                    case R.id.btnav_setting:
                        Intent in = new Intent(getApplicationContext(),settingScreen.class);
                        in.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(in);
                        finish();
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.btnav_about:
                        Intent intent = new Intent(getApplicationContext(),aboutScreen.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                        finish();
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}