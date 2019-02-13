/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeTNBapi.service.impl;

import com.sir.taxeTNBapi.bean.CategorieTnb;
import com.sir.taxeTNBapi.dao.CategorieTnbDao;
import com.sir.taxeTNBapi.service.CategorieTnbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Macbook
 */
@Service
public class CategorieTnbServiceImpl implements CategorieTnbService{
    
   
    @Autowired
    CategorieTnbDao categorieTnbdao;
    
    @Override
    public CategorieTnb findByReference(String reference) {
        return categorieTnbdao.findByReference(reference);
    }

    @Override
    public int creer(CategorieTnb categorieTnb) {
        CategorieTnb t = findByReference(categorieTnb.getReference());
        if(t!=null){
            return -1;
        }
        else{
            categorieTnbdao.save(categorieTnb);
            return 1;
        }
    }

    public CategorieTnbDao getCategorieTnbdao() {
        return categorieTnbdao;
    }

    public void setCategorieTnbdao(CategorieTnbDao categorieTnbdao) {
        this.categorieTnbdao = categorieTnbdao;
    }
    
    
}
