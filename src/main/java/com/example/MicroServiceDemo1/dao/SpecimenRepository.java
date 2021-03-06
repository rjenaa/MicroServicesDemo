package com.example.MicroServiceDemo1.dao;

import com.example.MicroServiceDemo1.dto.Specimen;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@Profile("!test")
public interface SpecimenRepository extends CrudRepository<Specimen, Integer> {
    List<Specimen> findByPlantId(int plantId);
}
