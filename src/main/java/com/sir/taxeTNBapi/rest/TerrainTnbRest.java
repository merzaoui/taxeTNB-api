/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeTNBapi.rest;

import com.sir.taxeTNBapi.bean.TerrainTnb;
import com.sir.taxeTNBapi.service.TerrainTnbService;
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
@RequestMapping({"/taxeTnb-api/terrainTnb"})
public class TerrainTnbRest {
    
    @Autowired
    TerrainTnbService terrainTnbService;
 
    @GetMapping("/reference/")
    public TerrainTnb findByReference(String reference) {
        return terrainTnbService.findByReference(reference);
    }
    
    @GetMapping("/listTerrain/")
    public List<TerrainTnb> FindByCategorieReference(String reference) {
        return terrainTnbService.FindByCategorieReference(reference);
    }
     @PostMapping("/")
    public int creer(TerrainTnb terrainTnb) {
        return terrainTnbService.creer(terrainTnb);
    }

    public TerrainTnbService getTerrainTnbService() {
        return terrainTnbService;
    }

    public void setTerrainTnbService(TerrainTnbService terrainTnbService) {
        this.terrainTnbService = terrainTnbService;
    }
    
    
    
    
}
