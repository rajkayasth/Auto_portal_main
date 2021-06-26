package com.example.raj2;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {

    public static final String driver="com.mysql.jdbc.Driver";
    public static final String url="jdbc:mysql://192.168.43.155/auto-portal";
    public static final String user="root";
    public static final String pass="";


    public static Connection open_conn(){
        StrictMode.ThreadPolicy policy=new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection con=null;

        try{
            Class.forName(driver);
            con= DriverManager.getConnection(url,user,pass);
            Log.i("Connection","successfully");
        }catch (Exception e){
            Log.i("Connection",e.getLocalizedMessage());
        }
        return con;

    }

}
