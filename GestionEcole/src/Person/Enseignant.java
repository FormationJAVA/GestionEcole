package Person;

public class Enseignant extends Person {
	
	public String matiere;
	
	public Enseignant()
	{
		super();
		this.matiere = "";
	}
	
	public Enseignant(String n, String p, int a)
	{
		super(n,p,a);
		this.matiere = "";
	}
	
	public Enseignant(String n, String p, int a, String m)
	{
		super(n,p,a);
		this.matiere = m;
	}

	public String toString()
	{
		
		return super.toString()  +", "+ this.matiere;
	}
}
