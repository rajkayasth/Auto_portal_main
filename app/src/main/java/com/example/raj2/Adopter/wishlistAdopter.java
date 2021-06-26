package com.example.raj2.Adopter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.raj2.R;

public class wishlistAdopter extends RecyclerView.Adapter<wishlistAdopter.ViewHolder> {

    private cars[] cars;
    @Override
    public wishlistAdopter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup viewGroup, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View view=inflater.inflate(R.layout.item_card_wishlist,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  wishlistAdopter.ViewHolder holder, int position) {

        holder.car_name.setText(cars[position].getCar_name());
        holder.model.setText(cars[position].getModel());
        holder.price.setText(cars[position].getPrice());
        holder.lastname.setText(cars[position].getLast_Name());
        holder.dob.setText(cars[position].getDate_of_Register());
        holder.gender.setText(cars[position].getGender());
    }



    @Override
    public int getItemCount() {
        return cars.length;
    }

    public void setItems(cars[] cars) {
        this.cars=cars;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView car_name;
        private final TextView model;
        private final TextView price;
        private final TextView lastname;
        private final TextView dob;
        private final TextView gender;
        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            car_name=itemView.findViewById(R.id.tvcarname);
            model=itemView.findViewById(R.id.tvmodelid);
            price=itemView.findViewById(R.id.tvpriceid);
            lastname=itemView.findViewById(R.id.tvlnameid);
            dob=itemView.findViewById(R.id.tvDob);
            gender=itemView.findViewById(R.id.tvgender);


        }
    }
}
