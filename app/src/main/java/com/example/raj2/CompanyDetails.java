package com.example.raj2;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import com.example.raj2.Adopter.CustomAdapter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class CompanyDetails extends AppCompatActivity {

    private ArrayList<String> car,company_list,model,companyCar;
    private ArrayList<Integer> price;
    private static Connection conn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company);
        car=new ArrayList<String>();
        model=new ArrayList<String>();
        company_list=new ArrayList<String>();
        companyCar=new ArrayList<>();
        price=new ArrayList<Integer>();
//        Connection con=ConnectionManager.open_conn();

        Bundle bundle=getIntent().getExtras();
        String com=bundle.getString("company");
//        System.out.println("================>"+com);

        populate_list(conn,com);
        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),car,company_list,model,companyCar,price);
        RecyclerView recyclerView=findViewById(R.id.recyler);
        recyclerView.setAdapter(customAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));



    }

    public void populate_list(Connection c,String name){

        try {
            String query="Select * from car_company where company_id=?";
            PreparedStatement preparedStatement=c.prepareStatement(query);
            preparedStatement.setString(1,name);

            ResultSet rs=preparedStatement.executeQuery();
            if(rs.next()){
                int company =rs.getInt("company_id");
                String cname=rs.getString("company");
                String query1="Select * from car where company=?";
                PreparedStatement ps=c.prepareStatement(query1);
                ps.setInt(1,company);
                rs=ps.executeQuery();
                while (rs.next()){
                car.add("Name : "+rs.getString("Name"));
                company_list.add("Company : "+cname);
                model.add("Model : "+rs.getString("model"));
                price.add(rs.getInt("price"));
            }
            }

//            while (rs.next()){
//                car.add("Name : "+rs.getString("Name"));
//                company.add("Company : "+rs.getString("company"));
//                model.add("Model : "+rs.getString("model"));
//                price.add(rs.getInt("price"));
//            }
        }catch (Exception e){
            e.printStackTrace();
        }



    }


}
