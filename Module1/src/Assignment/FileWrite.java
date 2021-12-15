package Assignment;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("enter the some thing");
		
			Scanner sc=new Scanner(System.in);
			String text=sc.nextLine();
			FileWriter fileWriter=new FileWriter("D:\\java\\Module1\\src\\output.txt");
			fileWriter.write(text);
			fileWriter.append(text);
			fileWriter.close();
		}
		catch(IOException e) {
			System.out.println("exception catch");

	}

}
}