
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
