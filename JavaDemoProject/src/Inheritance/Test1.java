package Inheritance;

public class Test1 {
	public static void main(String args [])
	{
		A1 a=new A1();
			a.m3();
			a.m4();
			
		B1 b=new B1();
			b.	m1();
			b.	m3();
			
		C1 c=new C1();
			c.m4();
			c.m3();
		D  d=new D();
			d.m1();
			d.m2();
			d.m3();
		
		A1 a1=new C1();
			a1.m3();
			a1.m4();
		A1 a2=new B1();
			a2.m3();
			a2.m4();
		B1 b1=new D();
			b1.m1();
			b1.m3();
			b1.m4();
			System.out.println(a.x);
			System.out.println(a.y);
			System.out.println(a.z);
			System.out.println(b.x);
			System.out.println(b.y);
			System.out.println(b.z);
			System.out.println(c.x);
			System.out.println(c.y);
			System.out.println(c.z);
	}
}
