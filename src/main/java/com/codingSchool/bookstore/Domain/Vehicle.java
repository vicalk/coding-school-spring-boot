package com.codingSchool.bookstore.Domain;

import java.io.Serializable;

import javax.persistence.*;


@Entity
public class Vehicle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String plateNo;

    @Column
    private String model;

    @Column
    private String year;

    @Column
    private String color;

    @Column(nullable = false)
    private String afm;




}

