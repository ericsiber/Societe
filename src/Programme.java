public class Programme {
	public static void main(String[] args) {
		// création
		Personne formateur = new Personne("Hovart", "Nicolas");
		Personne moi = new Personne("Siber", "Eric", 34);
		moi.setCodePostal(78500);
		moi.setVille("Sartrouville");
		moi.setAge(35);
		Refugie refugieRegularise = new Refugie("Jean", "Durand", 23, true);
		Refugie refugieNonRegularise = new Refugie("Michelle", "Blanche");
		refugieNonRegularise.setNumeroVoie("13");
		refugieNonRegularise.setNomVoie("rue des fleurs");
		refugieNonRegularise.setCodePostal(75001);
		refugieNonRegularise.setVille("Paris");

		// affichage
		System.out.println(moi);
		System.out.println(formateur);
		System.out.println(refugieRegularise);
		System.out.println(refugieNonRegularise);

		// tentative n°1 de régularisation
		refugieNonRegularise.regulariser("test");
		System.out.println(refugieNonRegularise);
		refugieNonRegularise.regulariser("simplon");
		System.out.println(refugieNonRegularise);
	}
}
