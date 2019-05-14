package ex3.model;

import java.util.ArrayList;
import java.util.List;

import ex3.model.zones.Zone;

/**
 * Représente un zoo
 */
public class Zoo {

	private List<Zone> zonesDuZoo = new ArrayList<>();

	/** String nom : nom du zoo */
	private String nom;

	/**
	 * Constructor
	 * 
	 * @param nom
	 *            : nom du Zoo
	 */
	public Zoo(String nom) {
		this.nom = nom;
	}

	/**
	 * Ajoute une zone au zoo
	 * 
	 * @param zone
	 */
	public void ajouterZoneAuZoo(Zone zone) {
		zonesDuZoo.add(zone);
	}

}
