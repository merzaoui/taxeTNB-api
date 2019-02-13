/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeTNBapi.rest;

import com.sir.taxeTNBapi.bean.TauxTaxe;
import com.sir.taxeTNBapi.service.TauxTaxeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Macbook
 */
@RestController
@RequestMapping({"/taxeTnb-api/tauxtaxeTnb"})
public class TauxTaxeRest {
    
    @Autowired
    TauxTaxeService tauxTaxeService;

    @PostMapping("/save/")
    public int creer(TauxTaxe tauxTaxe) {
        return tauxTaxeService.creer(tauxTaxe);
    }

    @GetMapping("/Taux/")
    public TauxTaxe findByReference(String reference) {
        return tauxTaxeService.findByReference(reference);
    }

    @GetMapping("/listtaux/")
    public List<TauxTaxe> FindByCategorieReference(String reference) {
        return tauxTaxeService.FindByCategorieReference(reference);
    }

    public TauxTaxeService getTauxTaxeService() {
        return tauxTaxeService;
    }

    public void setTauxTaxeService(TauxTaxeService tauxTaxeService) {
        this.tauxTaxeService = tauxTaxeService;
    }
    
}
