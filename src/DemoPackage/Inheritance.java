package DemoPackage;

class A{
	 int a;
	    int b;
	    void show() 
	    {
	    System.out.println(a+b);
	    }
}
class B extends A{
	 int x;
	 int y;
	    void display()
	    {
	    System.out.println(x+y);
	    }
}

public class Inheritance {

	public static void main(String[] args) {
		
		
		B obj2=new B();
		obj2.x=100;
		obj2.y=200;
		obj2.display();
		obj2.a=100;
		obj2.b=200;
		obj2.show();
   
		
	}

}
