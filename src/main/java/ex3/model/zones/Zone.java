package ex3.model.zones;

import java.util.ArrayList;
import java.util.List;

import ex3.model.animaux.Animal;

/**
 * Représente une zone du zoo
 */
public abstract class Zone {

	/** List<Animal> animauxDeLaZone */
	protected List<Animal> animauxDeLaZone = new ArrayList<>();

	/**
	 * Retourne le poids des animaux dans la zone
	 * 
	 * @return double : poids en kg
	 */
	public double getPoids() {
		// pas assez d'informations dans l'exercice pour implémenter (peut nécessiter
		// ajouter un attribut poids pour certains animaux)
		return 0;
	}

	/**
	 * Retourne la quantité en KG de nourriture à donner par jour aux animaux de la
	 * zone
	 * 
	 * @return double : quantité en kg
	 */
	public double obtenirKgsNourritureParJour() {
		return animauxDeLaZone.size() * getPoids();
	}

	/**
	 * Affiche la liste des animaux présents dans la zone.
	 */
	public void afficherListeAnimaux() {
		for (Animal animal : animauxDeLaZone) {
			System.out.println(animal.getNom() + " - " + animal.getRegimeAlimentaire().getNom());
		}
	}

	/**
	 * Retourne la quantité d'animaux dans la zone.
	 * 
	 * @return int : quantité
	 */
	public int compterAnimaux() {
		return animauxDeLaZone.size();
	}

	/**
	 * Ajoute un animal à la liste des animaux de la zone.
	 * 
	 * @param animal
	 */
	public void ajouterAnimal(Animal animal) {
		animauxDeLaZone.add(animal);
	}
}
