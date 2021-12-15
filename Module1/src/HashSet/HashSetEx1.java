package HashSet;

import java.util.HashSet;

public class HashSetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HashSet <String> hs=new HashSet<String>();
  hs.add("hello");
  hs.add("subodh");
  hs.add("shrestha");
  hs.add("mohan");
  hs.add("hello");
  System.out.println(hs);
  System.out.println(hs.size());
  System.out.println(hs.isEmpty());
  
  HashSet clone=new HashSet();
  clone =(HashSet)hs.clone();
  System.out.println("after clone"+clone);
  System.out.println(hs.remove("mohan"));
  
  
  
	}

}
