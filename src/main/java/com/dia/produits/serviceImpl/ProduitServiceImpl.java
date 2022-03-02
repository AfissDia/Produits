package com.dia.produits.serviceImpl;

import com.dia.produits.entity.Produit;
import com.dia.produits.repository.ProduitRepository;
import com.dia.produits.service.ProduitService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements ProduitService {
    private ProduitRepository produitRepository;

    public ProduitServiceImpl(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Override
    public List<Produit> getAllProduit() {
        return produitRepository.findAll();
    }
}