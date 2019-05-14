package ex3.model.zones;

import ex3.model.animaux.Poisson;

/**
 * Représente la zone aquarium du zoo
 */
public class Aquarium extends Zone {

	/**
	 * Constructor
	 * 
	 */
	public Aquarium() {
		super();
	}

	@Override
	public double obtenirKgsNourritureParJour() {
		return Poisson.getConsommationNourritureEnKg() * animauxDeLaZone.size();
	}
}
