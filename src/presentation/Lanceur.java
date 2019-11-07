package presentation;

import service.IProduit;
import service.IProduitImpl;

public class Lanceur {

	public static void main(String[] args) {
		IProduit service = new IProduitImpl();
		//init
		IProduitImpl.base= service.init();
		service.AfficherListeProduits(IProduitImpl.base);

	}

}
