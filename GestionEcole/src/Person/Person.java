package Person;

public class Person {
	
	public String nom;
	public String prenom;
	public int age;
	
	public Person ()
	{
		this.nom= "";
		this.prenom= "";
		this.age = 0;
	}
	
	public Person (String n, String p, int a)
	{
		this.nom= n;
		this.prenom= p;
		this.age = a;
	}
	public String toString()
	{
		
		return this.prenom.substring(0,1).toUpperCase() + ", "+ this.nom.toUpperCase();
	}
	
}
