package javaBean;

import java.io.Serializable;

public class JavaBeanEx implements Serializable{
	private String bankName;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private int id;
	public JavaBeanEx() {
		
	}
	public static void main(String[] args)
	{
		JavaBeanEx jb=new JavaBeanEx();
		jb.setBankName("Nic Asia");
	System.out.println(jb.getBankName());
		
	}

	

}
