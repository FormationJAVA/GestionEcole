package Person;

public class Etudiant extends Person{

	public float note;
	
	public Etudiant()
	{
		super();
		this.note = 0.0f;
	}
	
	public Etudiant(String n, String p, int a)
	{
		super(n,p,a);
		this.note = 0.0f;
	}
	
	public Etudiant(String n, String p, int a, float f)
	{
		super(n,p,a);
		this.note = f;
	}
	public String toString()
	{
		
		return super.toString() + ", "+ this.note;
	}
	
}
