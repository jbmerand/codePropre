package ex3.model;

/**
 * Classe énumérant les régimes alimentaires possibles des animaux du zoo
 */
public enum RegimeAlimentaire {
	HERBIVORE("Herbivore"), CARNIVORE("Carnivore"), OMNIVORE("Omnivore");

	/** String nom du régime alimentaire */
	private String nom;

	/**
	 * Constructor
	 * 
	 * @param nom
	 */
	private RegimeAlimentaire(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return String : nom du régime alimentaire
	 */
	public String getNom() {
		return nom;
	}
}
