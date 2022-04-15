package com.hisham.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class createaccount extends AppCompatActivity implements View.OnClickListener {
    EditText user = (EditText) findViewById(R.id.edittxtUserName);
    EditText pass =(EditText) findViewById(R.id.edittxtUsePassword);
    String UserName ;
    String  Password;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createaccount);

        submit = (Button) findViewById(R.id.Submit);
        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(createaccount.this, login_page.class);
        UserName= user.getText().toString();
        Password=pass.getText().toString();
        i.putExtra("UserName", UserName);
        i.putExtra("Password", Password);
        startActivity(i);
    }


}