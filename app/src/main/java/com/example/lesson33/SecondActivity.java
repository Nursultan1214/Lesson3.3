package com.example.lesson33;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<Model> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initRecycler();
    }

    private ArrayList<Model> createList() {
        int data = getIntent().getIntExtra("key", 0);
        if (1 == data) {
            list.add(new Model(222, R.drawable.ic_au, "Австралия - это одноименный материк"));

        } else if (2 == data) {
            list.add(new Model(323, R.drawable.ic_ru, "Russia"));
            list.add(new Model(323, R.drawable.ic_kz, "Kazaqstan"));
            list.add(new Model(323, R.drawable.ic_am, "Armenia"));
            list.add(new Model(323, R.drawable.ic_ee, "Estonia"));
            list.add(new Model(323, R.drawable.ic_hu, "Vengria"));
            list.add(new Model(323, R.drawable.ic_kg, "Kyrgyzstan"));
            list.add(new Model(323, R.drawable.ic_sk, "Slovakia"));
            list.add(new Model(323, R.drawable.ic_tr, "Turkey"));
            list.add(new Model(323, R.drawable.ic_ua, "Ukraina"));
            list.add(new Model(323, R.drawable.ic_uz, "Usbekistan"));

        } else if (3 == data) {
            list.add(new Model(323, R.drawable.ic_ca, "Kanada"));
            list.add(new Model(323, R.drawable.ic_gi, "Grenlandia"));
            list.add(new Model(323, R.drawable.ic_mx, "Mexica"));
            list.add(new Model(323, R.drawable.ic_jm, "Yamaika"));
            list.add(new Model(323, R.drawable.ic_do, "Dominican republic"));
            list.add(new Model(323, R.drawable.ic_cr, "Kosta-Rika"));
            list.add(new Model(323, R.drawable.ic_bb, "Barbados"));
            list.add(new Model(323, R.drawable.ic_usa, "USA"));
            list.add(new Model(323, R.drawable.ic_cu, "Kuba"));

        } else if (4 == data) {
            list.add(new Model(323, R.drawable.ic_br, "Brazilia"));
            list.add(new Model(323, R.drawable.ic_ar, "Argerntina"));
            list.add(new Model(323, R.drawable.ic_pe, "Peru"));
            list.add(new Model(323, R.drawable.ic_cl, "Chili"));
            list.add(new Model(323, R.drawable.ic_ec, "Ecvador"));
            list.add(new Model(323, R.drawable.ic_bo, "Bolivia"));
            list.add(new Model(323, R.drawable.ic_uy, "Urugvai"));
            list.add(new Model(323, R.drawable.ic_py, "Paragvai"));
            list.add(new Model(323, R.drawable.ic_aw, "Aruba"));
            list.add(new Model(323, R.drawable.ic_co, "Kolumbia"));

        } else if (5 == data) {
            list.add(new Model(323, R.drawable.ic_fm, "Антарктида - это одноименный материк"));
        } else if (6 == data) {
            list.add(new Model(323, R.drawable.ic_ng, "Nigeria"));
            list.add(new Model(323, R.drawable.ic_ke, "Keniya"));
            list.add(new Model(323, R.drawable.ic_gh, "Gana"));
            list.add(new Model(323, R.drawable.ic_et, "Efiopiya"));
            list.add(new Model(323, R.drawable.ic_ma, "Marokko"));
            list.add(new Model(323, R.drawable.ic_sd, "Sudan"));
            list.add(new Model(323, R.drawable.ic_sn, "Senegal"));
            list.add(new Model(323, R.drawable.ic_ug, "Uganda"));
            list.add(new Model(323, R.drawable.ic_ml, "Mali"));
            list.add(new Model(323, R.drawable.ic_so, "Somali"));
        } else {
            Toast.makeText(this, "Error:", Toast.LENGTH_SHORT).show();
        }
        return list;
    }

    private void initRecycler() {
        recyclerView = findViewById(R.id.recyclerRv);
        adapter = new Adapter();
        recyclerView.setAdapter(adapter);
        adapter.setList(createList());

    }
}