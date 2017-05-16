public class Programme {
	public static void main(String[] args) {
		// création
		Personne formateur = new Personne("Hovart", "Nicolas");
		Personne moi = new Personne("Siber", "Eric", 34);
		moi.setAge(35);
		Refugie refugieRegularise = new Refugie("Jean", "Durand", 23, true);
		Refugie refugieNonRegularise = new Refugie("Michelle", "Blanche");

		// affichage
		System.out.println(moi);
		System.out.println(formateur);
		System.out.println(refugieRegularise);
		System.out.println(refugieNonRegularise);
	}
}
