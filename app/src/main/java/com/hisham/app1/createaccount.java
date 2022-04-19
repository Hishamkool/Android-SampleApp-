package com.hisham.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
//import android.widget.EditText;


public class createaccount extends AppCompatActivity implements View.OnClickListener {
    String UserName;
    String Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createaccount);
        Button submit = (Button) findViewById(R.id.Submit);
        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View submit) {
        EditText user = (EditText) findViewById(R.id.edittxtUserName);
        EditText pass = (EditText) findViewById(R.id.edittxtUsePassword);


        Intent i = new Intent(createaccount.this, login_page.class);
        UserName = user.getText().toString();
        Password = pass.getText().toString();
        i.putExtra("UserName", UserName);
        i.putExtra("Password", Password);
        if (UserName.matches("") || Password.matches("")  ){
            Toast.makeText(this, "Username and password required", Toast.LENGTH_SHORT).show();

        }else {
            startActivity(i);
        }
    }


}