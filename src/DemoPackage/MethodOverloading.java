package DemoPackage;


public class MethodOverloading {
	int a;
	int b;
	int c;

	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {
		System.out.println(a+b+c);

	}
	void add(int a,double c) {
		System.out.println(a+c);

	}
	
	
	public static void main(String[] args) {
		
		MethodOverloading m=new MethodOverloading();
		m.add(10,30);
		m.add(10, 20,30);
		m.add(10, 10.5);
	}

}
