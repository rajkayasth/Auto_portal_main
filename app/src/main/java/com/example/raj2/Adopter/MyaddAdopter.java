package com.example.raj2.Adopter;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.raj2.R;

public class MyaddAdopter extends RecyclerView.Adapter<MyaddAdopter.ViewHolder>{
    @NonNull


    private adds[] adds;

    @Override
    public MyaddAdopter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {


        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View view=inflater.inflate(R.layout.item_on_myadds,viewGroup,false);
        return new ViewHolder(view);

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onBindViewHolder(@NonNull MyaddAdopter.ViewHolder holder, int position) {

        holder.data.setText(adds[position].getData());
        holder.price.setText(adds[position].getPrice());


    }

    @Override
    public int getItemCount() {
        return adds.length;
    }

    public void setItems(adds[] adds) {
        this.adds=adds;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView data;
        private final TextView price;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            data=itemView.findViewById(R.id.adds_data);
            price=itemView.findViewById(R.id.myadds_price);

        }
    }
}
