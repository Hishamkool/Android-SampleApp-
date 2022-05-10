package com.hisham.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class TimePicker_activity extends AppCompatActivity {
    TimePicker picTime;
    Button setTime;
    TextView txtshow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
        picTime =(TimePicker) findViewById(R.id.timePicker);
        setTime = (Button) findViewById(R.id.setTime);
        txtshow= (TextView) findViewById(R.id.txtshwTime);

        picTime.setIs24HourView(true); // this is necessary as we are subtracting 12 from hr for am and pm so if while seleting time if we give am or pm them it subtracts 12


        setTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hr , min;
                String am_pm ;

                if (Build.VERSION.SDK_INT>=23){
                    // if build in marshmallow or above
                    hr = picTime.getHour();
                    min = picTime.getMinute();

                }else
                {
                    //if build older than marshmallow then the following code should be used
                    hr = picTime.getCurrentHour();
                    min= picTime.getCurrentMinute();
                }
                if (hr>12){
                    am_pm = "PM";
                    hr = hr-12;

                }else
                {
                    am_pm="AM";

                }
                txtshow.setText("Selected hour : "+hr+":"+min+" "+am_pm);

            }
        });

    }
}