package com.hisham.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class login_page extends AppCompatActivity implements View.OnClickListener {

    TextView txtLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);// R.java  holds the id's of all resource files (res)

        Button loginbtn = (Button) findViewById(R.id.login); // object "loginbtn" created for login button

//<<<<< 1.Button click using anonymous inner class
//
//
//        loginbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"welcome",Toast.LENGTH_LONG).show();
//                Intent intent = new Intent(login_page.this,home.class);
//                startActivity(intent);
//            }
//        });
//        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>1------------------


//  <<<<<Animation test
//        txtLogin =findViewById(R.id.txtLogin);
//        Handler anim = new Handler();
//        anim.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Animation txtloginobj = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.txtlogin);
//                txtLogin.setAnimation(txtloginobj);
//            }
//        },600);
//        >>>>>>>>>>> animation test--------------------


        //<<<<<<<<2. button click using Implement method
        loginbtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(getApplicationContext(),"welcome",Toast.LENGTH_LONG).show();

        Intent intobj = new Intent(getApplicationContext(), home.class);
        startActivity(intobj);
    }

//    >>>>>>>>>>>>>>>>>>>>>>>>>>>> 2 ---------------------


//    <<<<<<<<<<<<<<3. Button click using xml file

//    public void login1(View view) {
//        Toast.makeText(getApplicationContext(), "Clicked on login", Toast.LENGTH_LONG).show();
//        Intent intobj = new Intent(getApplicationContext(), home.class);
//        startActivity(intobj);
//
//    }
//    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  3 ----------------------


    //    <<<<<<<<<<<<<< Button click for create account using xml file
    public void createaccount(View view) {

        Toast.makeText(this, "Please Sign up", Toast.LENGTH_SHORT).show();

        Intent intobj = new Intent(login_page.this, createaccount.class);
        startActivity(intobj);
    }


}