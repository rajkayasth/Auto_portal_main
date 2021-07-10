package com.example.raj2.Adopter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.raj2.Activity.Car_detail_Class;
import com.example.raj2.Activity.Carlist;
import com.example.raj2.Activity.LoginActivity;
import com.example.raj2.Activity.ModelActivity;
import com.example.raj2.Activity.MyWishListActivity;
import com.example.raj2.Activity.ProfileActivity;
import com.example.raj2.CourseModel;
import com.example.raj2.Models.car;
import com.example.raj2.R;

import java.util.ArrayList;
import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.Viewholder> {

    private Context context;
    private List<car> carComapnylist;
    //private ItemClickListener itemClickListener;

    // Constructor
    public CourseAdapter(Context context, List<car> carComapnylist) {
        this.context = context;
        this.carComapnylist = carComapnylist;
        //this.itemClickListener=item;
    }

    @NonNull
    @Override
    public CourseAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.cardlayout,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseAdapter.Viewholder holder, int position) {
        // to set data to textview and imageview of each card layout
        holder.courseNameTV.setText(carComapnylist.get(position).getCompany());
       // holder.courseIV.setImageResource(model.getCourse_image());
        /*
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, ModelActivity.class);

                context.startActivity(intent);

            }

        });
*/
//        Log.i("Company",model.getCourse_name().toString());
       /* holder.itemView.setOnClickListener(view -> {
            itemClickListener.onItemClick(courseModelArrayList.get(position));
        });*/

    }

    public void setItems(List<car> carComapnylist) {
        this.carComapnylist=carComapnylist;
    }

    public interface ItemClickListener {
        void onItemClick(CourseModel model);
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return carComapnylist.size();
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView courseIV;
        private TextView courseNameTV, courseRatingTV;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
           // courseIV = itemView.findViewById(R.id.idIVCourseImage);
            courseNameTV = itemView.findViewById(R.id.idTVCourseName);
        }
    }
}


