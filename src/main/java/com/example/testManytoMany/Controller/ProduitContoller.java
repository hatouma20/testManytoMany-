/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testManytoMany.Controller;

import com.example.testManytoMany.model.Produit;
import com.example.testManytoMany.model.Vandeur;
import com.example.testManytoMany.model.VandeurModel;
import com.example.testManytoMany.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author acer
 */
@RestController
@RequestMapping("/produit")
public class ProduitContoller {   
@Autowired
private ProductService produitService;

    public ProduitContoller(ProductService produitService) {
        this.produitService = produitService;
    }


@GetMapping
	public List<Produit> getAll(){
		return produitService.listAllProduits();
	}
   
@GetMapping(value="/{id}/vendeur")
    public List<VandeurModel> getVendeurByProduit(@PathVariable  Long id){
        return produitService.getVendeurByProduit( new Integer(id.toString()));
    }
}
















