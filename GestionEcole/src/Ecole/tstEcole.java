package Ecole;
import Person.*;
public class tstEcole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ecole ec = new Ecole();
		
		ec.admin.add(new Administrateur("Nom", "Prenom",30, "Secretaire"));
		ec.admin.add(new Administrateur("Nom", "Prenom",45, "Directeur"));
		
		ec.ens.add(new Enseignant("Nom", "Prenom",45, "JAVA"));
		ec.ens.add(new Enseignant("Nom", "Prenom",25, "C++"));
		ec.ens.add(new Enseignant("Nom", "Prenom",42, "python"));
		
		
		ec.etd.add(new Etudiant ("Nom", "Prenom", 19, 13.0f));
		ec.etd.add(new Etudiant ("Nom", "Prenom", 23, 15.0f));
		ec.etd.add(new Etudiant ("Nom", "Prenom", 20, 5.0f));
		ec.etd.add(new Etudiant ("Nom", "Prenom", 24, 18.0f));
		ec.etd.add(new Etudiant ("Nom", "Prenom", 21, 6.0f));
		
		
		System.out.println(ec);
		System.out.println(ec.maxNote());
	}

}
