/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeTNBapi.service.impl;

import com.sir.taxeTNBapi.bean.TerrainTnb;
import com.sir.taxeTNBapi.dao.TerrainTnbDao;
import com.sir.taxeTNBapi.service.TerrainTnbService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Macbook
 */
@Service
public class TerrainTnbServiceImpl implements TerrainTnbService{

    @Autowired
    TerrainTnbDao terrainTnbDao;
    
    @Override
    public TerrainTnb findByReference(String reference) {
     return terrainTnbDao.findByReference(reference);
    }

    @Override
    public List<TerrainTnb> findByCategorieTnbReference(String reference) {
        return terrainTnbDao.findByCategorieTnbReference(reference);
    }

    @Override
    public int creer(TerrainTnb terrainTnb) {
        terrainTnbDao.save(terrainTnb);
        return 1;
    }

    public TerrainTnbDao getTerrainTnbDao() {
        return terrainTnbDao;
    }

    public void setTerrainTnbDao(TerrainTnbDao terrainTnbDao) {
        this.terrainTnbDao = terrainTnbDao;
    }
    
}
