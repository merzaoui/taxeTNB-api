/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeTNBapi.dao;

import com.sir.taxeTNBapi.bean.TaxeTnb;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Macbook
 */
public interface TaxeTnbDao extends JpaRepository<TaxeTnb,Long> {
   public TaxeTnb findByReference(String reference);
   public List<TaxeTnb> FindByTerrainReference(String reference);
}
