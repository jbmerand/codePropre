package ex3.model.animaux;

import ex3.model.RegimeAlimentaire;

/**
 * Représente un animal de type reptile
 */
public class Reptile extends Animal {

	/** Masse moyenne en kg de nourriture consommée par 1 reptile */
	private static final double CONSOMMATION_NOURRITURE_EN_KG = 0.1;

	/**
	 * Constructor
	 * 
	 * @param nom
	 *            : nom de l'animal
	 * @param regimeAlimentaire
	 *            (herbivore, carnivore, omnivore)
	 */
	public Reptile(String nom, RegimeAlimentaire regimeAlimentaire) {
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
