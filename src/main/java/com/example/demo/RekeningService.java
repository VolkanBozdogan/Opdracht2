package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class RekeningService {
    @Autowired
    private RekeningRepository rekeningRepository;

    public List<Rekening> GetRekeningen(){
        Rekening[] array = {
              new Rekening()
        };
        List<Rekening> rekeningen = Arrays.asList(array);
        return rekeningen;
    }

    public void AddRekening(String id, String naam, String iban, Double saldo){
        Rekening rekening = new Rekening(id, naam, iban, saldo);
        rekeningRepository.save(rekening);
    }

    public Optional<Rekening> GetRekening(String id){
        var rekening = rekeningRepository.findById(id);
        return rekening;
    }

    public void DeleteRekening(String iban){

    }
    public void AddRekeninghouder(String naam){

    }

    public void DeleteRekeninghouder(String naam){

    }

    public void BlokkeerRekening(String iban){

    }
}
