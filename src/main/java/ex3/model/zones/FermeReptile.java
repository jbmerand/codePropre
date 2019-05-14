package ex3.model.zones;

import ex3.model.animaux.Reptile;

/**
 * Représente la zone de la ferme des reptiles du zoo
 */
public class FermeReptile extends Zone {

	/**
	 * Constructor
	 * 
	 */
	public FermeReptile() {
		super();
	}

	@Override
	public double obtenirKgsNourritureParJour() {
		return Reptile.getConsommationNourritureEnKg() * animauxDeLaZone.size();
	}

}
