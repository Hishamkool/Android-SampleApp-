package com.hisham.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // <<<<<<<  for splash screen using handler
//        Handler obj = new Handler();
//        obj.postDelayed(new Runnable() {
//            //anonymous object creation for runnable
//            @Override
//            public void run() {
//               // explicit intent and implicit intent are uses to change to different activity
//                Intent intentobj = new Intent(MainActivity.this, login_page.class);
//                startActivity(intentobj);
//                finish();
//            }
//        },1500);
        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>-------


        //<<<<<<<<<<<<<<Splash screen using Thread
        Thread obj = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(1500); //duration
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent i = new Intent(MainActivity.this, TimePicker_activity.class);
                startActivity(i);
                finish();

            }
        };
        obj.start();
        //>>>>>>>>>>>>>>>>>>>>>--------------------
    }
}