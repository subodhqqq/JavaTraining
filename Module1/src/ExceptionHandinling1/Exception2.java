package ExceptionHandinling1;

public class Exception2 {
	public static  void excepation12(int age, int weigth)
	{
		if( age>12 && weigth<40)
		{
			throw new ArithmeticException("not eglible age and weight");
			
		}
		else
		{
			System.out.println("eligble");
		}
	}

}
