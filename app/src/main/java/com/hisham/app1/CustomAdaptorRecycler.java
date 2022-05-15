package com.hisham.app1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class CustomAdaptorRecycler extends RecyclerView.Adapter<CustomAdaptorRecycler.MyViewHolder> {
    //we created a customadapter class  for recycler which should extend recyclerView
    //but this recyclerveiw needs a view holder thatas why we created a new class named MyViewHolder

    ArrayList<String> gamenames;
    ArrayList<Integer> gameImages;
    Context cont;

    public CustomAdaptorRecycler(Context applicationContext, ArrayList<Integer> gameImages, ArrayList<String> games) {
        cont =applicationContext;
        this.gamenames =  games;
        this.gameImages = gameImages;


    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewv123 = LayoutInflater.from(parent.getContext()).inflate(R.layout.second_recycler_layout, parent, false);
        //
        MyViewHolder vh123 = new MyViewHolder(viewv123);
        return vh123;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.gNam.setText(gamenames.get(position));
        holder.gImg.setImageResource(gameImages.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() { //itemView is inbuilt
            @Override
            public void onClick(View view) {
                Toast.makeText(cont, "Hi", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return gameImages.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView gNam;
        ImageView gImg;

        // MyViewHolder should work as a viewholder therefore we extend recycler.viewholder
        public MyViewHolder(@NonNull View itemViewholder) {
            //view123 will be recived here in itemViewholder from line 31
            super(itemViewholder);
            gNam = (TextView) itemViewholder.findViewById(R.id.textView_gNam);
            gImg =(ImageView) itemViewholder.findViewById(R.id.imageView_gImg);


        }
    }
}
