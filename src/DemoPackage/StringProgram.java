package DemoPackage;

public class StringProgram {

	public static void main(String[] args) {
        
		int a[]=new  int[5];//declaration and instantiation
		a[0]=10;//initialization
		a[1]=20;
		a[2]=70;
		a[3]=40;
		a[4]=50;
		//printing array
		for(int i=0;i<a.length;i++)//length is the property of array
		System.out.println(a[i]);
		 
		int arr[]= {1,2,3};
		
		
		for(int i=0;i<arr.length;i++)//length is the property of array
			System.out.println(arr[i]);
		
		 int brr[]= arr.clone();
		 
		 

			for(int i=0;i<brr.length;i++)//length is the property of array
				System.out.println(brr[i]);
			System.out.println(arr.equals(brr));
   	

		
	}

}
