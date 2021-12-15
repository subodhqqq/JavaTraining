package FinalEx1;

public class NicAsia extends Bank {
	@Override
	 float returnintrest() {
		return 7.0f;
	}
	 public static void main (String[] args)
	 {
		 NicAsia na=new NicAsia();
		System.out.println(na.returnintrest());
		na.loan();
	 }
}
