package com.example.raj2.Fregments;

import android.content.Context;
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
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.raj2.Adopter.CourseAdapter;
import com.example.raj2.Api.RetrofitClient;
import com.example.raj2.CompanyDetails;
import com.example.raj2.CourseModel;
import com.example.raj2.Models.car;
import com.example.raj2.R;
import com.example.raj2.modelResponse.FetchCar_CompanyResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class HomeFregment extends Fragment {

    private RecyclerView recyclerView;
    /*private RecyclerView.Adapter<Course>*/


    private Context context;
    // Arraylist for storing data
    private List<car> carList;
    private CourseAdapter courseAdapter;
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

        recyclerView = view.findViewById(R.id.idRVCarComapny);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));



        // here we have created new array list and added data to it.
       /* courseModelArrayList = new ArrayList<CourseModel>();
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
*/

        /*LinearLayoutManager linearLayoutManager= new LinearLayoutManager(context);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);*/





        //Retrofit
        Call<FetchCar_CompanyResponse> call= RetrofitClient.getInstance().getApi().fetchAllcarComapny();
        call.enqueue(new Callback<FetchCar_CompanyResponse>() {
            @Override
            public void onResponse(Call<FetchCar_CompanyResponse> call, Response<FetchCar_CompanyResponse> response) {
                if (response.isSuccessful()){
                    carList= response.body().getCarComapnylist();
                   // recyclerView.setAdapter(courseAdapter);

                    recyclerView.setAdapter(new CourseAdapter(getActivity(),carList));
                }
                else{
                    Toast.makeText(getActivity(), response.body().getError(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<FetchCar_CompanyResponse> call, Throwable t) {
                Toast.makeText(getActivity(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}