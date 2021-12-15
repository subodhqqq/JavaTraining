package superkeywordEx;

public class Dog extends SuperKeyEx{
	int id;
public Dog(String colour,int id) {
		super(colour);
		this.id=id;
		//System.out.println(colour);
		// TODO Auto-generated constructor stub
	}

//String colour ="white";

void display() {
//	System.out.println("derive class colour  "+colour);
//
//	System.out.println("parant class colour  "+super.colour);
//	super.animal("cat");
	System.out.println(colour+id);
}
}
