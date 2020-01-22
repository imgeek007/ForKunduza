package com.geektech.lesson4;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {
    TextView textView;
    IOnClickListener listener;

    public MainViewHolder(@NonNull final View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.vh_text);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ololo", "VH onClick");
               listener.onClick(textView.getText().toString());
            }
        });

    }
}

