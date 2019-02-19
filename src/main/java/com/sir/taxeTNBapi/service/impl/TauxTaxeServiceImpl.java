/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeTNBapi.service.impl;

import com.sir.taxeTNBapi.bean.TauxTaxe;
import com.sir.taxeTNBapi.dao.TauxTaxeDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sir.taxeTNBapi.service.TauxTaxeService;

/**
 *
 * @author Macbook
 */
@Service
public class TauxTaxeServiceImpl implements TauxTaxeService{
    
    @Autowired
    TauxTaxeDao tauxTaxeDao;

    @Override
    public int creer(TauxTaxe tauxTaxe) {
        tauxTaxeDao.save(tauxTaxe);
        return 1;
    }

    @Override
    public TauxTaxe findByReference(String reference) {
        return tauxTaxeDao.findByReference(reference);
    }

    @Override
    public List<TauxTaxe> findByCategorieTnbReference(String reference) {
         return tauxTaxeDao.findByCategorieTnbReference(reference);
    }

    public TauxTaxeDao getTauxTaxeDao() {
        return tauxTaxeDao;
    }

    public void setTauxTaxeDao(TauxTaxeDao tauxTaxeDao) {
        this.tauxTaxeDao = tauxTaxeDao;
    }
    
}
