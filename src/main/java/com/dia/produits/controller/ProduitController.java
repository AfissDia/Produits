package com.dia.produits.controller;

import com.dia.produits.entity.Produit;
import com.dia.produits.service.ProduitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
    @GetMapping("/produits/new")
    private String addProduits(Model model){
        Produit produit=new Produit();
        model.addAttribute("produit", produit);
        return ("create_produit");
    }
    @PostMapping("/produits")
    public String saveProduits(@ModelAttribute("produit") Produit produit){
        produitService.saveProduit(produit);
        return "redirect:/produits";
    }

    // mapping update
    @GetMapping("/produits/edit/{id}")
    public String editProduit(@PathVariable Long id, Model model){
        model.addAttribute("produit",produitService.getProduitById(id));
        return "edit_produit";
    }
    @PostMapping("/produits/{id}")
    public String updateProduit (@PathVariable Long id, @ModelAttribute("produit") Produit produit, Model model){

        Produit pro = produitService.getProduitById(id);
        pro.setId(id);
        pro.setNom(produit.getNom());
        pro.setPrix(produit.getPrix());
        pro.setQuantite(produit.getQuantite());
        pro.setAdress(produit.getAdress());
        pro.setTel(produit.getTel());

        produitService.updateProduit(pro);
        return "redirect:/produits";

    }
    @GetMapping("/produits/{id}")
    public String deleteProduit(@PathVariable Long id){
        produitService.deleteProduitById(id);
        return "redirect:/produits";
    }

}
