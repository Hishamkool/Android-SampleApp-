package com.hisham.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class activityLifecycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        Log.d("life cycle","now onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("life cycle","now onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("life cycle","now onResume");
    }      //create, start and resume invokes on opening application

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("life cycle","now onPause while interacting ");
        //if we click the
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}