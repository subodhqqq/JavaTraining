package ScannerPro;

import java.util.Scanner;

public class Password {
	public void pass() {
		String a;
		System.out.println("enter your password :");
		Scanner b= new Scanner(System.in);//.nextLine();
		a=b.next();
		if(a.equals("java"))
		{
			System.out.println("welcome ");
		}
		else {
			System.out.println("your password is worng");
		}
		
	}

}
