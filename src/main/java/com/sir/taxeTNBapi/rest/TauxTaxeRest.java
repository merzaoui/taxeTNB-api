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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Macbook
 */
@RestController
@RequestMapping({"/taxeTnb-api/tauxtaxes"})
public class TauxTaxeRest {
    
    @Autowired
    TauxTaxeService tauxTaxeService;

    @PostMapping("/")
    public int creer(@RequestBody TauxTaxe tauxTaxe) {
        return tauxTaxeService.creer(tauxTaxe);
    }

    @GetMapping("/reference/{reference}")
    public TauxTaxe findByReference(@PathVariable String reference) {
        return tauxTaxeService.findByReference(reference);
    }

    @GetMapping("/referenceCategorie/{reference}")
    public List<TauxTaxe> findByCategorieTnbReference(@PathVariable String reference) {
        return tauxTaxeService.findByCategorieTnbReference(reference);
    }

    public TauxTaxeService getTauxTaxeService() {
        return tauxTaxeService;
    }

    public void setTauxTaxeService(TauxTaxeService tauxTaxeService) {
        this.tauxTaxeService = tauxTaxeService;
    }
    
}
