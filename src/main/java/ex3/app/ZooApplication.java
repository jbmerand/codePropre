package ex3.app;

import ex3.model.RegimeAlimentaire;
import ex3.model.Zoo;
import ex3.model.animaux.Mammifere;
import ex3.model.animaux.Poisson;
import ex3.model.animaux.Reptile;
import ex3.model.zones.Aquarium;
import ex3.model.zones.FermeReptile;
import ex3.model.zones.SavaneAfricaine;
import ex3.model.zones.Zone;
import ex3.model.zones.ZoneCarnivore;

/**
 * Classe de lancement de l'application Zoo
 */
public class ZooApplication {

	/**
	 * Méthode principale permettant de lancer l'application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Zoo zoo = new Zoo("Thoiry");

		Zone aquarium = new Aquarium();
		Zone fermeReptile = new FermeReptile();
		Zone savaneAfricaine = new SavaneAfricaine();
		Zone zoneCarnivore = new ZoneCarnivore(); // zoneCarnivore ne contient rien car les animaux sont répartis dans
													// les autres zones (les carnivores sont tous des animaux de la
													// savane)

		aquarium.ajouterAnimal(new Poisson("Requin blanc", RegimeAlimentaire.HERBIVORE));
		aquarium.ajouterAnimal(new Poisson("Truite dorée", RegimeAlimentaire.HERBIVORE));

		fermeReptile.ajouterAnimal(new Reptile("Boa constrictor", RegimeAlimentaire.CARNIVORE));
		fermeReptile.ajouterAnimal(new Reptile("Python", RegimeAlimentaire.CARNIVORE));

		savaneAfricaine.ajouterAnimal(new Mammifere("Gazelle", RegimeAlimentaire.HERBIVORE));
		savaneAfricaine.ajouterAnimal(new Mammifere("Zèbre", RegimeAlimentaire.HERBIVORE));
		savaneAfricaine.ajouterAnimal(new Mammifere("Lion", RegimeAlimentaire.CARNIVORE));
		savaneAfricaine.ajouterAnimal(new Mammifere("Panthère", RegimeAlimentaire.CARNIVORE));

		zoo.ajouterZoneAuZoo(aquarium);
		zoo.ajouterZoneAuZoo(fermeReptile);
		zoo.ajouterZoneAuZoo(savaneAfricaine);

		// TESTS RAPIDES D'AFFICHAGE
		System.out.println("DANS L'AQUARIUM :");
		aquarium.afficherListeAnimaux();
		System.out.println(aquarium.compterAnimaux() + " animaux au total.");
		System.out.println(aquarium.obtenirKgsNourritureParJour() + " de consommation en kg/J");

		System.out.println("DANS LA SAVANE AFRICAINE :");
		savaneAfricaine.afficherListeAnimaux();
		System.out.println(savaneAfricaine.compterAnimaux() + " animaux au total.");
		System.out.println(savaneAfricaine.obtenirKgsNourritureParJour() + " de consommation en kg/J");
		// manque les informations de poids à implémenter pour obtenir bon résultat

		System.out.println("DANS LA FERME DE REPTILES :");
		fermeReptile.afficherListeAnimaux();
		System.out.println(fermeReptile.compterAnimaux() + " animaux au total.");
		System.out.println(fermeReptile.obtenirKgsNourritureParJour() + " de consommation en kg/J");

	}

}
