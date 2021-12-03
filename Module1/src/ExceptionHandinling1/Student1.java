package ExceptionHandinling1;

public class Student1 {
	public static void main(String[] args)
	{
		try {
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("cannot divide by zero");
			
		}
		finally
		{
			System.out.println("this is finally block");
		}
	}
	
}
