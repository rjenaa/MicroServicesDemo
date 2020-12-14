package com.example.MicroServiceDemo1.dto;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="photos")
@Data
public class Photo {

    @Id
    @GeneratedValue
    private int photoId;
    private String photographer;
    private String path;
    private String fileName;
    private String comments;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name="specimen_id")
    private Specimen specimen;

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getPhotographer() {
        return photographer;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Specimen getSpecimen() {
        return specimen;
    }

    public void setSpecimen(Specimen specimen) {
        this.specimen = specimen;
    }
}
