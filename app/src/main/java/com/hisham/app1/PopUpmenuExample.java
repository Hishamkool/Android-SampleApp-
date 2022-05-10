package com.hisham.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class PopUpmenuExample extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_upmenu);

        Button click;
        click = (Button) findViewById(R.id.BtnClickme);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup123 = new PopupMenu(PopUpmenuExample.this , view); // PopupMenu is built in class
                popup123.setOnMenuItemClickListener(PopUpmenuExample.this);
                popup123.inflate(R.menu.popupmenuexample);
                popup123.show();
            }
        });

    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        return false;
    }
}