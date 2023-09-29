package com.cjc.ims.app.serviceimpl;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cjc.ims.app.model.Batch;
import com.cjc.ims.app.model.Course;
import com.cjc.ims.app.model.Faculty;
import com.cjc.ims.app.model.Student;
import com.cjc.ims.app.servicei.Cjc;

public class Karvenagar implements Cjc
{
	int count;
	Scanner sc;
	Scanner s;
	List<Course>clist=new ArrayList<>();
	List<Faculty>flist=new ArrayList<>();
	List<Batch>blist=new ArrayList<>();
	List<Student>slist=new ArrayList<>();
	

	public void addCourse()
	{
		Course c=new Course();
		sc=new Scanner(System.in);
		s=new Scanner(System.in);
		System.out.println("Enter the course id");
		int x;
		try {
			x=sc.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println("Please enter integer value");
			x=s.nextInt();
			
		}
		c.setCid(x);
		System.out.println("Enter the course name");
		String s1=s.next()+s.nextLine();
		c.setCname(s1);
		clist.add(c);
		
	}
	public void viewCourse()
	{
		Iterator<Course> itr=clist.iterator();
		int count=0;
		while(itr.hasNext())
		{
			count=count+1;
			System.out.println("Course no:-"+count);
			Course x=itr.next();
			System.out.println("Course id:- "+x.getCid());
			System.out.println("Course name:- "+x.getCname());
			System.out.println("*********************");
		}
	}
	//------------------------------------------------------------------	
		
		public void addFaculty()
		{
			Faculty f=new Faculty();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the faculty id");
			int x;
			try {
				x=sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("Please enter integer value");
				x=s.nextInt();
				}
			f.setFid(x);
			
			 System.out.println("Enter the Faculty name");
				String s= sc.next()+sc.nextLine();
				 f.setFname(s);
				 
				// System.out.println("Enter your the faculty no ");
					viewCourse();
					 System.out.println("Enter the Course id for Faculty");
					int x2=sc.nextInt();
					Iterator<Course> citr=clist.iterator();
					while(citr.hasNext())
					{
						Course course=(Course)citr.next();
					
						if (x2==course.getCid())
						{
							f.setCourse(course);
						}
					}
				 
				 flist.add(f);
			 }
			

		
			
		public void viewFaculty()
		{
			Iterator<Faculty> itr1=flist.iterator();
			int count=0;
			while(itr1.hasNext())
			{
				count=count+1;
				System.out.println("Faculty no:-"+count);
				Faculty y=itr1.next();
				System.out.println("Faculty id:- "+y.getFid());
				System.out.println("Faculty name:- "+y.getFname());
				System.out.println("Faculty course id:- "+y.getCourse().getCid());
				System.out.println("Faculty course name:- "+y.getCourse().getCname());
				System.out.println("*****************");
				
				
			}
	}
//----------------------------------------------------------------------
	
	 public void addBatch()
	 {
		 Batch b=new Batch();
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter the Batch id");
		// b.setBid(sc.nextInt());
		 
		 int x;
			try {
				x=sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("Please enter integer value");
				x=s.nextInt();
				
			}
			b.setBid(x);

		 
		 System.out.println("Enter the Batch name");
		 String s2=sc.next()+sc.nextLine();
		 b.setBname(s2);
		 System.out.println("Enter your the Faculty no ");
			viewFaculty();
			 System.out.println("Enter the Faculty for batch");
			int x1=sc.nextInt();
			Iterator<Faculty> fitr=flist.iterator();
			while(fitr.hasNext())
				
			{
				Faculty faculty=(Faculty)fitr.next();
			for(int i=0;i<=x1;i++)
			{
				if (x1==i)
			{
			b.setFaculty(flist.get(i-1));
		}
			}
			}
		
		 blist.add(b);
	 }
	 public void viewBatch()
	 {
		 Iterator<Batch>itr2=blist.iterator();
		 int count=0;
		 while(itr2.hasNext())
		 {
			 count=count+1;
				System.out.println("Batch no:-"+count);
			 Batch z=itr2.next();
			 System.out.println("Batch id:- "+z.getBid());
			 System.out.println("Batch name:- "+z.getBname());
			 System.out.println("Batch Faculty id:- "+z.getFaculty().getFid());
			 System.out.println("Batch Faculty name:- "+z.getFaculty().getFname());
			 System.out.println("Batch Faculty course id:- "+z.getFaculty().getCourse().getCid());
			 System.out.println("Batch Faculty course name:- "+z.getFaculty().getCourse().getCname());
			 System.out.println("*****************");
			 	 
		 }
	 }
//------------------------------------------------------------------------
	 public void addStudent()
	 {
		 Student stu=new Student();
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter the Student id");
		// stu.setSid(sc.nextInt());
		 
		 int x;
			try {
				x=sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("Please enter integer value");
				x=s.nextInt();
				
			}
			stu.setSid(x);

		 
		 System.out.println("Enter the Student name");
		String s3= sc.next()+sc.nextLine();
		 stu.setSname(s3);
		 
		// System.out.println("Enter your the Batch no ");
			viewBatch();
			 System.out.println("Enter the batch no");
			int x2=sc.nextInt();
			Iterator<Batch> bitr=blist.iterator();
			while(bitr.hasNext())
			{
				Batch batch=(Batch)bitr.next();
			for(int i=0;i<=x2;i++)
			{
				if (x2==i)
				{
					stu.setBatch(blist.get(i-1));
				}
			}
			}	 
		 slist.add(stu);
	 }
	 
	 public void viewStudent()
	 {
		 Iterator<Student>itr3=slist.iterator();
		 int count=0;
		 while(itr3.hasNext())
		 {
			 count=count+1;
				System.out.println("Student no:-"+count);
			 Student nm=itr3.next();
			 System.out.println("Student id:- "+nm.getSid());
			 System.out.println("Student name:- "+nm.getSname());
			 System.out.println("Student Batch id:- "+nm.getBatch().getBid());
			 System.out.println("Student Batch name:- "+nm.getBatch().getBname());
			 System.out.println("Student Batch Faculty id:- "+nm.getBatch().getFaculty().getFid());
			 System.out.println("Student Batch Faculty name:- "+nm.getBatch().getFaculty().getFname());
			 System.out.println("****************");
			
			 	 
		 }
	 }
}
