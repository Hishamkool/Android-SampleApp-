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
    @Override
    public void onBackPressed() {
        //Listening back pressed

        //Alert structure
        AlertDialog.Builder alertobj = new AlertDialog.Builder(this);
        alertobj.setTitle("Exit?")
                .setMessage("Do you want to exit?")  //or alert.setMessage("hi");
        //  alertobj.setTitle("hjhijadfh").setCancelable();
                .setCancelable(false);  //doesnot close the dialog box on clicking outside the dialogbox
        alertobj.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        alertobj.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        alertobj.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        //Creating alert
        AlertDialog obj = alertobj.create();
        alertobj.show();



    }
}