package com.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String f_name;

    @Column
    private String l_name;

    @Column
    private int age;

    @Column
    private String address;

}
