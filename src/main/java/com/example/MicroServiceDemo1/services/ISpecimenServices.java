package com.example.MicroServiceDemo1.services;

import com.example.MicroServiceDemo1.dto.Photo;
import com.example.MicroServiceDemo1.dto.Plant;
import com.example.MicroServiceDemo1.dto.Specimen;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ISpecimenServices {

    Specimen fetchById(int id);

    void delete(int id) throws Exception;

    Specimen save(Specimen specimen) throws Exception;

    List<Specimen> fetchAll();

    List<Plant> fetchPlants(String combinedName) throws IOException;

    void saveImage(MultipartFile imageFile, Photo photo) throws IOException;

    List<Specimen> fetchSpecimensByPlantId(int plantId);
}
