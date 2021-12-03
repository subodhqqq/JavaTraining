package ExceptionHandinling1;

public class Excepation3 {
	void method1() throws ArithmeticException
	{
		throw new ArithmeticException("this is arithemetic exceparion");
		
	}

	void method2() throws ArithmeticException
	{
		method1();
	}
	void method3()
	{
		try
		{
			method2();
		}
		catch(ArithmeticException e)
		{
			System.out.println("hello");
		}
	}
}
