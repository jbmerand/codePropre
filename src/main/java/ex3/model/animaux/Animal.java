package ex3.model.animaux;

import ex3.model.RegimeAlimentaire;

/**
 * Représente un animal du zoo
 */
public abstract class Animal {
	/** String nom : nom de l'animal */
	protected String nom;
	protected RegimeAlimentaire regimeAlimentaire;

	/**
	 * Constructor
	 * 
	 * @param nom
	 *            : nom de l'animal
	 * @param regimeAlimentaire
	 *            (herbivore, carnivore ou omnivore)
	 */
	public Animal(String nom, RegimeAlimentaire regimeAlimentaire) {
		this.nom = nom;
		this.regimeAlimentaire = regimeAlimentaire;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the regimeAlimentaire
	 */
	public RegimeAlimentaire getRegimeAlimentaire() {
		return regimeAlimentaire;
	}

	/**
	 * Setter
	 * 
	 * @param regimeAlimentaire
	 *            the regimeAlimentaire to set
	 */
	public void setRegimeAlimentaire(RegimeAlimentaire regimeAlimentaire) {
		this.regimeAlimentaire = regimeAlimentaire;
	}

}
