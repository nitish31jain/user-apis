package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Entity(name = "User")
public class User {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "name")
    private String name;
}