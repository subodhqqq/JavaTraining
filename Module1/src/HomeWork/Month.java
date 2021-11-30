package HomeWork;

import java.util.Scanner;

public class Month {
public void month() {
	System.out.println("Enter the month the no is valid only 0-12 :");
	int m=new Scanner(System.in).nextInt();
	if(m>0 && m<=12)
	{
		switch(m) {
		case 1:
			System.out.println("january");
			break;
			
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("march");
			break;
		
		case 4:
			System.out.println("april");
			break;
		
		case 5:
			System.out.println("may");
			break;
		
		case 6:
			System.out.println("june");
			break;
		
		case 7:
			System.out.println("july");
			break;
		
		case 8:
			System.out.println("auguest");
			break;
			
		case 9:
			System.out.println("sept");
			break;
		
		case 10:
			System.out.println("oct");
			break;
		case 11:
			System.out.println("nov");
			break;
		case 12:
			System.out.println("dec");
			break;
		default:
			System.out.println("plz enter the valid month");
			break;
		}
		
		
	}
	else {
		System.out.println("plz enter the valid no");
		Month k=new Month();
		k.month();
	}
	
}
}
