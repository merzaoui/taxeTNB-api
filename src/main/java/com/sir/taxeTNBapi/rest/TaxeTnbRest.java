
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeTNBapi.rest;

import com.sir.taxeTNBapi.bean.TauxTaxe;
import com.sir.taxeTNBapi.bean.TaxeTnb;
import com.sir.taxeTNBapi.bean.TerrainTnb;
import com.sir.taxeTNBapi.service.TaxeTnbService;
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
@RequestMapping({"/taxeTnb-api/TaxeTnbs"})
public class TaxeTnbRest {
    @Autowired
    TaxeTnbService taxeTnbService;
   
    @PostMapping("/")
    public int creerTaxe(@RequestBody TaxeTnb taxeTnb, TerrainTnb terrainTnb, TauxTaxe tauxTaxe) {
        return taxeTnbService.creerTaxe(taxeTnb, terrainTnb, tauxTaxe);
    }
    @GetMapping("/reference/{reference}")
    public TaxeTnb findByReference(@PathVariable String reference) {
        return taxeTnbService.findByReference(reference);
    }
     @GetMapping("/listTaxe/{reference}")
    public List<TaxeTnb> findByTerrainTnbReference(@PathVariable String reference) {
        return taxeTnbService.findByTerrainTnbReference(reference);
    }


    public TaxeTnbService getTaxeTnbService() {
        return taxeTnbService;
    }

    public void setTaxeTnbService(TaxeTnbService taxeTnbService) {
        this.taxeTnbService = taxeTnbService;
    }
    
    
}
