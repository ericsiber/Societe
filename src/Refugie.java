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

	public boolean demenager(String numeroVoie, String nomVoie, int codePostal,
			String ville) {
		if (this.regularise) {
			setNumeroVoie(numeroVoie);
			setNomVoie(nomVoie);
			setCodePostal(codePostal);
			setVille(ville);
			return true;
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
	public void setNumeroVoie(String numeroVoie) {
		if (this.regularise) {
			super.setNumeroVoie(numeroVoie);
		} else {
			throw new UnsupportedOperationException("Réfugié non régularisé");
		}
	}

	@Override
	public void setNomVoie(String nomVoie) {
		if (this.regularise) {
			super.setNomVoie(nomVoie);
		} else {
			throw new UnsupportedOperationException("Réfugié non régularisé");
		}
	}

	@Override
	public void setCodePostal(int codePostal) {
		if (this.regularise) {
			super.setCodePostal(codePostal);
		} else {
			throw new UnsupportedOperationException("Réfugié non régularisé");
		}
	}

	@Override
	public void setVille(String ville) {
		if (this.regularise) {
			super.setVille(ville);
		} else {
			throw new UnsupportedOperationException("Réfugié non régularisé");
		}
	}

	@Override
	public String toString() {
		return "Refugié " + super.toString() + " "
				+ (this.regularise ? "" : " non") + " régularisé";
	}

}
