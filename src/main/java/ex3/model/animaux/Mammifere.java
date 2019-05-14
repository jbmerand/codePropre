package ex3.model.animaux;

import ex3.model.RegimeAlimentaire;

/**
 * Représente un animal de type mammifère
 */
public class Mammifere extends Animal {

	/**
	 * Constructor
	 * 
	 * @param nom
	 *            : nom de l'animal
	 * @param regimeAlimentaire
	 *            (herbivore, carnivore, omnivore)
	 */
	public Mammifere(String nom, RegimeAlimentaire regimeAlimentaire) {
		super(nom, regimeAlimentaire);

	}

}
