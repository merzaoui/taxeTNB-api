/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeTNBapi.service.impl;

import com.sir.taxeTNBapi.bean.CategorieTnb;
import com.sir.taxeTNBapi.bean.TaxeTnb;
import com.sir.taxeTNBapi.dao.CategorieTnbDao;
import com.sir.taxeTNBapi.dao.TaxeTnbDao;
import com.sir.taxeTNBapi.service.CategorieTnbService;
import com.sir.taxeTNBapi.service.TaxeTnbService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Macbook
 */
@Service
public class TaxeTnbServiceImpl implements TaxeTnbService{
    
    @Autowired
    TaxeTnbDao taxeTnbDao;
    
    @Override
    public TaxeTnb findByReference(String reference) {
        return taxeTnbDao.findByReference(reference);
    }

    @Override
    public List<TaxeTnb> FindByTerrainReference(String reference) {
        return taxeTnbDao.FindByTerrainReference(reference);
    }

    @Override
    public int creer(TaxeTnb taxeTnb) {
        taxeTnbDao.save(taxeTnb);
        return 1;
    }

    public TaxeTnbDao getTaxeTnbDao() {
        return taxeTnbDao;
    }

    public void setTaxeTnbDao(TaxeTnbDao taxeTnbDao) {
        this.taxeTnbDao = taxeTnbDao;
    }

    
    
}
