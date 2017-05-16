
public class Personne {

	private String prenom;
	private String nom;
	private Integer age;

	private String numeroVoie;
	private String nomVoie;
	private int codePostal;
	private String ville;

	public Personne(String nom, String prenom) {
		super();
		setPrenom(prenom);
		setNom(nom);
	}

	public Personne(String prenom, String nom, Integer age) {
		this(nom, prenom);
		this.age = age;
	}

	public void initialiserAdresse(String numeroVoie, String nomVoie,
			int codePostal, String ville) {
		if (this.getNumeroVoie() != null || this.getNomVoie() != null
				|| this.getCodePostal() != 0 || this.getVille() != null) {
			throw new UnsupportedOperationException("Adresse déjà initialisée");
		}
		this.numeroVoie = numeroVoie;
		this.nomVoie = nomVoie;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public String toString() {
		String description = prenom + " " + nom;
		if (this.age != null) {
			description = description + " : " + this.age + " an(s)";
		}
		return description;
	}

	public String getPrenom() {
		return prenom;
	}

	private void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	private void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getNumeroVoie() {
		return numeroVoie;
	}

	public void setNumeroVoie(String numeroVoie) {
		this.numeroVoie = numeroVoie;
	}

	public String getNomVoie() {
		return nomVoie;
	}

	public void setNomVoie(String nomVoie) {
		this.nomVoie = nomVoie;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
