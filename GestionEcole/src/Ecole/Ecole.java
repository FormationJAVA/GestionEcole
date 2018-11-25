package Ecole;

import Person.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ecole {
	
	public ArrayList<Administrateur> admin;
	public ArrayList<Enseignant> ens;
	public ArrayList<Etudiant> etd;

	
	public Ecole ()
	{
		admin = new ArrayList<Administrateur> ();
		ens = new ArrayList<Enseignant> ();
		etd = new ArrayList<Etudiant> ();
	}
	
	public void ajouter (Administrateur a)
	{
		admin.add(a);
	}
	public void ajouter (ArrayList<Administrateur> a)
	{
		admin = a;
	}
	public float maxNote ()
	{
		Iterator <Etudiant> etdIt;
		float maxN=0.0f, tmp;
		etdIt = etd.iterator();
		while (etdIt.hasNext())
		{
			tmp=etdIt.next().note;
			maxN= tmp > maxN ? tmp : maxN;
		
		}
		return maxN;
	}
	public String toString()
	{
		String sortie="";
		
		Iterator adminIt, ensIt,etdIt;
		sortie+= "Liste des Administrateurs\n";
		adminIt = admin.iterator();
		while (adminIt.hasNext())
		{
			sortie+=adminIt.next().toString()+"\n";
		}
		sortie+= "Liste des Enseignants\n";
		ensIt = ens.iterator();
		while (ensIt.hasNext())
		{
			sortie+=ensIt.next().toString()+"\n";
		}
		sortie+= "Liste des Etudiants\n";
		etdIt = etd.iterator();
		while (etdIt.hasNext())
		{
			sortie+=etdIt.next().toString()+"\n";
		}
		
		return sortie;
	}

}
