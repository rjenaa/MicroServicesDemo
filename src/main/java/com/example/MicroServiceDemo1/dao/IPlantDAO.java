package com.example.MicroServiceDemo1.dao;

import com.example.MicroServiceDemo1.dto.Plant;

import java.io.IOException;
import java.util.List;

public interface IPlantDAO {
    List<Plant> fetchPlants(String combinedName) throws IOException;
}
