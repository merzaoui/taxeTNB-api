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
public class TauxTaxe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double surfaceMin;
    private double surfaceMax;
    private double montantParMetreCarre;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDebut;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateFin;
    @ManyToOne
    private CategorieTnb categorieTnb;
 

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TauxTaxe)) {
            return false;
        }
        TauxTaxe other = (TauxTaxe) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sir.taxeTNBapi.bean.TauxTaxe[ id=" + id + " ]";
    }
   public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    } 

    public double getSurfaceMin() {
        return surfaceMin;
    }

    public void setSurfaceMin(double surfaceMin) {
        this.surfaceMin = surfaceMin;
    }

    public double getSurfaceMax() {
        return surfaceMax;
    }

    public void setSurfaceMax(double surfaceMax) {
        this.surfaceMax = surfaceMax;
    }

    public double getMontantParMetreCarre() {
        return montantParMetreCarre;
    }

    public void setMontantParMetreCarre(double montantParMetreCarre) {
        this.montantParMetreCarre = montantParMetreCarre;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public CategorieTnb getCategorieTnb() {
        return categorieTnb;
    }

    public void setCategorieTnb(CategorieTnb categorieTnb) {
        this.categorieTnb = categorieTnb;
    }
    
}
