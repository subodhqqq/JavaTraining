package ArrayExample;

import java.util.ArrayList;

import java.util.Collections;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		ArrayList<String> arrlist= new ArrayList<String>();
		arrlist.add("subodh");
		arrlist.add("muna");
		arrlist.add("babin");
		arrlist.add("hello");
		//System.out.println(arrlist.size());
		Collections.sort(arrlist);//sorting the arraylist
		System.out.println(arrlist);
//		arrlist.remove(0);
//		arrlist.remove("hello");
//		System.out.println(arrlist);
		Collections.sort(arrlist,Collections.reverseOrder());//sorting reverse
		System.out.println(arrlist);
		arrlist.set(2, "shrestha");//update arraylist
		System.out.println(arrlist);
//		
		
	}

}
