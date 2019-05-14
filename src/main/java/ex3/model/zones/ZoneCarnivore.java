package ex3.model.zones;

/**
 * Zone contenant tous les animaux carnivores qui ne sont pas dans la savane.
 */
public class ZoneCarnivore extends Zone {

	/** Masse moyenne en kg de nourriture consommée par 1 carnivore de la zone */
	private static final double CONSOMMATION_NOURRITURE_EN_KG = 0.2;

	/**
	 * Constructor
	 * 
	 */
	public ZoneCarnivore() {
		super();
	}

	@Override
	public double obtenirKgsNourritureParJour() {
		return animauxDeLaZone.size() * CONSOMMATION_NOURRITURE_EN_KG;
	}

}
