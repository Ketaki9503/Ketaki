package com.cjc.ims.app.client;

import java.util.Scanner;

import com.cjc.ims.app.servicei.Cjc;
import com.cjc.ims.app.serviceimpl.Karvenagar;

public class Test {
public static void main(String[] args)
{
	Cjc institude=new Karvenagar();
	while(true) {
		System.out.println("1.addCourse");
		System.out.println("2.viewCourse\n"
				+"3.addFaculty\n"
				+"4.viewFaculty\n"
				+"5.addBatch\n"
				+"6.viewBatch\n"
				+"7.addStudent\n"
				+"8.viewStudent\n"
				+"9.Exit");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ur choice");
		
		
		int i=sc.nextInt();{
			
			if(i==1)
			{
				
				institude.addCourse();
			}
			else if(i==2)
			{
				
				institude.viewCourse();
			}
			else if(i==3)
			{
				
				institude.addFaculty();
			}
			else if(i==4)
			{
				
				institude.viewFaculty();
			}
			else if(i==5)
			{
				
				institude.addBatch();
			}
			else if(i==6)
			{
				
				institude.viewBatch();
			}
			else if(i==7)
			{
				
				institude.addStudent();
			}
			else if(i==8)
			{
				
				institude.viewStudent();
			}
			else if(i==9)
			{
			System.exit(i);
			
			}
//			
//			else
//			{
//				System.out.println("Exit");
//
//			}

		}
	
}

}
}
