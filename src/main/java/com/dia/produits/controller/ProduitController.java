package com.dia.produits.controller;

import com.dia.produits.service.ProduitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProduitController {
    private ProduitService produitService;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }
    @GetMapping("/produits")
    public String listProduits(Model model){
      model.addAttribute("produits",produitService.getAllProduit());
      return "produits";
    }
}
