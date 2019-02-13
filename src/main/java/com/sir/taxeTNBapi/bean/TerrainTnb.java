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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Macbook
 */
@Entity
public class TerrainTnb implements Serializable {

    @OneToMany(mappedBy = "terrainTnb")
    private List<TaxeTnb> taxeTnbs;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private double surface;
    private double dernierMontantPayer;
    private int dernierAnneePaiement;
    @ManyToOne
    private CategorieTnb categorieTnb;
    private String referenceRue;
    private String ReferenceRedevable;
    

   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TerrainTnb)) {
            return false;
        }
        TerrainTnb other = (TerrainTnb) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sir.taxeTNBapi.bean.TerrainTnb[ id=" + id + " ]";
    }
   public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<TaxeTnb> getTaxeTnbs() {
        return taxeTnbs;
    }

    public void setTaxeTnbs(List<TaxeTnb> taxeTnbs) {
        this.taxeTnbs = taxeTnbs;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public double getDernierMontantPayer() {
        return dernierMontantPayer;
    }

    public void setDernierMontantPayer(double dernierMontantPayer) {
        this.dernierMontantPayer = dernierMontantPayer;
    }

    public int getDernierAnneePaiement() {
        return dernierAnneePaiement;
    }

    public void setDernierAnneePaiement(int dernierAnneePaiement) {
        this.dernierAnneePaiement = dernierAnneePaiement;
    }

    public CategorieTnb getCategorieTnb() {
        return categorieTnb;
    }

    public void setCategorieTnb(CategorieTnb categorieTnb) {
        this.categorieTnb = categorieTnb;
    }

    public String getReferenceRue() {
        return referenceRue;
    }

    public void setReferenceRue(String referenceRue) {
        this.referenceRue = referenceRue;
    }

    public String getReferenceRedevable() {
        return ReferenceRedevable;
    }

    public void setReferenceRedevable(String ReferenceRedevable) {
        this.ReferenceRedevable = ReferenceRedevable;
    }
  
}
