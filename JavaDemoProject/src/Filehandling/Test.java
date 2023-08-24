package Filehandling;

import java.io.File;
import java.io.IOException;
public class Test {
	
	public static void main(String [] args)throws Exception 
	{
		File f=new File("abc.txt");
		boolean b=f.createNewFile();
		if(b==true)
		{
			System.out.println("File create successfully"+f.getName());
		}
		else
		{
			System.out.println("File not create");
			
		}
		
	}

}
