package com.amar.covid19andhrapradesh.ApiInterface;

import com.amar.covid19andhrapradesh.RetrofitClass.Covid19Main;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiCovid19 {

    @GET("data.json")
    Call<Covid19Main> getReport();
}
