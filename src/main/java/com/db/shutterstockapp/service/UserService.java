package com.db.shutterstockapp.service;

import com.db.shutterstockapp.entity.User;
import com.db.shutterstockapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User findById(int id){
        return userRepository.findById(id);
    }


}
