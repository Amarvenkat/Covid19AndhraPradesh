package com.amar.covid19andhrapradesh.ApiInterface;

import com.amar.covid19andhrapradesh.RetrofitClass.TelanganaStateWise;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiDistrictData {

    @GET("state_district_wise.json")
    Call<TelanganaStateWise> getDistrictData();

}
