package com.hisham.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class home extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView homebutton = (ImageView) findViewById(R.id.btnBack);
        homebutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent newinten = new Intent(home.this, login_page.class);
        startActivity(newinten );
    }
}