
public class Adresse {
	private final String numeroVoie;
	private final String nomVoie;
	private final int codePostal;
	private final String ville;

	public Adresse(String numeroVoie, String nomVoie, int codePostal,
			String ville) {
		this.numeroVoie = numeroVoie;
		this.nomVoie = nomVoie;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public String getNumeroVoie() {
		return numeroVoie;
	}

	public String getNomVoie() {
		return nomVoie;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public String getVille() {
		return ville;
	}

}