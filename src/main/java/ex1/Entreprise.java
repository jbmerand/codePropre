package ex1;

import java.util.Date;

/**
 * Classe représentant une entreprise
 */
public class Entreprise {

	/** siret : int (numéro siret) */
	public int siret;

	/** nom : String */
	public String nom;

	/** adresse : String (adresse physique de l'entreprise) */
	public String adresse;

	/** dateDeCreation : Date */
	public Date dateDeCreation;

	/** CAPITAL_MAX : int (la valeur du capital maximale) */
	public static final int CAPITAL_MAX = 3000000;

	/**
	 * Affiche le statut de l'entreprise
	 */
	public void AfficherStatut() {
		// TODO
	}

}
