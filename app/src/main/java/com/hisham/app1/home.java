package com.hisham.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

public class home extends AppCompatActivity implements View.OnClickListener {

    Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView homebutton = (ImageView) findViewById(R.id.btnBack);
        homebutton.setOnClickListener(this);



//        check.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                boolean checkedcheckbox = ((CheckBox) view).isChecked();
//                String lang = "";
//                switch (view.getId()) {
//                    case R.id.checkBox1:
//                        lang = checkedcheckbox ? "Malayalam selected" : "Malayalam disselected";
//                        break;
//                    case R.id.checkBox2:
//
//                        lang = checkedcheckbox ? "Tamil selected" : "Tamil diselected";
//                        break;
//                    case R.id.checkBox3:
//
//                        lang = checkedcheckbox ? "Hindi selected" : "Hindi disselected";
//                        break;
//                    case R.id.checkBox4:
//                        lang = checkedcheckbox ? "English selected" : "English disselected";
//                        break;
//
//
//                }
//                Toast.makeText(getApplicationContext(), "Languages Known" + lang, Toast.LENGTH_LONG).show();
//            }
//        });
    }

    @Override
    public void onClick(View backbtn) {
        Intent newinten = new Intent(home.this, login_page.class);
        startActivity(newinten);
    }
}