package com.example.MicroServiceDemo1.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Specimen {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int specimenId;
    private int plantId;
    private String latitude;
    private String longitude;
    private String description;

    @OneToMany(mappedBy = "specimen")
    private List<Photo> photos;

    public int getSpecimenId() {
        return specimenId;
    }

    public void setSpecimenId(int specimenId) {
        this.specimenId = specimenId;
    }

    public int getPlantId() {
        return plantId;
    }

    public void setPlantId(int plantId) {
        this.plantId = plantId;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }
}
