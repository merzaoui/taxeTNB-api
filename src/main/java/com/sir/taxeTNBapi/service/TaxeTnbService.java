/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeTNBapi.service;

import com.sir.taxeTNBapi.bean.TaxeTnb;
import java.util.List;

/**
 *
 * @author Macbook
 */
public interface TaxeTnbService {
    public TaxeTnb findByReference(String reference);
   public List<TaxeTnb> FindByTerrainReference(String reference);
   public int creer(TaxeTnb taxeTnb);
}
