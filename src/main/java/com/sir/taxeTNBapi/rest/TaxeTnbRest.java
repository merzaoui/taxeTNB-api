
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeTNBapi.rest;

import com.sir.taxeTNBapi.bean.TaxeTnb;
import com.sir.taxeTNBapi.service.TaxeTnbService;
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
@RequestMapping({"/taxeTnb-api/TaxeTnb"})
public class TaxeTnbRest {
    @Autowired
    TaxeTnbService taxeTnbService;
    @GetMapping("/taxe")
    public TaxeTnb findByReference(String reference) {
        return taxeTnbService.findByReference(reference);
    }
     @GetMapping("/listTaxe/")
    public List<TaxeTnb> FindByTerrainReference(String reference) {
        return taxeTnbService.FindByTerrainReference(reference);
    }

    @PostMapping("/")
    public int creer(TaxeTnb taxeTnb) {
        return taxeTnbService.creer(taxeTnb);
    }

    public TaxeTnbService getTaxeTnbService() {
        return taxeTnbService;
    }

    public void setTaxeTnbService(TaxeTnbService taxeTnbService) {
        this.taxeTnbService = taxeTnbService;
    }
    
    
}
