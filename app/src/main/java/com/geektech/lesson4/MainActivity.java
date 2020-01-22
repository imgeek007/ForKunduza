package com.geektech.lesson4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements IOnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.recycler_view);
        MainAdapter adapter=new MainAdapter();
        adapter.listener=this;
        recyclerView.setAdapter(adapter);


    }
    public void openSecond(String text){
        Intent intent=new Intent(this,SecondActivity.class);
        intent.putExtra("key", text);
        startActivity(intent);
    }

    @Override
    public void onClick(String s) {
        Log.d("ololo", "MA onClick"+s);
        openSecond(s);
    }
}
