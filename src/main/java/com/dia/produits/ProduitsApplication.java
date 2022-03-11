package com.dia.produits;

import com.dia.produits.entity.Produit;
import com.dia.produits.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProduitsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProduitsApplication.class, args);
    }
@Autowired
private ProduitRepository produitRepository;

    @Override
    public void run(String... args) throws Exception {
        
    }
}
