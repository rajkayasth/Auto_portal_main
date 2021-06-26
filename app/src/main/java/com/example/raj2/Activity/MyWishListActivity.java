package com.example.raj2.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.raj2.Adopter.cars;
import com.example.raj2.Adopter.wishlistAdopter;
import com.example.raj2.R;

public class MyWishListActivity extends AppCompatActivity {

    private RecyclerView rcWishlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_wish_list);

        rcWishlist = findViewById(R.id.RCWish);

        cars [] cars = new cars[12];


        cars[0]=new cars("Honda","City","250000","Kayasth","20-12-2018","male");
        cars[1]=new cars("Honda","City","250000","Kayasth","20-12-2018","male");
        cars[2]=new cars("Honda","City","250000","Kayasth","20-12-2018","male");

        cars[3]=new cars("Honda","City","250000","Kayasth","20-12-2018","male");
        cars[4]=new cars("Honda","City","250000","Kayasth","20-12-2018","male");
        cars[5]=new cars("Honda","City","250000","Kayasth","20-12-2018","male");

        cars[6]=new cars("Honda","City","250000","Kayasth","20-12-2018","male");
        cars[7]=new cars("Honda","City","250000","Kayasth","20-12-2018","male");
        cars[8]=new cars("Honda","City","250000","Kayasth","20-12-2018","male");

        cars[9]=new cars("Honda","City","250000","Kayasth","20-12-2018","male");
        cars[10]=new cars("Honda","City","250000","Kayasth","20-12-2018","male");
        cars[11]=new cars("Honda","City","250000","Kayasth","20-12-2018","male");


        wishlistAdopter wishlistAdopter = new wishlistAdopter();
        wishlistAdopter.setItems(cars);
        rcWishlist.setAdapter(wishlistAdopter);

    }
}