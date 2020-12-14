package com.example.MicroServiceDemo1.dao;

import com.example.MicroServiceDemo1.dto.Photo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface IPhotoDAO {
    void save(Photo photo);

    void saveImage(MultipartFile imageFile, Photo photo) throws IOException;
}
