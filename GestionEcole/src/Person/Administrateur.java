package Person;

public class Administrateur extends Person {

	public String fonction;
	
	public Administrateur()
	{
		super();
		this.fonction = "";
	}
	
	public Administrateur(String n, String p, int a)
	{
		super(n,p,a);
		this.fonction = "";
	}
	public Administrateur(String n, String p, int a, String f)
	{
		super(n,p,a);
		this.fonction = f;
	}
	
	public String toString()
	{
		
		return super.toString()+", "+ this.fonction;
	}
}
