package DemoPackage;

public class Array {

	public static void main(String[] args) {
		
	    int sum=0;
		
		
		int[] arr = {10, 20, 30, 40, 50};
		int[][] matrix = {
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9}
			};
		System.out.println(matrix[1][0]);

		
		for(int i:arr)
		{
			//System.out.println(i);
			sum=sum+i;
			

		}
		
		System.out.println(sum);
		
		
	}

}
