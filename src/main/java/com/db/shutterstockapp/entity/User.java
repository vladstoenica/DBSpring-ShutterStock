package com.db.shutterstockapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    int id;
    @Column(name = "username", unique = true)
    String username;
    @Column(name = "password")
    String password;
    @Enumerated(EnumType.STRING)
    Role role;
}
