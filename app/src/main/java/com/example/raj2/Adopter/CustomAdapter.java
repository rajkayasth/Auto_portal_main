package com.example.raj2.Adopter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.raj2.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    Context context;
    private ArrayList<String> car,company,model,companyCar;
    private ArrayList<Integer> price;

    public CustomAdapter(Context context, ArrayList<String> car, ArrayList<String> company, ArrayList<String> model, ArrayList<String> companyCar, ArrayList<Integer> price) {
        this.context = context;
        this.car = car;
        this.company = company;
        this.model = model;
        this.companyCar= companyCar;
        this.price = price;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.custom,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.car.setText(String.valueOf(car.get(position)));
        holder.company.setText(String.valueOf(company.get(position)));
        holder.model.setText(String.valueOf(model.get(position)));
        holder.companyCar.setImageResource(Integer.parseInt(String  .valueOf(companyCar.get(position))));
        holder.price.setText(String.valueOf("Price : "+price.get(position)));
    }

    @Override
    public int getItemCount() {
        return car.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView car,model,price,company;
        ImageView companyCar;

        public MyViewHolder(View itemView) {
            super(itemView);
            car=itemView.findViewById(R.id.car);
            model=itemView.findViewById(R.id.model);
            company=itemView.findViewById(R.id.company);
            price=itemView.findViewById(R.id.price);
            companyCar=itemView.findViewById(R.id.companyCar);
        }
    }
}
