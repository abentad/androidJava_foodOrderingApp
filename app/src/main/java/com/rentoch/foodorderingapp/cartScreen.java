package com.rentoch.foodorderingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class cartScreen extends AppCompatActivity {
    TextView listView, priceView;
    String list_choice;
    Integer price_et,price_usd;
    SQLiteDatabase db;
    ImageButton awashPaymentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_screen);
        awashPaymentBtn = (ImageButton) findViewById(R.id.awashImageButton);
        //
        //Create database,StudentDB database name
        db=openOrCreateDatabase("foodDB", Context.MODE_PRIVATE, null);

        //
        //-----------------------------bottom navigation bar ----------------------------------------------------------------
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
        //------------------------------------end of bottom navigation bar ------------------------------------------------------------

        awashPaymentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(cartScreen.this,PaymentAwash.class);
                startActivity(i);
            }
        });

        //-----------------------------------------------------------------------------------------------------------------------

        //---------------------------------------------------------------------------------------
        listView =(TextView)findViewById(R.id.listView);
        priceView=(TextView)findViewById(R.id.priceView);

        //Getting passed value from MainActivity
        Bundle bundle = getIntent().getExtras();
        list_choice = bundle.getString("choices");
        price_et = bundle.getInt("price");


        listView.setText(list_choice);
        priceView.setText(price_et.toString() + "  Ethiopian birr");

        //------------------------------------------------------------------------------------------------------------------------
    }
}