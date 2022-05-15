package com.hisham.app1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class recyclerViewEx extends AppCompatActivity {

    ArrayList<String> games = new ArrayList<String>(Arrays.asList("badminton,Baseball,bowling"));
    ArrayList<Integer> gameImages = new ArrayList<Integer>(Arrays.asList(R.drawable.games_badminton,R.drawable.games_baseball,R.drawable.games_bowling));

    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recycler= (RecyclerView) findViewById(R.id.recylerview1);

        GridLayoutManager gridLayoutManagerobj = new GridLayoutManager(getApplicationContext(),2, LinearLayoutManager.HORIZONTAL,false); //Buildin gridview //
            //parameters
            //        context –Current context, will be used to access resources.
            //                spanCount –The number of columns or rows in the grid
            //        orientation –Layout orientation.Should be HORIZONTAL or VERTICAL.
            //                reverseLayout –When set to true, layouts from end to start.

        recycler.setLayoutManager(gridLayoutManagerobj); // setting grid into recycler
        CustomAdaptorRecycler customAdaptorRecycler = new CustomAdaptorRecycler (getApplicationContext(),gameImages,games);
        recycler.setAdapter(customAdaptorRecycler);


    }
}