/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeTNBapi.service.impl;

import com.sir.taxeTNBapi.bean.TauxTaxe;
import com.sir.taxeTNBapi.bean.TaxeTnb;
import com.sir.taxeTNBapi.bean.TerrainTnb;
import com.sir.taxeTNBapi.dao.TaxeTnbDao;
import com.sir.taxeTNBapi.service.TaxeTnbService;
import com.sir.taxeTNBapi.service.TerrainTnbService;
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
     
 
     @Autowired
     TerrainTnbService terrainTnbService;
     
    @Override
    public TaxeTnb findByReference(String reference) {
        return taxeTnbDao.findByReference(reference);
    }

    @Override
    public List<TaxeTnb> findByTerrainTnbReference(String reference) {
        return taxeTnbDao.findByTerrainTnbReference(reference); 
    }


     @Override
    public int creerTaxe(TaxeTnb taxeTnb,TerrainTnb terrainTnb,TauxTaxe tauxTaxe) {
        
        int res = 0;
        TerrainTnb t= terrainTnbService.findByReference(terrainTnb.getReference());
        TaxeTnb taxe= findByReference(taxeTnb.getReference());
        if(taxe!=null){
            return -1;
        }
        else if(t==null || terrainTnb.getReference()==null){
            return -2;
        }
        else{
            double montant=0;
            double montantDeBase=terrainTnb.getSurface()*tauxTaxe.getMontantParMetreCarre();
            double montantMajoration= montantDeBase*(10/100);
            double montantPenalite =montantDeBase*(5/100);
            
            if(taxeTnb.getNombreMoisRetard()==0 ){
               montant+=montantDeBase;
               res =1;
            }
            else if(taxeTnb.getNombreMoisRetard()==1){
              montant+=montantDeBase+montantMajoration;
            res =2;
            }
             else if(taxeTnb.getNombreMoisRetard()>1){
              montant+=montantDeBase+montantMajoration+montantPenalite;
              res =3;
            }
           taxeTnb.setMontantTaxe(montant);
           taxeTnbDao.save(taxeTnb);
        }
        return res ; 
    }


    public TaxeTnbDao getTaxeTnbDao() {
        return taxeTnbDao;
    }

    public void setTaxeTnbDao(TaxeTnbDao taxeTnbDao) {
        this.taxeTnbDao = taxeTnbDao;
    }

   
    public TerrainTnbService getTerrainTnbService() {
        return terrainTnbService;
    }

    public void setTerrainTnbService(TerrainTnbService terrainTnbService) {
        this.terrainTnbService = terrainTnbService;
    }

    
    
}
