package ConOver;

public class StaticVer {
	int id;
	String name;
	static String college="dwit";
	public StaticVer(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
  public void display()
  {
	  
	  System.out.println("Student name:"+name);
	  System.out.println("Student id:"+id);
	  System.out.println("college name is:"+ college);
  }
}
