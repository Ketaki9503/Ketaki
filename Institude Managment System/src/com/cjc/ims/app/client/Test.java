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
		
		
		int i=sc.nextInt();
		
		
		
		switch (i)
		{
		case 1:
			institude.addCourse();
			break;
			
		case 2:
			institude.viewCourse();
			break;
			
		case 3:
			institude.addFaculty();
			break;
			
		case 4:
			institude.viewFaculty();
			break;
			
		case 5:
			institude.addBatch();
			break;
			
		case 6:
			institude.viewBatch();
			break;
			
		case 7:
			institude.addStudent();
			break;
			
		case 8:
			institude.viewStudent();
			
		default :
			System.out.println("Exit from application");
			break;
			
		}
		
	}
}
}	
			
			
				




