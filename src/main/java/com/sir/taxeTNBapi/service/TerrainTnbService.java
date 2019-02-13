/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeTNBapi.service;

import com.sir.taxeTNBapi.bean.TerrainTnb;
import java.util.List;

/**
 *
 * @author Macbook
 */
public interface TerrainTnbService {
    public TerrainTnb findByReference(String reference);
   public List<TerrainTnb> FindByCategorieReference(String reference);
   public int creer(TerrainTnb terrainTnb);
}
