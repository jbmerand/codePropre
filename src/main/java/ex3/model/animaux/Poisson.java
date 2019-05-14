package ex3.model.animaux;

import ex3.model.RegimeAlimentaire;

/**
 * Représente un animal de type poisson
 */
public class Poisson extends Animal {

	/** Masse moyenne en kg de nourriture consommée par 1 poisson */
	private static final double CONSOMMATION_NOURRITURE_EN_KG = 0.2;

	/**
	 * Constructor
	 * 
	 * @param nom
	 *            : nom de l'animal
	 * @param regimeAlimentaire
	 *            (herbivore, carnivore, omnivore)
	 */
	public Poisson(String nom, RegimeAlimentaire regimeAlimentaire) {
		super(nom, regimeAlimentaire);

	}

	/**
	 * Getter
	 * 
	 * @return the consommationNourritureEnKg
	 */
	public static double getConsommationNourritureEnKg() {
		return CONSOMMATION_NOURRITURE_EN_KG;
	}

}