package com.hisham.app1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Set;

public class BluetoothActivity extends AppCompatActivity {

    Button on, off, discover, paired;
    TextView status, txtpairedlist;
    ImageView bt;

    BluetoothAdapter btadaptr;

    private static final int REQUEST_ENABLE_BT = 0;
    private static final int REQUEST_DISCOVER_BT = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth);


        on = (Button) findViewById(R.id.btnOn);
        off = (Button) findViewById(R.id.btnOff);
        discover = (Button) findViewById(R.id.btnDiscoverable);
        paired = (Button) findViewById(R.id.btnPairedlist);

        status = (TextView) findViewById(R.id.txtBTstatus);
        txtpairedlist = (TextView) findViewById(R.id.txtPairedDeviceList);

        bt = (ImageView) findViewById(R.id.bluetoothImg);

        //Adaptor
        btadaptr = BluetoothAdapter.getDefaultAdapter();

        // Check if bluetooth is available or not
        if (btadaptr == null) {
            status.setText("Device doesn't have bluetooth or is not configured proparly");
        } else {
            status.setText("BLuetooth available ");
        }

        //Check bluetooth status and set image
        if (btadaptr.isEnabled()) {
            bt.setImageResource(R.drawable.bluetooth);
//            status.setText("bluetoothON");
        } else {
            bt.setImageResource(R.drawable.bluetooth_disabled);
        }


        // turnOn btn click
        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!btadaptr.isEnabled()) { // !btadapter.is enabled means if not enabled !!!!!!!!!!!!!!!
                    Intent i = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                    startActivityForResult(i, REQUEST_ENABLE_BT);
                    showToast("Turning on Bluetooth ...");
                } else {
                    showToast("Bluetooth already ON");
                }
            }
        });
        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btadaptr.isEnabled()) {
                    btadaptr.disable();
                    showToast("Turning off Bluetooth ...");
                    bt.setImageResource(R.drawable.bluetooth_disabled);
                } else {
                    showToast("Bluetooth already Off");
                }
            }
        });
        //Make discoverable
        discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!btadaptr.isEnabled()) {
                    showToast("Making your device discoverable..");
                    Intent i = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
                    startActivityForResult(i, REQUEST_DISCOVER_BT);

                }
            }
        });

        paired.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btadaptr.isEnabled()) {
                    txtpairedlist.setText("Paired devices:");
                    Set<BluetoothDevice> devices123 = btadaptr.getBondedDevices();          // BluetoothDevices is a datatype for bluetooth devices

                    for (BluetoothDevice devicefor : devices123) {                           //for(datatype variable array)
                        txtpairedlist.append("device: " + devicefor.getName() + ", " + devicefor);
                    }

                }else {
                    showToast("Enable bluetooth to see paired devices");
                }
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,  Intent data) {
        switch (requestCode){
            case REQUEST_ENABLE_BT:
                if (resultCode == RESULT_OK){
                    // bluetooth is on
                    bt.setImageResource(R.drawable.bluetooth);
                    showToast("Bluetooth is on ");
                }else {
                    // when user denied to turn bluetooth on
                    showToast("COuldnt turn on Bluetooth");
                }
                break;

        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    //Creating a toast function to use in multiple location
    private void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}