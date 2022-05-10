package com.hisham.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class timePicker_withEdittext extends AppCompatActivity {
    EditText selectTime;
    TimePickerDialog tpd;
    Button settime;
    TextView txtvTime;
    String am_pm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker_with_edittext);

        selectTime = (EditText) findViewById(R.id.edtxTimepicker);
        settime = (Button) findViewById(R.id.btnSetTIme);

        selectTime.setInputType(InputType.TYPE_NULL); // so that user can enter any text in the edittext

        txtvTime = (TextView)findViewById(R.id.txtvTime);

        selectTime.setOnClickListener(new View.OnClickListener() {

            final Calendar clendr123 = Calendar.getInstance(); //calender is an abstract class so we need to use getInstance to access time date hr etc
            int hr = clendr123.get(Calendar.HOUR_OF_DAY);
            int min = clendr123.get(Calendar.MINUTE);
            @Override
            public void onClick(View view) {
                tpd = new TimePickerDialog(timePicker_withEdittext.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker timePicker, int sethour, int setMin) {


                                if (sethour > 12){
                                     am_pm = "PM";
                                    sethour = sethour-12;
                                }else{
                                    am_pm = "AM";
                                }

                                selectTime.setText(sethour + ":" + setMin+" "+am_pm);

                            }
                        },hr, min, true
                );
                tpd.show(); // to show TimePickerDialog box . tpd is defined above
            }
        });
        settime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvTime.setText("Selected time : "+selectTime.getText());
            }
        });

    }
}