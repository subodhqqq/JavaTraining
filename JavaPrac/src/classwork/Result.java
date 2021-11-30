package classwork;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumTwoNo sw=new SumTwoNo();
		Time t= new Time();
		System.out.println(t.converter(3));
		
		System.out.println(sw.sumoftwono(3, 2));
		Increment1 i= new Increment1();
		System.out.println(i.add1(9));
		
		Equal eq=new  Equal();
		System.out.println(eq.equal(2, 3));
		Hello h= new Hello();
		h.hello("subodh");

	}

}
