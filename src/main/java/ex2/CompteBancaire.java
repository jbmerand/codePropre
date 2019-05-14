package ex2;

/**
 * Classe abstraite représentant un compte bancaire
 * 
 * @author DIGINAMIC
 */
public abstract class CompteBancaire {

	/** double solde : solde du compte */
	protected double solde;

	/**
	 * Constructor
	 * 
	 * @param solde
	 */
	public CompteBancaire(double solde) {
		this.solde = solde;
	}

	/**
	 * Ajoute un montant au solde
	 * 
	 * @param montant
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * Retire un montant au solde
	 * 
	 * @param montant
	 */
	public abstract void debiterMontant(double montant);

}