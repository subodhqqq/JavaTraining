package decision1;

public class breakContinue {
	public void brk()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			if(i==3)
			{
				System.out.println("stop");
				break;
			}
		}
	}
	
public void con() {
	for(int i=0;i<10;i++)
	{
		System.out.println(i);
		if(i==3)
		{
			System.out.println("continue");
			continue ;
		}
	}
	
}
}
