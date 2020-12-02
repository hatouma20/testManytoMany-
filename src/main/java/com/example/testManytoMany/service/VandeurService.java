/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testManytoMany.service;

import com.example.testManytoMany.model.Vandeur;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author acer
 */
public interface VandeurService {
     List <Vandeur> listAllVanduer();

    Optional getVandeurById(Integer id);

   void saveVandeur(Vandeur vandeur);

    void deleteVandeur(Integer id);
}




