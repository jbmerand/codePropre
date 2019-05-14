package ex2;

/**
 * Représente un Livret A, classe enfant de CompteBancaire
 */
public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	protected double tauxRemuneration;

	/**
	 * Constructor
	 * 
	 * @param solde
	 *            : solde du compte
	 * @param tauxRemuneration
	 *            : taux annuel de rémunération
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public void debiterMontant(double montant) {
		if (this.solde - montant > 0) {
			this.solde = solde - montant;
		}
	}

	/**
	 * Ajoute au solde du compte le montant correspond au taux de rémunération
	 */
	public void appliquerRemuAnnuelle() {
		this.solde = solde + solde * tauxRemuneration / 100;
	}
}
