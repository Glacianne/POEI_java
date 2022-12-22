package com.example.demospring.controller;


import com.example.demospring.entity.Produit;
import com.example.demospring.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/produit")
@ResponseBody
public class ProduitController {

    @Autowired
    ProduitService produitService;

    @PostMapping("")
    public Produit postProduit(@RequestBody Produit produit){
        if(produitService.create(produit)) {
            return produit;
        }
        return null;
    }

    @PostMapping("/update/{id}")
    public Produit updateProduit(@PathVariable int id, @RequestBody Produit newProduit){
        Produit produit = produitService.findById(id);
        if(produit != null){
            produit.setPrix(newProduit.getPrix());
            produit.setStock(newProduit.getStock());
            produit.setMarque(newProduit.getMarque());
            produit.setDateAchat(newProduit.getDateAchat());
            produit.setReference(newProduit.getReference());
        }
        if(produitService.update(produit)) {
            return produit;
        }
        return null;
    }

    @PostMapping("/delete/{id}")
    public String deleteProduit(@PathVariable int id){
        Produit produit = produitService.findById(id);
        if (produit != null && produitService.delete(produit)){
                return "produit supprimé";
        }
        return "une erreur s'est produite";
    }

    @GetMapping("/{id}")
    public Produit findById(@PathVariable int id){
        return produitService.findById(id);
    }

    @GetMapping("/findAll")
    public List<Produit> findAll(){
        return produitService.findAll();
    }


}
