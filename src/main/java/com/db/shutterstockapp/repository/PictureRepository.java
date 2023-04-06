package com.db.shutterstockapp.repository;

import com.db.shutterstockapp.entity.Picture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PictureRepository extends JpaRepository<Picture, Integer> {
    Picture findById(int id);
}
