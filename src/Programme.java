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
		refugieNonRegularise.initialiserAdresse("13", "rue des fleurs", 75001,
				"Paris");

		// affichage
		System.out.println(moi);
		System.out.println(formateur);
		System.out.println(refugieRegularise);
		System.out.println(refugieNonRegularise);

		// tentative de modification d'éléments d'adresse
		moi.setNumeroVoie("105");
		refugieRegularise.setVille("Marseille");
		try {
			refugieNonRegularise.setCodePostal(75002);
		} catch (UnsupportedOperationException e) {
			System.out.println("Impossible de changer le code postal : "
					+ e.getMessage());
		}
		// tentative déménagement complet
		boolean resultatTentative1 = refugieNonRegularise.demenager("1",
				"rue des lilas", 92400, "Courbevoie");
		System.out.println("Résultat du déménagement : " + resultatTentative1);
		System.out.println("Code postal du réfugié : "
				+ refugieNonRegularise.getCodePostal());

		// tentative n°1 de régularisation
		refugieNonRegularise.regulariser("test");
		System.out.println(refugieNonRegularise);
		refugieNonRegularise.regulariser("simplon");
		System.out.println(refugieNonRegularise);

		// nouvelle tentative de modification d'éléments d'adresse
		refugieNonRegularise.setCodePostal(75002);
		System.out.println("Code postal du réfugié : "
				+ refugieNonRegularise.getCodePostal());

		// déménagement complet
		boolean resultatTentative2 = refugieNonRegularise.demenager("1",
				"rue des lilas", 92400, "Courbevoie");
		System.out.println("Résultat du déménagement : " + resultatTentative2);
		System.out.println("Code postal du réfugié : "
				+ refugieNonRegularise.getCodePostal());
	}
}
