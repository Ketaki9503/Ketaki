package Demo;

public class Test
{
		public static void main(String[] args)
		{
			B a=new B();
			a.x=100;
			a.display();
			B a1=new B();
			a1.x=300;
			a1.display();
			System.out.println(a.x);
			System.out.println(a1.x);
		}
}

