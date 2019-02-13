/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeTNBapi.rest;

import com.sir.taxeTNBapi.bean.CategorieTnb;
import com.sir.taxeTNBapi.service.CategorieTnbService;
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
@RequestMapping({"/taxeTnb-api/categorieTnb"})
public class CategorieTnbRest {
    

    @Autowired
    CategorieTnbService categorieTnbService;

    @GetMapping
    public CategorieTnb findByReference(String reference) {
        return categorieTnbService.findByReference(reference);
    }
    @PostMapping
    public int creer(CategorieTnb categorieTnb) {
        return categorieTnbService.creer(categorieTnb);
    }
    
    

    public CategorieTnbService getCategorieTnbService() {
        return categorieTnbService;
    }

    public void setCategorieTnbService(CategorieTnbService categorieTnbService) {
        this.categorieTnbService = categorieTnbService;
    }
    
    
    
    
}
