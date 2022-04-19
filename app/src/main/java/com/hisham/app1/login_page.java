package com.hisham.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class login_page extends AppCompatActivity implements View.OnClickListener {

    // Dont find view by id globally, only do that inside on_create


    String defaultUsername = "admin";
    String defaultPassword = "admin123";
    TextView txtLogin;
    EditText usernameLogin;
    String usernameLoginValue;
    String passwordLoginValue;
    EditText passwordLogin;
    Button loginbtn;
    Button createacc;
    int maxchance = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);// R.java  holds the id's of all resource files (res)

        txtLogin = (TextView) findViewById(R.id.txtLogin);
        loginbtn = (Button) findViewById(R.id.login);// object "loginbtn" created for login button
        createacc = (Button) findViewById(R.id.btnCreateacc);

        usernameLogin = (EditText) findViewById(R.id.usernameLogin); //loginpage edit text
        passwordLogin = (EditText) findViewById(R.id.passwordLogin); //loginpage edit text


        usernameLoginValue = usernameLogin.getText().toString();
        passwordLoginValue = passwordLogin.getText().toString();
        Intent recivedData = getIntent();
        usernameLoginValue = recivedData.getStringExtra("UserName");
        passwordLoginValue = recivedData.getStringExtra("Password");
        usernameLogin.setText(usernameLoginValue);
        passwordLogin.setText(passwordLoginValue);

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

//        createacc.setOnClickListener(view -> {
//            Toast.makeText(getApplicationContext(),"signup",Toast.LENGTH_LONG).show();
//            Intent intobj = new Intent(login_page.this, createaccount.class);
//            startActivity(intobj);
//        });


        createacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(login_page.this, createaccount.class);
                startActivity(i);
            }
        });


        loginbtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        String testUsername;
        testUsername = usernameLogin.getText().toString();
        String testPassword;
        testPassword = passwordLogin.getText().toString();
        if (usernameLoginValue == null && passwordLoginValue == null) {
            if (defaultUsername.equals(testUsername) && defaultPassword.equals(testPassword)) {

                Intent intobj = new Intent(getApplicationContext(), home.class);
                startActivity(intobj);
                Toast.makeText(getApplicationContext(), "Welcome", Toast.LENGTH_LONG).show();

            } else {
                maxchance--;
                Toast.makeText(getApplicationContext(), "Usename or password incorrect", Toast.LENGTH_SHORT).show();
                if (maxchance == 0) {
                    txtLogin.setText("Login Blocked");
                    loginbtn.setEnabled(false);
                    loginbtn.setBackgroundColor(Color.GRAY);
                    loginbtn.setTextColor(Color.WHITE);
                Toast.makeText(getApplicationContext(), "Maximum attempts reached, login denied", Toast.LENGTH_LONG).show();
                    txtLogin.setTextColor(Color.RED);
                }
            }
        } else if (usernameLoginValue != null && passwordLoginValue != null) {
            if (usernameLogin.getText().toString().equals(usernameLoginValue) && passwordLogin.getText().toString().equals(passwordLoginValue)) {
                Intent intobj = new Intent(getApplicationContext(), home.class);
                startActivity(intobj);
                Toast.makeText(getApplicationContext(), "Welcome", Toast.LENGTH_LONG).show();
            } else {
                maxchance--;
                Toast.makeText(getApplicationContext(), "Usename or password incorrect", Toast.LENGTH_SHORT).show();
                if (maxchance == 0) {
                    txtLogin.setText("Login Blocked");
                    loginbtn.setEnabled(false);
                    loginbtn.setBackgroundColor(Color.GRAY);
                    loginbtn.setTextColor(Color.WHITE);
                Toast.makeText(getApplicationContext(), "Maximum attempts reached, login denied", Toast.LENGTH_LONG).show();
                    txtLogin.setTextColor(Color.RED);
                }
            }
        }


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


}