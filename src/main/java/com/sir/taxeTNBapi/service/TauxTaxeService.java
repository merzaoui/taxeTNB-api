/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeTNBapi.service;

import com.sir.taxeTNBapi.bean.TauxTaxe;
import java.util.List;

/**
 *
 * @author Macbook
 */
public interface TauxTaxeService {
  
    public int creer(TauxTaxe tauxTaxe);
   public TauxTaxe findByReference(String reference);
   public List<TauxTaxe> FindByCategorieReference(String reference); 
}
