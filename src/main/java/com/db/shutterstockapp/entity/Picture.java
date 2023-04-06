package com.db.shutterstockapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pictures")
@Getter
@Setter
@NoArgsConstructor
public class Picture {

    @Id
    @GeneratedValue
    int id;
    @Column(name = "file_name")
    String fileName;

}
