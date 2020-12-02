/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testManytoMany.repository;

import com.example.testManytoMany.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author acer
 */
public  interface ProduitRepository  extends JpaRepository<Produit, Integer>  {
    
}



