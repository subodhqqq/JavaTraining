package Assignment;

import java.util.Scanner;

public class CountString {
	public int count()
	{
		System.out.println("entert the words:");
		String a= new Scanner(System.in).nextLine();
		int num=(a.split("\\s+")).length;
		return num;
		
	}

}
