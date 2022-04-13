package com.hisham.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//import android.widget.Spinner;

//import java.util.ArrayList;
//import java.util.List;


public class createaccount extends AppCompatActivity implements View.OnClickListener {
    EditText edittxtUserName;
    EditText edittxtUsePassword;
    Button submit;

//    Spinner spinner_State;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createaccount);


        submit = (Button)findViewById(R.id.Submit);
        submit.setOnClickListener(this);


//        spinner_State = (Spinner) findViewById(R.id.spinner_State);
//        spinner_State.setOnClickListener(this);
//        List<String> categories = new ArrayList<String>();
//        categories.add("Kerala");
//        categories.add("Tamil nadu");

    }

    @Override
    public void onClick(View view) {

        Intent newintent = new Intent(getApplicationContext(),login_page.class);
        newintent.putExtra("UserName",edittxtUserName);
        newintent.putExtra("pass",edittxtUsePassword);
        startActivity(newintent);
    }

//    @Override
//    public void onClick(View view) {
//
//    }
}