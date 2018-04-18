package com.example.balaji.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerview3);
        Bundle bundle=getIntent().getExtras();
        ArrayList<Product> arrayList = bundle.getParcelableArrayList("name");

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter customAdapter=new CustomAdapter(this,arrayList);
        recyclerView.setAdapter(customAdapter);
        //Toast.makeText(getApplicationContext(),productList.toString(),Toast.LENGTH_LONG).show();

    }
}
