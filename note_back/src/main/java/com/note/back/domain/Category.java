package com.note.back.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    private String name;

}
