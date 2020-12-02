/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testManytoMany.service;

import com.example.testManytoMany.model.Produit;
import com.example.testManytoMany.model.Vandeur;
import com.example.testManytoMany.model.VandeurModel;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public interface ProductService {
   List <Produit> listAllProduits();
   List<Vandeur> listVanduerByIdProduit();

    Optional getProductById(Integer id);

   void saveProduit(Produit produit);

    void deleteProduit(Integer id);
    
    List<VandeurModel> getVendeurByProduit(Integer id);
}









