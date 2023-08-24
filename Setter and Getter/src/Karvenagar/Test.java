package Karvenagar;
import java.util.Scanner;

public class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter model mid: ");
		

		System.out.println("Enter model mname: ");
		
		System.out.println("Enter model prize: ");
		
		Laptop a= new Laptop(sc.nextInt(),sc.next(),sc.nextDouble());

		System.out.println(a.mid);
		System.out.println(a.mname);
		System.out.println(a.prize);
	}
}
		