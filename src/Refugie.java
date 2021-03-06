public class Refugie extends Personne {

	// l'initialisation à false dans certains constructeurs n'est pas forcemment
	// utile mais permet d'éviter tout effet de bord lié au changement de la
	// ligne suivante
	private boolean regularise = false;

	public Refugie(String nom, String prenom) {
		this(nom, prenom, false);
	}

	public Refugie(String prenom, String nom, Integer age) {
		this(prenom, nom, age, false);
	}

	public Refugie(String nom, String prenom, boolean regularise) {
		super(nom, prenom);
		setRegularise(regularise);
	}

	public Refugie(String prenom, String nom, Integer age, boolean regularise) {
		super(prenom, nom, age);
		setRegularise(regularise);
	}

	public boolean regulariser(String motDePasse) {
		if ("simplon".equals(motDePasse)) {
			setRegularise(true);
			return true;
		}
		return false;
	}

	@Override
	public boolean demenager(Adresse nouvelleAdresse) {
		if (this.regularise) {
			return super.demenager(nouvelleAdresse);
		}
		return false;
	}

	public boolean isRegularise() {
		return regularise;
	}

	private void setRegularise(boolean regularise) {
		this.regularise = regularise;
	}
	
	@Override
	public String toString() {
		return "Refugié " + super.toString() + " "
				+ (this.regularise ? "" : " non") + " régularisé";
	}

}
