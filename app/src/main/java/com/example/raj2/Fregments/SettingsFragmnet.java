package com.example.raj2.Fregments;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.raj2.Activity.MyAddsActivity;
import com.example.raj2.Activity.MyWishListActivity;
import com.example.raj2.Activity.ProfileActivity;
import com.example.raj2.R;


public class SettingsFragmnet extends Fragment {

    TextView pro,logout,my_pro,my_wishlist;
    SharedPreferences prf;
    LinearLayout lc1,lc2;
    Animation topbottom,bottomtop;
    private static final String PREF = "1";
    private static final String id = "userid";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        pro= view.findViewById(R.id.pro);
        logout= view.findViewById(R.id.logout);
        my_pro= view.findViewById(R.id.my_pro);
        my_wishlist= view.findViewById(R.id.my_wishlist);
        lc1= view.findViewById(R.id.lc1);
        lc2= view.findViewById(R.id.lc2);

        my_wishlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity().getApplication(), MyWishListActivity.class);
                startActivity(i);
            }
        });

        my_pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity().getApplication(), MyAddsActivity.class);
                startActivity(i);
            }
        });

        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity().getApplication(), ProfileActivity.class);
                startActivity(i);
            }
        });
        return view;
    }
}