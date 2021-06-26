package com.example.raj2.Fregments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.raj2.Adopter.CourseAdapter;
import com.example.raj2.CompanyDetails;
import com.example.raj2.CourseModel;
import com.example.raj2.R;

import java.util.ArrayList;


public class HomeFregment extends Fragment {

    private RecyclerView courseRV;
    /*private RecyclerView.Adapter<Course>*/



    // Arraylist for storing data
    private ArrayList<CourseModel> courseModelArrayList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        courseRV = view.findViewById(R.id.idRVCourse);




        // here we have created new array list and added data to it.
        courseModelArrayList = new ArrayList<CourseModel>();
        courseModelArrayList.add(new CourseModel("Maruti Suzuki", R.drawable.marutisuzuki));
        courseModelArrayList.add(new CourseModel("Hyundai",  R.drawable.hyundai));
        courseModelArrayList.add(new CourseModel("Mahindra",  R.drawable.mahindra));
        courseModelArrayList.add(new CourseModel("Toyota",  R.drawable.toyota));
        courseModelArrayList.add(new CourseModel("Tata Motors",  R.drawable.tata));
        courseModelArrayList.add(new CourseModel("Honda",  R.drawable.honda2));
        courseModelArrayList.add(new CourseModel("Ford", R.drawable.ford));
        courseModelArrayList.add(new CourseModel("Renault",  R.drawable.renault));
        courseModelArrayList.add(new CourseModel("Volkswagen",  R.drawable.volkswagen));
        courseModelArrayList.add(new CourseModel("Kia",  R.drawable.kia));
        courseModelArrayList.add(new CourseModel("Nissan",  R.drawable.nissan));
        courseModelArrayList.add(new CourseModel("Skoda", R.drawable.skoda));
        courseModelArrayList.add(new CourseModel("MG Motors",  R.drawable.mg));
        courseModelArrayList.add(new CourseModel("Audi", R.drawable.audi));
        courseModelArrayList.add(new CourseModel("BMW",  R.drawable.bmw));
        courseModelArrayList.add(new CourseModel("Mercedes-Benz ",  R.drawable.mercedes));
        courseModelArrayList.add(new CourseModel("Chevrolet",  R.drawable.chevrolet));
        courseModelArrayList.add(new CourseModel("Isuzu",  R.drawable.isuzu));
        courseModelArrayList.add(new CourseModel("Jeep",  R.drawable.jeep));





        // we are initializing our adapter class and passing our arraylist to it.
        CourseAdapter courseAdapter = new CourseAdapter(requireContext(), courseModelArrayList, new CourseAdapter.ItemClickListener() {
            @Override
            public void onItemClick(CourseModel model) {

                Intent intent=new Intent(view.getContext(),CompanyDetails.class);
                intent.putExtra("company",model.getCourse_name());
                startActivity(intent);
            }
        });

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireActivity(), LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(courseAdapter);
    }
}