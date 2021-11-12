package com.example.lesson33;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Adapter.OnCLick {

    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<Model> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecycler();
    }
    private ArrayList<Model> createList() {
        list.add(new Model(1,"Australia"));
        list.add(new Model(2,"Eurasia"));
        list.add(new Model(3,"North America"));
        list.add(new Model(4,"South America"));
        list.add(new Model(5,"Antarctida"));
        list.add(new Model(6,"Africa"));
        return list;
    }

    private void initRecycler() {
        recyclerView = findViewById(R.id.rv_countries);
        adapter = new Adapter();
        recyclerView.setAdapter(adapter);
        adapter.setList(createList(),this);

    }

    @Override
    public void onItemClick(Model model) {
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("key",model.getId());
        startActivity(intent);
    }
}