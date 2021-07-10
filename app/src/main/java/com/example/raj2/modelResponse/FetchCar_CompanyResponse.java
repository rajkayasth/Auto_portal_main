package com.example.raj2.modelResponse;

import com.example.raj2.CourseModel;
import com.example.raj2.Models.car;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FetchCar_CompanyResponse {
    @SerializedName("car_company")
    List<car> carComapnylist;

    public List<car> getCarComapnylist() {
        return carComapnylist;
    }

    public void setCarComapnylist(List<car> carComapnylist) {
        this.carComapnylist = carComapnylist;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public FetchCar_CompanyResponse(List<car> carComapnylist, String error) {
        this.carComapnylist = carComapnylist;
        this.error = error;
    }

    String error;
}
