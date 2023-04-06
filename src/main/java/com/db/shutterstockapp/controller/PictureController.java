package com.db.shutterstockapp.controller;

import com.db.shutterstockapp.entity.Picture;
import com.db.shutterstockapp.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/picture")
public class PictureController {

    @Autowired
    PictureService pictureService;

    @GetMapping("/id")
    public Picture getPictureById(@RequestParam(name = "id") int id){
        return pictureService.findById(id);
    }
}
