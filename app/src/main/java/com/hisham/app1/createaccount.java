package com.hisham.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
//import android.widget.EditText;


public class createaccount extends AppCompatActivity implements View.OnClickListener {
    String UserName;
    String Password;
    String states123[] = {"Select state", "Kerala", "Tamil Nadu", "Karanataka", "Andrapradesh"};
    Spinner st;
    Spinner age;
    ArrayAdapter arrayAdapter_selectState;
    ArrayAdapter arrayAdapter_selectAge;
    ArrayList<String> arrayList_Age;
    CheckBox c1, c2, c3, c4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createaccount);
        Button submit = (Button) findViewById(R.id.Submit);
        submit.setOnClickListener(this);
        st = findViewById(R.id.spinner_State);
        arrayAdapter_selectState = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, states123);
        st.setAdapter(arrayAdapter_selectState);
        // to add text view to spinner using built in text view holder(android.R.layout.simple_list_item_1)
        // We need adaptors to add view
        //list adapter, array adaptor , base adaptor etc are the examples

        age = findViewById(R.id.spinner_Age);
        arrayList_Age = new ArrayList();
        arrayList_Age.add("Select your age");
        arrayList_Age.add("18");
        arrayList_Age.add("< 18");
        arrayList_Age.add("> 18");
        arrayAdapter_selectAge = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, arrayList_Age);
        age.setAdapter(arrayAdapter_selectAge);


        //click on spinner for state
        // Since its a drop down menu we need setOnItemSelected listener , but if it was only a list view we
//       can use setOnItemClickedListerner
        st.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(), states123[i], Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        //spinner for age
        age.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(), arrayList_Age.get(i), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                //when noting selection no need for any operation

            }
        });

        // checkboxes

        c1 = findViewById(R.id.checkBox1);
        c2 = findViewById(R.id.checkBox2);
        c3 = findViewById(R.id.checkBox3);
        c4 = findViewById(R.id.checkBox4);

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
        if (UserName.matches("") || Password.matches("")) {
            Toast.makeText(this, "Username and password required", Toast.LENGTH_SHORT).show();

        } else {
            startActivity(i);
        }
    }


}