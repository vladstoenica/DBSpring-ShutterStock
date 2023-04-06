package com.db.shutterstockapp.service;

import com.db.shutterstockapp.entity.Picture;
import com.db.shutterstockapp.repository.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PictureService {

    @Autowired
    PictureRepository pictureRepository;

    public Picture findById(int id){
        return pictureRepository.findById(id);
    }

}
