package com.example.raj2.Fregments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.raj2.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SellCarFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SellCarFragment extends Fragment {



    public SellCarFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SellCar.
     */
    // TODO: Rename and change types and number of parameters
    public static SellCarFragment newInstance(String param1, String param2) {
        SellCarFragment fragment = new SellCarFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sell_car, container, false);
    }
}