package com.dia.produits.entity;
import javax.persistence.*;

@Entity
@Table(name="produits")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nom_produit")
    private String nom;
    @Column(name="prix_produit")
    private String prix;
    @Column(name="quantite_produit")
    private String quantite;
    @Column(name="adress_produit")
    private String adress;
    @Column(name="tel_produit")
    private String tel;

    public Produit() {
        super();
    }

    public Produit(String nom, String prix, String quantite, String adress, String tel) {
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
        this.adress = adress;
        this.tel = tel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getQuantite() {
        return quantite;
    }

    public void setQuantite(String quantite) {
        this.quantite = quantite;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
