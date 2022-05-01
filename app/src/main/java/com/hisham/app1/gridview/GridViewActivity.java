package com.hisham.app1.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.hisham.app1.Imageadaptor;
import com.hisham.app1.R;

public class GridViewActivity extends AppCompatActivity {
    GridView imagegrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        imagegrid = findViewById(R.id.gridv_Images);
        imagegrid.setAdapter(new Imageadaptor(this));

        



    }
}