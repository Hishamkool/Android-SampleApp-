package com.hisham.app1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hisham.app1.apprating.ratingActivitty;

public class allActivitiesJunction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_activities_junction);


    }

    public void home(View view) {
        Intent home = new Intent(getApplicationContext(), home.class);
        startActivity(home);
    }

    public void createaccount(View view) {
        Intent home = new Intent(getApplicationContext(), createaccount.class);
        startActivity(home);
    }

    public void loginpage(View view) {
        Intent home = new Intent(getApplicationContext(), login_page.class);
        startActivity(home);
    }

    public void splashscreen(View view) {
        Intent splash = new Intent(this, MainActivity.class);
        startActivity(splash);
    }

    public void rating(View view) {


        Intent splash = new Intent(getApplicationContext(), ratingActivitty.class);
        startActivity(splash);
    }

    public void implicitIntent(View view) {


        Intent splash = new Intent(getApplicationContext(), implicitIntent.class);
        startActivity(splash);
    }

    public void webVIew(View view) {
        Intent splash = new Intent(getApplicationContext(), webViewinsidepage.class);
        startActivity(splash);

    }

    public void horizontalscroll(View view) {
        Intent splash = new Intent(getApplicationContext(), HorizontalScroll.class);
        startActivity(splash);
    }
}