public class Programme {
	public static void main(String[] args) {
		// création
		Personne formateur = new Personne("Hovart", "Nicolas");
		Personne moi = new Personne("Siber", "Eric", 34);
		moi.setAge(35);

		// affichage
		System.out.println(moi);
		System.out.println(formateur);
	}
}
