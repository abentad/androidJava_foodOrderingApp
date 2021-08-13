package com.rentoch.foodorderingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;
import com.rentoch.foodorderingapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class HomeScreenActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager2 viewPager2;
    FragmentAdapter fragmentAdapter;
    SQLiteDatabase db;

    String choice =" ";
    Integer price = 0;
    //
    public void add_to_list(View view){
        if (view == findViewById(R.id.food_btn1)){
            TextView tv1 = findViewById(R.id.food_name1);
            TextView tp1 = findViewById(R.id.food_price_1);
            choice = choice + tv1.getText().toString().trim() +"\n";
            price = price + Integer.parseInt(tp1.getText().toString());
            Toast.makeText(getApplicationContext(), tv1.getText().toString().trim() + " added to cart", Toast.LENGTH_SHORT).show();
        }
        else if (view == findViewById(R.id.food_btn2))
        {
            TextView tv1 = findViewById(R.id.food_name2);
            TextView tp1 = findViewById(R.id.food_price_2);
            choice = choice + tv1.getText().toString().trim() +"\n";
            price = price + Integer.parseInt(tp1.getText().toString());
            Toast.makeText(getApplicationContext(), tv1.getText().toString().trim() + " added to cart", Toast.LENGTH_LONG).show();
        }
        else if (view == findViewById(R.id.food_btn3))
        {
            TextView tv1 = findViewById(R.id.food_name3);
            TextView tp1 = findViewById(R.id.food_price_3);
            choice = choice + tv1.getText().toString().trim() +"\n";
            price = price + Integer.parseInt(tp1.getText().toString());
            Toast.makeText(getApplicationContext(), tv1.getText().toString().trim() + " added to cart", Toast.LENGTH_LONG).show();
        }
        else if (view == findViewById(R.id.food_btn4))
        {
            TextView tv1 = findViewById(R.id.food_name4);
            TextView tp1 = findViewById(R.id.food_price_4);
            choice = choice + tv1.getText().toString().trim() +"\n";
            price = price + Integer.parseInt(tp1.getText().toString());
            Toast.makeText(getApplicationContext(), tv1.getText().toString().trim() + " added to cart", Toast.LENGTH_LONG).show();
        }
        else if (view == findViewById(R.id.food_btn5))
        {
            TextView tv1 = findViewById(R.id.food_name5);
            TextView tp1 = findViewById(R.id.food_price_5);
            choice = choice + tv1.getText().toString().trim() +"\n";
            price = price + Integer.parseInt(tp1.getText().toString());
            Toast.makeText(getApplicationContext(), tv1.getText().toString().trim() + " added to cart", Toast.LENGTH_LONG).show();
        }
        else if (view == findViewById(R.id.food_btn6))
        {
            TextView tv1 = findViewById(R.id.food_name6);
            TextView tp1 = findViewById(R.id.food_price_6);
            choice = choice + tv1.getText().toString().trim() +"\n";
            price = price + Integer.parseInt(tp1.getText().toString());
            Toast.makeText(getApplicationContext(), tv1.getText().toString().trim() + " added to cart", Toast.LENGTH_LONG).show();
        }
        else if (view == findViewById(R.id.food_btn7))
        {
            TextView tv1 = findViewById(R.id.food_name7);
            TextView tp1 = findViewById(R.id.food_price_7);
            choice = choice + tv1.getText().toString().trim() +"\n";
            price = price + Integer.parseInt(tp1.getText().toString());
            Toast.makeText(getApplicationContext(), tv1.getText().toString().trim() + " added to cart", Toast.LENGTH_LONG).show();
        }
        else if (view == findViewById(R.id.food_btn8))
        {
            TextView tv1 = findViewById(R.id.food_name8);
            TextView tp1 = findViewById(R.id.food_price_8);
            choice = choice + tv1.getText().toString().trim() +"\n";
            price = price + Integer.parseInt(tp1.getText().toString());
            Toast.makeText(getApplicationContext(), tv1.getText().toString().trim() + " added to cart", Toast.LENGTH_LONG).show();
        }
        else if (view == findViewById(R.id.food_btn9))
        {
            TextView tv1 = findViewById(R.id.food_name9);
            TextView tp1 = findViewById(R.id.food_price_9);
            choice = choice + tv1.getText().toString().trim() +"\n";
            price = price + Integer.parseInt(tp1.getText().toString());
            Toast.makeText(getApplicationContext(), tv1.getText().toString().trim() + " added to cart", Toast.LENGTH_LONG).show();
        }
        else if (view == findViewById(R.id.food_btn_pizza1))
        {
            TextView tv1 = findViewById(R.id.food_name_pizza1);
            TextView tp1 = findViewById(R.id.food_price_pizza1);
            choice = choice + tv1.getText().toString().trim() +"\n";
            price = price + Integer.parseInt(tp1.getText().toString());
            Toast.makeText(getApplicationContext(), tv1.getText().toString().trim() + " added to cart", Toast.LENGTH_LONG).show();
        }
        else if (view == findViewById(R.id.food_btn_pizza2))
        {
            TextView tv1 = findViewById(R.id.food_name_pizza2);
            TextView tp1 = findViewById(R.id.food_price_pizza2);
            choice = choice + tv1.getText().toString().trim() +"\n";
            price = price + Integer.parseInt(tp1.getText().toString());
            Toast.makeText(getApplicationContext(), tv1.getText().toString().trim() + " added to cart", Toast.LENGTH_LONG).show();
        }
        else if (view == findViewById(R.id.food_btn_pizza3))
        {
            TextView tv1 = findViewById(R.id.food_name_pizza3);
            TextView tp1 = findViewById(R.id.food_price_pizza3);
            choice = choice + tv1.getText().toString().trim() +"\n";
            price = price + Integer.parseInt(tp1.getText().toString());
            Toast.makeText(getApplicationContext(), tv1.getText().toString().trim() + " added to cart", Toast.LENGTH_LONG).show();
        }
        else if (view == findViewById(R.id.food_btn_pizza4))
        {
            TextView tv1 = findViewById(R.id.food_name_pizza4);
            TextView tp1 = findViewById(R.id.food_price_pizza4);
            choice = choice + tv1.getText().toString().trim() +"\n";
            price = price + Integer.parseInt(tp1.getText().toString());
            Toast.makeText(getApplicationContext(), tv1.getText().toString().trim() + " added to cart", Toast.LENGTH_LONG).show();
        }
        else if (view == findViewById(R.id.food_btn_pizza5))
        {
            TextView tv1 = findViewById(R.id.food_name_pizza5);
            TextView tp1 = findViewById(R.id.food_price_pizza5);
            choice = choice + tv1.getText().toString().trim() +"\n";
            price = price + Integer.parseInt(tp1.getText().toString());
            Toast.makeText(getApplicationContext(), tv1.getText().toString().trim() + " added to cart", Toast.LENGTH_LONG).show();
        }
        else if (view == findViewById(R.id.food_btn_pizza6))
        {
            TextView tv1 = findViewById(R.id.food_name_pizza6);
            TextView tp1 = findViewById(R.id.food_price_pizza6);
            choice = choice + tv1.getText().toString().trim() +"\n";
            price = price + Integer.parseInt(tp1.getText().toString());
            Toast.makeText(getApplicationContext(), tv1.getText().toString().trim() + " added to cart", Toast.LENGTH_LONG).show();
        }
        else if (view == findViewById(R.id.food_btn_pizza7))
        {
            TextView tv1 = findViewById(R.id.food_name_pizza7);
            TextView tp1 = findViewById(R.id.food_price_pizza7);
            choice = choice + tv1.getText().toString().trim() +"\n";
            price = price + Integer.parseInt(tp1.getText().toString());
            Toast.makeText(getApplicationContext(), tv1.getText().toString().trim() + " added to cart", Toast.LENGTH_LONG).show();
        }
        else if (view == findViewById(R.id.food_btn_pizza8))
        {
            TextView tv1 = findViewById(R.id.food_name_pizza8);
            TextView tp1 = findViewById(R.id.food_price_pizza8);
            choice = choice + tv1.getText().toString().trim() +"\n";
            price = price + Integer.parseInt(tp1.getText().toString());
            Toast.makeText(getApplicationContext(), tv1.getText().toString().trim() + " added to cart", Toast.LENGTH_LONG).show();
        }
        else if (view == findViewById(R.id.food_btn_salad1))
        {
            TextView tv1 = findViewById(R.id.food_name_salad1);
            TextView tp1 = findViewById(R.id.food_price_salad1);
            choice = choice + tv1.getText().toString().trim() +"\n";
            price = price + Integer.parseInt(tp1.getText().toString());
            Toast.makeText(getApplicationContext(), tv1.getText().toString().trim() + " added to cart", Toast.LENGTH_LONG).show();
        }
        else if (view == findViewById(R.id.food_btn_salad2))
        {
            TextView tv1 = findViewById(R.id.food_name_salad2);
            TextView tp1 = findViewById(R.id.food_price_salad2);
            choice = choice + tv1.getText().toString().trim() +"\n";
            price = price + Integer.parseInt(tp1.getText().toString());
            Toast.makeText(getApplicationContext(), tv1.getText().toString().trim() + " added to cart", Toast.LENGTH_LONG).show();
        }
        else if (view == findViewById(R.id.food_btn_salad3))
        {
            TextView tv1 = findViewById(R.id.food_name_salad3);
            TextView tp1 = findViewById(R.id.food_price_salad3);
            choice = choice + tv1.getText().toString().trim() +"\n";
            price = price + Integer.parseInt(tp1.getText().toString());
            Toast.makeText(getApplicationContext(), tv1.getText().toString().trim() + " added to cart", Toast.LENGTH_LONG).show();
        }
        else if (view == findViewById(R.id.food_btn_salad4))
        {
            TextView tv1 = findViewById(R.id.food_name_salad4);
            TextView tp1 = findViewById(R.id.food_price_salad4);
            choice = choice + tv1.getText().toString().trim() +"\n";
            price = price + Integer.parseInt(tp1.getText().toString());
            Toast.makeText(getApplicationContext(), tv1.getText().toString().trim() + " added to cart", Toast.LENGTH_LONG).show();
        }
        else if (view == findViewById(R.id.food_btn_salad5))
        {
            TextView tv1 = findViewById(R.id.food_name_salad5);
            TextView tp1 = findViewById(R.id.food_price_salad5);
            choice = choice + tv1.getText().toString().trim() +"\n";
            price = price + Integer.parseInt(tp1.getText().toString());
            Toast.makeText(getApplicationContext(), tv1.getText().toString().trim() + " added to cart", Toast.LENGTH_LONG).show();
        }
        else if (view == findViewById(R.id.food_btn_salad6))
        {
            TextView tv1 = findViewById(R.id.food_name_salad6);
            TextView tp1 = findViewById(R.id.food_price_salad6);
            choice = choice + tv1.getText().toString().trim() +"\n";
            price = price + Integer.parseInt(tp1.getText().toString());
            Toast.makeText(getApplicationContext(), tv1.getText().toString().trim() + " added to cart", Toast.LENGTH_LONG).show();
        }
        else if (view == findViewById(R.id.food_btn_salad7))
        {
            TextView tv1 = findViewById(R.id.food_name_salad7);
            TextView tp1 = findViewById(R.id.food_price_salad7);
            choice = choice + tv1.getText().toString().trim() +"\n";
            price = price + Integer.parseInt(tp1.getText().toString());
            Toast.makeText(getApplicationContext(), tv1.getText().toString().trim() + " added to cart", Toast.LENGTH_LONG).show();
        }
        else if (view == findViewById(R.id.food_btn_salad8))
        {
            TextView tv1 = findViewById(R.id.food_name_salad8);
            TextView tp1 = findViewById(R.id.food_price_salad8);
            choice = choice + tv1.getText().toString().trim() +"\n";
            price = price + Integer.parseInt(tp1.getText().toString());
            Toast.makeText(getApplicationContext(), tv1.getText().toString().trim() + " added to cart", Toast.LENGTH_LONG).show();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        //
        //Create database,StudentDB database name
        db=openOrCreateDatabase("foodDB", Context.MODE_PRIVATE, null);
        //create table Student
        db.execSQL("CREATE TABLE IF NOT EXISTS FoodTable(FoodId INTEGER PRIMARY KEY AUTOINCREMENT,FoodName VARCHAR,FoodPrice INTEGER);");

        //---------------------------------------------------------------------------------------------------------------------






        //------------------------------------------------------------------------------------------------------------------------

        //------------Bottom nav bar ---------------------------------------------------------------------------------------------
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        //set home selected
        bottomNavigationView.setSelectedItemId(R.id.btnav_home);
        //add itemSelected listener
        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.btnav_home:
                        return true;
                    case R.id.btnav_cart:
                        //cart logic when the button is pressed is placed here
                        //
                        gotoCart();
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
        //
        //-------------end of bottom nav bar --------------------------------------------------------------------------------------
        //
        //-------------------------tab layout ------------------------------------------------------------------------------------
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        viewPager2 = (ViewPager2) findViewById(R.id.view_pager2);

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentAdapter = new FragmentAdapter(fragmentManager, getLifecycle());
        //setting teh viewpager to this fragment adapter
        //then adding three tabs to the tab layout
        viewPager2.setAdapter(fragmentAdapter);
        tabLayout.addTab(tabLayout.newTab().setText("Burger"));
        tabLayout.addTab(tabLayout.newTab().setText("Pizza"));
        tabLayout.addTab(tabLayout.newTab().setText("Salad"));

        //adding on tab selected listener to the tablayout
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });

        //-------------end of tab layout --------------------------------------------------------------------------------------


    }

    //
    public void gotoCart(){
        Intent i = new Intent(this,cartScreen.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choice);
        bundle.putInt("price",price);
        //
        if(choice.length() != 0 || price.toString().length() != 0){
            db.execSQL("INSERT INTO FoodTable(FoodName,FoodPrice)VALUES('"+ choice+"','"+ price+ "');");
        }
        i.putExtras(bundle);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(i);
        finish();
        overridePendingTransition(0,0);
    }
}