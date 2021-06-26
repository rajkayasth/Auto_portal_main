package com.example.raj2.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.raj2.Adopter.CourseAdapter;
import com.example.raj2.Adopter.ModelAdopter;
import com.example.raj2.Adopter.car_model;
import com.example.raj2.Adopter.cars;
import com.example.raj2.Adopter.wishlistAdopter;

import com.example.raj2.CompanyDetails;
import com.example.raj2.CourseModel;
import com.example.raj2.R;

public class ModelActivity<modelAdaptor> extends AppCompatActivity {

    private RecyclerView models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model);

        models = findViewById(R.id.rcmodel);

        car_model[] car_model = new car_model[5];


        car_model[0] = new car_model("Yaris", R.drawable.toyota,R.drawable.toyota);
        car_model[1] = new car_model("Camaro", R.drawable.chevrolet,R.drawable.chevrolet);
        car_model[2] = new car_model("I20", R.drawable.hyundai,R.drawable.hyundai);
        car_model[3] = new car_model("Edge", R.drawable.ford,R.drawable.ford);
        car_model[4] = new car_model("Xuv", R.drawable.mahindra,R.drawable.mahindra);


        ModelAdopter modelAdopter = new ModelAdopter(this,car_model);

        modelAdopter.setItems(car_model);

        models.setAdapter(modelAdopter);
    }
}