package Assignment;

import java.util.Scanner;

public class CompearString {
	public void compare() {

    System.out.println("enter the the first String:");
    String a=new Scanner(System.in).nextLine();
    System.out.println("Enter the sevcond String:");
    String b=new Scanner(System.in).nextLine();
    if(a.equals(b))
    {
    	System.out.println("true");
    }
    else
    {
    	System.out.println("false");
    }
	}
    
}
