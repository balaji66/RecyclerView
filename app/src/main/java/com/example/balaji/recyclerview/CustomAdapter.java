package com.example.balaji.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;
/**
 * Created by Balaji on 26-03-2018.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>
{
        /*MyViewHolder v1;*/
    List<Product> productList;
    Context context;
    public CustomAdapter(Context context,List<Product> productList) {
        this.context=context;
        this.productList= (ArrayList) productList;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layout= LayoutInflater.from(context);
        View v= layout.inflate(R.layout.rowlayout,parent,false);
        MyViewHolder vh =new MyViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder,final int position) {
        Product product=productList.get(position);
        holder.name.setText(product.getName());
        holder.surname.setText(product.getSurname());
        holder.image1.setImageDrawable(context.getResources().getDrawable(product.getImage()));
        /* holder.name.setText((CharSequence) productList.get(position));
     holder.itemView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Toast.makeText(context, (CharSequence) productList.get(position),Toast.LENGTH_LONG).show();
        }
     });*/
    }
    @Override
    public int getItemCount() {
        return productList.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView surname;
        ImageView image1;
        public MyViewHolder(View itemview)
        {
            super(itemview);
            name=(TextView)itemView.findViewById(R.id.name);
            surname=(TextView)itemView.findViewById(R.id.surname);
            image1=(ImageView)itemView.findViewById(R.id.image1);
        }
    }
}

