package com.example.balaji.recyclerview;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
/*
ArrayList personsList=new ArrayList<>(Arrays.asList("person1","person2","person3","person4","person5","person6","person7","person8","person9","person10","person11","person12","person13","person14"));
*/
Button btn;
List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get the reference of recycler view
        RecyclerView recyclerView=findViewById(R.id.recyclerview);
        // set the linerLayoutManager with default orientation
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
       // linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        productList=new ArrayList<>();
        productList.add(new Product("balaji","pusuluri",R.drawable.img1));
        productList.add(new Product("arun","slfjdslfj",R.drawable.image2));
        /*productList.add(new Product("vimal","ksdfs"));
        productList.add(new Product("kiran","skjfsd"));
        productList.add(new Product("sandeep","jjfjsf"));
        productList.add(new Product("naveen","ffsdlfjl"));
        productList.add(new Product("lakshmi","kdjkhfk"));
        productList.add(new Product("nalini","skjjfhk"));
        productList.add(new Product("sony","kjfhsdf"));
        productList.add(new Product("srividya","kshkfs"));
*/
        btn=(Button)findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Main3Activity.class);
                intent.putParcelableArrayListExtra("name", (ArrayList<? extends Parcelable>) productList);
                startActivity(intent);
            }
        });
        CustomAdapter customAdapter=new CustomAdapter(this, (ArrayList<Product>) productList);
        recyclerView.setAdapter(customAdapter);


    }

}
