package service;


import java.util.List;

import metier.Produit;

public interface IProduit {
	public void ajouterProduit(Produit p);
	public void modifierProduit(Produit p, String nom, double prix, int quantite );
	public void supprimerProduit(int idProduit);
	public List<Produit> listerTousLesProduits();
	public Produit listerUnProduit(int idProduit);
}
