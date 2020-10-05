package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rekeninghouder {
    @Id
    int id;
    private String naam;
}
