package HomeWork;

import java.util.Scanner;

public class SeeResult {
	public void result() {
    int math,eng,nep,sci;
	//math=new Scanner(System.in).nextInt();
	System.out.println("enter the no of math : ");
	math=new Scanner(System.in).nextInt();
	System.out.println("enter the no of english : ");
	eng=new Scanner(System.in).nextInt();
	System.out.println("enter the no oe nepali : ");
	nep=new Scanner(System.in).nextInt();
	
	System.out.println("enter the no of science ");
	sci=new Scanner(System.in).nextInt();
	 
		
		if(math>=40 && eng>=40 && nep>=40 && sci>=40)
		
		{
			System.out.println(" Pass the Student");
		
	
	

		int total=math+eng+nep+sci;
		double div=total/4;
		{
		if(div>=80 && div<100)
		{
			System.out.println("you persention is :"+div);
			System.out.println("congratulation you are pass in distidation.");
		}
		else if(div>=60 && div<80) {
			System.out.println("you persention is :"+div);
			System.out.println("congaratulation you are pass in first division.");
			
		}
        else if(div>=50 && div<60) {
        	System.out.println("you persention is :"+div);
        	System.out.println("congratulation you are pass in second division.");
			
		}
        else if(div>=40 && div<50) {
        	System.out.println("you persention is :"+div);
        	System.out.println("congratulation you are pass in third division.");
			
		}
        else
        {
        	System.out.println("sorry your result is no publice.");
        }
		}
	}
		else
		{
			System.out.println("your result is not publiced .");
		}
	}

}
