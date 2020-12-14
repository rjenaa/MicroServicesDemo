package com.example.MicroServiceDemo1.dao;

import com.example.MicroServiceDemo1.dto.Plant;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

public class PlantDAO implements IPlantDAO{

    @Override
    public List<Plant> fetchPlants(String combinedName) throws IOException {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();
        IPlantRetrofitDAO plantRetrofitDAO = retrofitInstance.create(IPlantRetrofitDAO.class);
        Call<List<Plant>> allPlants = plantRetrofitDAO.getPlants(combinedName);
        Response<List<Plant>> execute = allPlants.execute();
        List<Plant> plants = execute.body();
        return plants;

    }
}
