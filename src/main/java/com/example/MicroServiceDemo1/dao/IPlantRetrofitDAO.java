package com.example.MicroServiceDemo1.dao;


import com.example.MicroServiceDemo1.dto.Plant;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;


public interface IPlantRetrofitDAO {

    @GET("/plants.json")
    Call<List<Plant>> getPlants(@Query("Combined_Name") String combinedName);
}
