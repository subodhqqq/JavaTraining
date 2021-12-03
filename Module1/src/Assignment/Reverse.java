package Assignment;

import java.util.Scanner;

public class Reverse {
	public void rev() {
		System.out.println("enter the String which you want reverse the String :");
		String a= new Scanner(System.in).nextLine();
        StringBuilder ab = new StringBuilder();
 
        ab.append(a);
 
       
        ab.reverse();
 
       
        System.out.println(ab);
	}

}
