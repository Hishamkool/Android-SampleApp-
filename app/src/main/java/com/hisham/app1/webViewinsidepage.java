package com.hisham.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class webViewinsidepage extends AppCompatActivity {
    EditText enterurl;
    WebView webview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        enterurl = findViewById(R.id.enterurl1);

        webview = findViewById(R.id.webview123);
        webview.setWebViewClient(new WebViewClient());


    }

    public void gotowebview(View view) {
        String enterurl1 = enterurl.getText().toString();
        webview.getSettings().setLoadsImagesAutomatically(true);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webview.loadUrl("https://www."+enterurl1+".com");
//        webview.loadUrl(enterurl);
    }
}