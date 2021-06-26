package com.example.raj2.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.raj2.Adopter.MyaddAdopter;
import com.example.raj2.Adopter.adds;
import com.example.raj2.Adopter.cars;
import com.example.raj2.Adopter.wishlistAdopter;
import com.example.raj2.R;

public class MyAddsActivity extends AppCompatActivity {

    private RecyclerView rcMyadds;
    private LinearLayout llm;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_adds);

        rcMyadds = findViewById(R.id.RC_myadd);
        LinearLayoutManager manager = new LinearLayoutManager(this);

        adds[]adds = new adds[3];

        adds[0]=new adds("Raj","100000");
        adds[1]=new adds("parth","200000");
        adds[2]=new adds("Dinesh","300000");

        rcMyadds.setLayoutManager(manager);
        rcMyadds.setHasFixedSize(true);
        MyaddAdopter myaddAdopter = new MyaddAdopter();

        myaddAdopter.setItems(adds);
        rcMyadds.setAdapter(myaddAdopter);


    }
}