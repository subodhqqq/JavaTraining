package Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
//File file=new File("D:\\java\\Module1\\src\\hello.txt");
//FileReader fileReader=new FileReader(file);
	public static void main(String[] args) {
		
	
	
	try {
		FileReader fileReader=new FileReader("D:\\java\\Module1\\src\\hello");
		int i;
		while((i= fileReader.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
	catch(IOException e) {
		System.out.println("exception catch");
	}
}

}