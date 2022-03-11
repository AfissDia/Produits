package com.dia.produits.service;

import com.dia.produits.entity.Produit;

import java.util.List;

public interface ProduitService {
    List<Produit> getAllProduit();
    Produit saveProduit(Produit produit);
    // methode pour faire le upadte
    Produit updateProduit( Produit produit);
    Produit getProduitById(Long id);

    void deleteProduitById(Long id);

}
