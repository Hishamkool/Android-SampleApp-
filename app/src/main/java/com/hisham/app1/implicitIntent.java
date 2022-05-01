package com.hisham.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class implicitIntent extends AppCompatActivity {
EditText enterurl;
//webView webviewnewactivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);
        enterurl = findViewById(R.id.enterurl);
//        webviewnewactivity= findViewById(R.id.webview);

    }

    public void gotoweb(View view) {
        Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
        startActivity(i);

    }

    public void gotocustomweb(View view) {
        String customurl = enterurl.getText().toString();


        Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www."+customurl+".com"));
        startActivity(i);
    }
}