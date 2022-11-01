package com.ideaco.dia.backendproject.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "tab_sophia")
public class PersonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int personId;
    @Column(name = "name")
    private String name;
    @Column(name = "job")
    private String job;
    @Column(name = "age")
    private int age;
    @Column(name = "address")
    private String address;

}
