/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeTNBapi.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Macbook
 */
@Entity
public class CategorieTnb implements Serializable {

    @OneToMany(mappedBy = "categorieTnb")
    private List<TerrainTnb> terrainTnbs;

    @OneToMany(mappedBy = "categorieTnb")
    private List<TauxTaxe> tauxTaxes;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private String libelle;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategorieTnb)) {
            return false;
        }
        CategorieTnb other = (CategorieTnb) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sir.taxeTNBapi.bean.CategorieTnb[ id=" + id + " ]";
    }
 
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<TauxTaxe> getTauxTaxes() {
        return tauxTaxes;
    }

    public void setTauxTaxes(List<TauxTaxe> tauxTaxes) {
        this.tauxTaxes = tauxTaxes;
    }

    public List<TerrainTnb> getTerrainTnbs() {
        return terrainTnbs;
    }

    public void setTerrainTnbs(List<TerrainTnb> terrainTnbs) {
        this.terrainTnbs = terrainTnbs;
    }
   
}
