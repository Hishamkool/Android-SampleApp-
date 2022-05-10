package com.hisham.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class progressDialogBox extends AppCompatActivity {
    ProgressDialog progressvariable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_dialog_box);


    }

// 5-5-22 incomplete
//    public void showdialog(View view) {
//        progressvariable = new ProgressDialog(progressDialogBox.class);
//        progressvariable.setMax(100);
//        progressvariable.setMessage("downloading -- 75 GB");
//        progressvariable.setTitle("GTA 5");
//        progressvariable.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
//        progressvariable.show();
//
//
//        Handler hnd = new Handler(){
//
//        }

//    }
}