package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Rekening {
    @Id
    private String id;
    private String naam;
    private String iban;
    private Double saldo;
    @ManyToOne
    private Rekeninghouder rekeninghouders;
    private Boolean geblokkeerd;

    public Rekening(){}

    public Rekening(String id, String naam, String iban, Double saldo){
        this.id = id;
        this.naam = naam;
        this.iban = iban;
        this.saldo = saldo;
    }

}
