package com.rentoch.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class PaymentAwash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_awash);
        WebView mywebview = (WebView) findViewById(R.id.awashWebView);
        mywebview.loadUrl("https://www.awashbank.com/");
    }
}