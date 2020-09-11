package com.example.gadsboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyHolder> {

    private ArrayList<DataList> dataLists;

    public RecyclerAdapter(ArrayList<DataList> data) {
        this.dataLists = data;
    }


    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,parent, false);
        MyHolder myHolder = new MyHolder(view);
        return myHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        TextView name = holder.name;
        TextView nation = holder.country;
        TextView hours = holder.hours;
        ImageView img = holder.img;

        name.setText(dataLists.get(position).getName());
        nation.setText(dataLists.get(position).getNation());
        hours.setText(dataLists.get(position).getHours());
        img.setImageResource(dataLists.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return dataLists.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView country;
        TextView hours;
        ImageView img;


        public MyHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            country = itemView.findViewById(R.id.country);
            hours = itemView.findViewById(R.id.hours);
            img = itemView.findViewById(R.id.imageView);

        }
    }
}
