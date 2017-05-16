public class Programme {
	public static void main(String[] args) {
		// création
		Personne formateur = new Personne("Hovart", "Nicolas");
		Personne moi = new Personne("Siber", "Eric", 34);
		moi.initialiserAdresse(new Adresse(null, null, 78500, "Sartrouville"));
		moi.setAge(35);
		Refugie refugieRegularise = new Refugie("Jean", "Durand", 23, true);
		Refugie refugieNonRegularise = new Refugie("Michelle", "Blanche");
		refugieNonRegularise.initialiserAdresse(new Adresse("13",
				"rue des fleurs", 75001, "Paris"));

		// affichage
		System.out.println(moi);
		System.out.println(formateur);
		System.out.println(refugieRegularise);
		System.out.println(refugieNonRegularise);

		// tentative de modification d'éléments d'adresse
		Adresse adresseCouranteMoi = moi.getAdresse();
		moi.demenager(new Adresse("105", adresseCouranteMoi.getNomVoie(),
				adresseCouranteMoi.getCodePostal(), adresseCouranteMoi
						.getVille()));
		Adresse nouvelleAdresseRefugie = new Adresse(null, null, 0, "Marseille");
		refugieRegularise.demenager(nouvelleAdresseRefugie);

		// tentative déménagement réfugié non régularisé
		Adresse adresseCible = new Adresse("1", "rue des lilas", 92400,
				"Courbevoie");
		boolean resultatTentative1 = refugieNonRegularise
				.demenager(adresseCible);
		System.out.println("Résultat du déménagement : " + resultatTentative1);
		System.out.println("Code postal du réfugié : "
				+ refugieNonRegularise.getAdresse().getCodePostal());

		// tentative n°1 de régularisation
		refugieNonRegularise.regulariser("test");
		System.out.println(refugieNonRegularise);
		refugieNonRegularise.regulariser("simplon");
		System.out.println(refugieNonRegularise);

		// déménagement complet
		boolean resultatTentative2 = refugieNonRegularise
				.demenager(adresseCible);
		System.out.println("Résultat du déménagement : " + resultatTentative2);
		System.out.println("Code postal du réfugié : "
				+ refugieNonRegularise.getAdresse().getCodePostal());
	}
}
