/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeTNBapi.dao;

import com.sir.taxeTNBapi.bean.TauxTaxe;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Macbook
 */
public interface TauxTaxeDao extends JpaRepository<TauxTaxe,Long> {
    public TauxTaxe findByReference(String reference);
   public List<TauxTaxe> FindByCategorieReference(String reference);
}
