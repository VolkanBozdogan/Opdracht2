package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class RekeningController {
    @Autowired
    RekeningService rekeningService;

    @RequestMapping("/GetRekeningen")
    public List<Rekening> GetRekeningen(){
        return rekeningService.GetRekeningen();
    }

    @RequestMapping("/GetRekening/{iban}")
    public Optional<Rekening> GetRekening(String id){
        return rekeningService.GetRekening(id);
    }

    @RequestMapping("/AddRekening/{id}/{naam}/{iban}/{saldo}")
    public void AddRekening(
            @PathVariable("id") String id,
            @PathVariable("naam") String naam,
            @PathVariable("iban") String iban,
            @PathVariable("saldo") Double saldo)
    {
        rekeningService.AddRekening(id, naam, iban, saldo);
    }

    @RequestMapping("/DeleteRekening/{iban}")
    public void DeleteRekening(
        @PathVariable("iban") String iban)
    {
        rekeningService.DeleteRekening(iban);
    }

    @RequestMapping("/AddRekeninghouder/{naam}")
    public void AddRekeninghouder(
            @PathVariable("rekeninghouder") String naam){
        rekeningService.AddRekeninghouder(naam);
    }

    @RequestMapping("DeleteRekeninghouder/{naam}")
    public void DeleteRekeninghouder(
            @PathVariable("rekeninghouder") String naam){
        rekeningService.DeleteRekeninghouder(naam);
    }


    @RequestMapping("/BlokkeerRekening/{iban}")
    public void BlokkeerRekening(
            @PathVariable("iban") String iban){
        rekeningService.BlokkeerRekening(iban);

    }
}
