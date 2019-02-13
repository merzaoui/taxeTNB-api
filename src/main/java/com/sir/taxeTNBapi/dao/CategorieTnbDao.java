/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeTNBapi.dao;

import com.sir.taxeTNBapi.bean.CategorieTnb;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Macbook
 */
public interface CategorieTnbDao extends JpaRepository<CategorieTnb,Long> {
    public CategorieTnb findByReference(String reference);
}
