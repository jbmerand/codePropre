package ex2;

/**
 * Représente un compte courant, classe enfant de CompteBancaire
 */
public class CompteCourant extends CompteBancaire {

	/** double decouvert : montant du découvert autorisé */
	protected double decouvert;

	/**
	 * Constructor
	 * 
	 * @param solde
	 *            : solde du compte
	 * @param decouvert
	 *            : valeur de découvert autorisé du compte
	 */
	public CompteCourant(double solde, double decouvert) {
		super(solde);
		this.decouvert = decouvert;
	}

	@Override
	public void debiterMontant(double montant) {
		if (this.solde - montant > decouvert) {
			this.solde = solde - montant;
		}
	}
}
