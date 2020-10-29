package com.note.back.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    private String username;
    private String password;
    private String salt;

}
