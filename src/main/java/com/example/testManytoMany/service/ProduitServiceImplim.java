/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testManytoMany.service;

import com.example.testManytoMany.model.Produit;
import com.example.testManytoMany.model.Vandeur;
import com.example.testManytoMany.model.VandeurModel;
import com.example.testManytoMany.repository.ProduitRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public class ProduitServiceImplim implements ProductService{
 @Autowired
 private ProduitRepository  produitRepository ;
 

    public ProduitServiceImplim(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }
 
    @Override
    public List<Produit> listAllProduits() {
   return produitRepository.findAll();
    
    }

    @Override
    public Optional getProductById(Integer id) {
     return produitRepository.findById(id);
    
    }

    @Override
    public void saveProduit(Produit produit) {
    produitRepository.save(produit);
    }

    @Override
    public void deleteProduit(Integer id) {
          produitRepository.deleteById(id);   }

    @Override
    public List<Vandeur> listVanduerByIdProduit() {
        
     return null ;
    }
     @Override
     public List<VandeurModel> getVendeurByProduit(Integer id){
        Optional<Produit> optionalProduit = produitRepository.findById(id);
               if(optionalProduit.isPresent()){
                   List<VandeurModel> vandeurList = new ArrayList<VandeurModel>();
                   optionalProduit.get().getVandeur().forEach((Vandeur v ) -> {VandeurModel vm = new VandeurModel();
                   vm.setIdVandeur(v.getIdVandeur());
                   vm.setName(v.getName());
                   vandeurList.add(vm);
                           }
                   );
                           return  vandeurList;

               }else {
                   return null;
               }
    }

    
}













