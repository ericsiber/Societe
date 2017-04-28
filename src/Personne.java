
public class Personne {

	private String prenom;
	private String nom;
	private Integer age;

	public Personne(String nom, String prenom) {
		super();
		this.prenom = prenom;
		this.nom = nom;
	}

	public Personne(String prenom, String nom, Integer age) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
	}

	public String toString() {
		String description = prenom + " " + nom;
		if (this.age != null) {
			description = description + " : " + this.age + " an(s)";
		}
		return description;
	}

}
