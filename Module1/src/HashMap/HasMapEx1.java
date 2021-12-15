package HashMap;

import java.util.HashMap;

public class HasMapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <Integer,String> hp=new HashMap<Integer,String>();
		hp.put(1, "subodh");
		hp.put(12, "hariram");
		System.out.println(hp);
		hp.replace(1, "hello");
		System.out.println(hp);
		hp.remove(1);
		System.out.println(hp);
		hp.clear();
		System.out.println("clare all"+hp);
		
		

	}

}
