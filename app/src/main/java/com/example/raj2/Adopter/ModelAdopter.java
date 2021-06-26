package com.example.raj2.Adopter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
;
import com.example.raj2.Fregments.HomeFregment;
import com.example.raj2.R;

import java.util.ArrayList;


public class ModelAdopter extends RecyclerView.Adapter<ModelAdopter.ViewHolder> {

    private Context context;
    private car_model [] car_model;
    private ArrayList<car_model> carModelArrayList;


    public ModelAdopter(Context context,car_model[] car_model) {
        this.context = context;
        this.car_model = car_model;
        this.carModelArrayList = carModelArrayList;

    }


    @Override
    public ModelAdopter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup viewGroup, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View view=inflater.inflate(R.layout.item_car_model,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  ModelAdopter.ViewHolder holder, int position) {


        holder.model.setImageResource(car_model[position].getModel_image());
        holder.model_name.setText(car_model[position].getCourse_model());
        holder.Com_img.setImageResource(car_model[position].getCom_image());

  /*      holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, HomeFregment.class);

                context.startActivity(intent);

            }

        });
*/
    }


    @Override
    public int getItemCount() {
        return car_model.length;
    }

    public void setItems(car_model[] car_model) {
        this.car_model=car_model;
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView Com_img;
        private ImageView model;
        private TextView model_name;

        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            model=itemView.findViewById(R.id.modelLogo);
            model_name=itemView.findViewById(R.id.ModelName);
            Com_img=itemView.findViewById(R.id.Com_Image);




        }
    }
}
