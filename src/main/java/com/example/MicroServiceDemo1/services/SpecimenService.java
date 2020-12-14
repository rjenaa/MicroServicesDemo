package com.example.MicroServiceDemo1.services;

import com.example.MicroServiceDemo1.dao.IPhotoDAO;
import com.example.MicroServiceDemo1.dao.IPlantDAO;
import com.example.MicroServiceDemo1.dao.ISpecimenDAO;
import com.example.MicroServiceDemo1.dto.Photo;
import com.example.MicroServiceDemo1.dto.Plant;
import com.example.MicroServiceDemo1.dto.Specimen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public class SpecimenService implements ISpecimenServices {
    @Autowired
    private ISpecimenDAO specimenDAO;

    @Autowired
    private IPlantDAO plantDAO;

    @Autowired
    private IPhotoDAO photoDAO;

    public SpecimenService() {

    }

    public SpecimenService(ISpecimenDAO specimenDAO) {

        this.specimenDAO = specimenDAO;
    }

    @Override
    public Specimen fetchById(int id) {
        Specimen foundSpecimen = specimenDAO.fetch(id);
        return foundSpecimen;
    }

    @Override
    @CacheEvict(value="specimen", key="#id")
    public void delete(int id) throws Exception {
        specimenDAO.delete(id);
    }

    @Override
    public Specimen save(Specimen specimen) throws Exception {
        return specimenDAO.save(specimen);
    }

    @Override
    public List<Specimen> fetchAll() {
        return specimenDAO.fetchAll();
    }

    @Override
    public List<Plant> fetchPlants(String combinedName) throws IOException {
        return plantDAO.fetchPlants(combinedName);
    }

    @Override
    public void saveImage(MultipartFile imageFile, Photo photo) throws IOException {
        photoDAO.save(photo);
        photoDAO.saveImage(imageFile, photo);

    }

    @Override
    public List<Specimen> fetchSpecimensByPlantId(int plantId) {
        return specimenDAO.fetchSpecimensByPlantId(plantId);
    }
}
