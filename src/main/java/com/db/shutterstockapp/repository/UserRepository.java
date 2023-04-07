package com.db.shutterstockapp.repository;

import com.db.shutterstockapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findById(int id);

    User findByUsername(String username);
}
