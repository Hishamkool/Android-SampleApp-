package com.hisham.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;

public class WifiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi);
    }

    public void wifipanel(View view) { // onclick from xml

        if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.Q){
            Intent wifipanel = new Intent(Settings.Panel.ACTION_INTERNET_CONNECTIVITY);
            startActivityForResult(wifipanel,0);
        }else{
            WifiManager wifimngr = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
            wifimngr.setWifiEnabled(true);
        }
    }
}