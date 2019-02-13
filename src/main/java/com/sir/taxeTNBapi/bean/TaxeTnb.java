/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.taxeTNBapi.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Macbook
 */
@Entity
public class TaxeTnb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private double montantDeBase;
    private double montantMajoration;
    private double montantPenalite;
    private double montantTaxe;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datePaiement;
    @ManyToOne
    private TerrainTnb terrainTnb;
    

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaxeTnb)) {
            return false;
        }
        TaxeTnb other = (TaxeTnb) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sir.taxeTNBapi.bean.TaxeTnb[ id=" + id + " ]";
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

    public double getMontantDeBase() {
        return montantDeBase;
    }

    public void setMontantDeBase(double montantDeBase) {
        this.montantDeBase = montantDeBase;
    }

    public double getMontantMajoration() {
        return montantMajoration;
    }

    public void setMontantMajoration(double montantMajoration) {
        this.montantMajoration = montantMajoration;
    }

    public double getMontantPenalite() {
        return montantPenalite;
    }

    public void setMontantPenalite(double montantPenalite) {
        this.montantPenalite = montantPenalite;
    }

    public double getMontantTaxe() {
        return montantTaxe;
    }

    public void setMontantTaxe(double montantTaxe) {
        this.montantTaxe = montantTaxe;
    }

    public Date getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }

    public TerrainTnb getTerrainTnb() {
        return terrainTnb;
    }

    public void setTerrainTnb(TerrainTnb terrainTnb) {
        this.terrainTnb = terrainTnb;
    }
    
}
