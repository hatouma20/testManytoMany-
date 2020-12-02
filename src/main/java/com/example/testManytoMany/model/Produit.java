/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testManytoMany.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author acer
 */
@Entity
public class Produit {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProduit;
    private String name;
 @ManyToMany(fetch = FetchType.LAZY , cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            } )
 @JoinTable(name="produit_vandeur",joinColumns=@JoinColumn(name="idProduit", referencedColumnName="idProduit"), inverseJoinColumns  = @JoinColumn(name="idVandeur", referencedColumnName="idVandeur"))
 private Set<Vandeur> vandeur = new HashSet<>();
    public Produit() {
        
    }

    public Produit(int idProduit, String name) {
        
        this.idProduit = idProduit;
        this.name = name;
    }
    

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Vandeur> getVandeur() {
        return vandeur;
    }

    public void setVandeur(Set<Vandeur> vandeur) {
        this.vandeur = vandeur;
    }


   

    
}







