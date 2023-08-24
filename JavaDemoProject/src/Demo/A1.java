package Demo;

public class A1 
	{
		public int sum(int a, int b)
		{
		int c= a+b;
		return c;
		}
		public static void main(String [] args)
		{
		A1 a=new A1();
		int x =a.sum(100,300);
		
		System.out.println(x);
		}
	}

