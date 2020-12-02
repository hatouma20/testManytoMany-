/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testManytoMany.service;

import com.example.testManytoMany.model.Vandeur;
import com.example.testManytoMany.repository.VandeurRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author acer
 */
public class VandeurServiceImplm implements  VandeurService{
    @Autowired
    private VandeurRepository vandeurRepository ;
    @Override
    public List<Vandeur> listAllVanduer() {
      return vandeurRepository.findAll();
     
    }

    @Override
    public Optional getVandeurById(Integer id) {
        return vandeurRepository.findById(id);
    }

    @Override
    public void saveVandeur(Vandeur vandeur) {
    vandeurRepository.save(vandeur);
    }

    @Override
    public void deleteVandeur(Integer id) {
        vandeurRepository.deleteById(id);
    }
    
}



