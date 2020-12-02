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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author acer
 */
@Entity
@Table(name = "vandeur")
public class Vandeur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idVandeur;
    private String name;
    @ManyToMany(fetch = FetchType.LAZY ,  cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            } , mappedBy = "vandeur")
       private Set<Produit> produit = new HashSet<>();
       
    public Vandeur() {
    }

    public Vandeur(int idVandeur, String name) {
        this.idVandeur = idVandeur;
        this.name = name;
    }

    public Vandeur(String name) {
        this.name = name;
    }
    

    public int getIdVandeur() {
        return idVandeur;
    }

    public void setIdVandeur(int idVandeur) {
        this.idVandeur = idVandeur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Produit> getProduit() {
        return produit;
    }

    public void setProduit(Set<Produit> produit) {
        this.produit = produit;
    }
    
    

    
}









