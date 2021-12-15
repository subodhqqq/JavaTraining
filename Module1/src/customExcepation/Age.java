package customExcepation;

public class Age  {
	public void age(int a) throws AgeException{
	if(a>18) {
	  throw new AgeException("this is custom exception");
		}
	else {
		System.out.println("valid age");
		}
	}

}
