package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import metier.Produit;

public class IProduitImpl implements IProduit{

	
	Collection<Produit> base = new ArrayList<Produit>();
	
	public void init() {
		for (int i = 1; i <= 10; i++) {
			base.add(new Produit(i, "Produit "+i, i*10.3, i*2));
		}
	}
	@Override
	public void ajouterProduit(Produit p) {
		base.add(p);
		
	}

	@Override
	public void modifierProduit(Produit p, String nom, double prix, int quantite) {
		for (Produit produit : base) {
			if (produit.getIdProduit() == p.getIdProduit()) {
				produit.setNomProduit(nom);
				produit.setPrix(prix);
				produit.setQuantite(quantite);
			}
		}
		
	}

	@Override
	public void supprimerProduit(int idProduit) {
		for (Produit produit : base) {
			if (produit.getIdProduit() == idProduit) {
				base.remove(produit);
				break;
			}
		}
		
	}

	@Override
	public List<Produit> listerTousLesProduits() {
	
		return (List<Produit>) base;
	}

	@Override
	public Produit listerUnProduit(int idProduit) {
		
		for (Produit produit : base) {
			if (produit.getIdProduit() == idProduit) {
				return produit;
			}
		}
		return null;
	}
	@Override
	public void AfficherListeProduits(List<Produit> produits) {
		System.out.println(produits);
		
	}

	

}
