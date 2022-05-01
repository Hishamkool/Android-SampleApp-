package com.hisham.app1.apprating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.hisham.app1.R;

public class ratingActivitty extends AppCompatActivity {
TextView result;
Button subm;
RatingBar r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raing_activitty);

        r= findViewById(R.id.ratingBar);
        result = (TextView) findViewById(R.id.txResult);
        subm= findViewById(R.id.btSubmit);

        subm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numstars= r.getNumStars();
                float rating = r.getRating();
                Toast.makeText(ratingActivitty.this, "Rating "+rating, Toast.LENGTH_SHORT).show();
                result.setText("Thankyou for rating the app "+rating+"/"+numstars+" ");
            }
        });
    }

}