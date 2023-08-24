package Objecttest;
import java.util.Scanner;
public class Test1 {
public void sum(int a,int b)
{
	int c=a+b;
	System.out.println(c);
	
}
public static void main(String [] args)
{
	Test1 t=new Test1();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int x=sc.nextInt();
	System.out.println("Enter the second number");
	int y=sc.nextInt();
	t.sum(x,y);
}
}
