package decision1;

import java.util.Scanner;

public class Switch1 {

	public void grade()
	{
		
		// TODO Auto-generated method stub
		
		String grade ;
		Scanner sn= new Scanner(System.in);
		grade = sn.next();
		switch(grade)
		{
		case "A":
			System.out.println("grade is true");
			break;
			
		case "B":
			System.out.println("grade is false");
			break;
		default :
			System.out.println("hello");
			break;
			
		}

	}

}
