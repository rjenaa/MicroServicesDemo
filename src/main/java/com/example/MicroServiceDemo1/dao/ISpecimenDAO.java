package com.example.MicroServiceDemo1.dao;


import com.example.MicroServiceDemo1.dto.Specimen;

import java.util.List;


public interface ISpecimenDAO {

    Specimen save(Specimen specimen) throws Exception;

    List<Specimen> fetchAll();

    Specimen fetch(int id);

    void delete(int id);

    List<Specimen> fetchSpecimensByPlantId(int plantId);
}
