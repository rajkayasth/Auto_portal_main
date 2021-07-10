package com.example.raj2.Api;

import com.example.raj2.modelResponse.FetchCar_CompanyResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;

public interface Api {

    @GET("fetchCar_company.php")
    Call<FetchCar_CompanyResponse> fetchAllcarComapny();

}
