package com.geektech.lesson4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    ArrayList<String> data = new ArrayList<String>(){{
        add("Test 1");
        add("Test 2");
        add("Test 3");
        add("Test 1");
        add("Test 2");
        add("Test 3");
        add("Test 1");
        add("Test 2");
        add("Test 3");
    }};

    IOnClickListener listener;
    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.view_holder_main, parent, false);
        MainViewHolder vh=new MainViewHolder(v);
        vh.listener=listener;
        return vh;

    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
holder.textView.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
