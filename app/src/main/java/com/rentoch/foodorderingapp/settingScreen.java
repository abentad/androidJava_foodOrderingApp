package com.rentoch.foodorderingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class settingScreen extends AppCompatActivity {
    Button locationBtn, callBtn;
    String choice;
    Integer price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_screen);
        locationBtn = (Button) findViewById(R.id.locationButton);
        callBtn = (Button) findViewById(R.id.callButton);

        locationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo: 9.000910122066557, 38.78163301954083"));
                startActivity(intent);

            }
        });

        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("tel: 0912345678"));
                startActivity(intent);
            }
        });

        //
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        //set home selected
        bottomNavigationView.setSelectedItemId(R.id.btnav_setting);
        //add itemSelected listener
        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.btnav_home:
                        Intent in = new Intent(getApplicationContext(),HomeScreenActivity.class);
                        in.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(in);
                        finish();
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.btnav_cart:
//                        Intent i = new Intent(getApplicationContext(),cartScreen.class);
//                        Bundle bundle = new Bundle();
//                        bundle.putString("choices",choice);
//                        bundle.putInt("price",price);
//                        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                        startActivity(i);
//                        finish();
//                        overridePendingTransition(0,0);
                        return true;
                    case R.id.btnav_setting:
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