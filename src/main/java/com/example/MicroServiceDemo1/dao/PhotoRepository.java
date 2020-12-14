package com.example.MicroServiceDemo1.dao;

import com.example.MicroServiceDemo1.dto.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotoRepository extends CrudRepository<Photo, Integer> {
}
