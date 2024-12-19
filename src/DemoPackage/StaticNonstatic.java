package DemoPackage;

public class StaticNonstatic {
	int a=10;
	static int b=20;
	
	static void add1() 
	{
		System.out.println(b);

	}
	void add2() 
	{
		System.out.println(a);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(b);
		add1();
		StaticNonstatic sn=new StaticNonstatic();
		sn.add2();

		System.out.println(sn.a);


	}

}
