/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeTNBapi.service;

import com.sir.taxeTNBapi.bean.CategorieTnb;

/**
 *
 * @author Macbook
 */
public interface CategorieTnbService {
    public CategorieTnb findByReference(String reference);
    public int creer(CategorieTnb categorieTnb);
}
