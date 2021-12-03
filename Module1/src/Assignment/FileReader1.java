package Assignment;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
public void fec() throws IOException
{
	FileReader fr= new FileReader("D:\\java");
	int i;    
    while((i=fr.read())!=-1)    
    System.out.print((char)i);    
    fr.close();
	
}

	
}

