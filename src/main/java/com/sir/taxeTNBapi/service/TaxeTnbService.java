/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeTNBapi.service;

import com.sir.taxeTNBapi.bean.TauxTaxe;
import com.sir.taxeTNBapi.bean.TaxeTnb;
import com.sir.taxeTNBapi.bean.TerrainTnb;
import java.util.List;

/**
 *
 * @author Macbook
 */
public interface TaxeTnbService {
    public TaxeTnb findByReference(String reference);
   public List<TaxeTnb> findByTerrainTnbReference(String reference);
  public int creerTaxe(TaxeTnb taxeTnb,TerrainTnb terrainTnb,TauxTaxe tauxTaxe);
}
